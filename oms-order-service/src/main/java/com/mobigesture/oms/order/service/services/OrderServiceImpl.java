/**
 * 
 */
package com.mobigesture.oms.order.service.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobigesture.oms.order.service.client.ItemClient;
import com.mobigesture.oms.order.service.constant.StatusConstants;
import com.mobigesture.oms.order.service.dto.OrderDTO;
import com.mobigesture.oms.order.service.exception.OrderNotFoundException;
import com.mobigesture.oms.order.service.model.Order;
import com.mobigesture.oms.order.service.model.Product;
import com.mobigesture.oms.order.service.repository.OrderRepository;
import com.mobigesture.oms.order.service.utils.ObjectMapperUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ignat
 *
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
	@Autowired
	ItemClient itemClient;

	@Autowired
	OrderRepository orderRepository;

	/**
	 *
	 */
	@Override
	public void createOrder(Order order) throws OrderNotFoundException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		log.info("Inside createOrder Service method {}", order.toString());
		long generatedLong = System.currentTimeMillis();
		List<Product> products = order.getOrderItems();
		if (products != null && !products.isEmpty()) {
			for (Product pro : products) {
				pro.setOrderId(generatedLong);
			}
		} else {
			throw new OrderNotFoundException(StatusConstants.HttpConstants.INTERNAL_SERVER_ERROR);
		}
		itemClient.createAllItem(products);
		OrderDTO orderDTO = ObjectMapperUtils.map(order, OrderDTO.class);
		orderDTO.setId(generatedLong);

		Date date = new Date();
		String stringDate = sdf.format(date);
		orderDTO.setOrderDate(stringDate);
		orderRepository.save(orderDTO);
	}

	/**
	 *
	 */
	@Override
	public List<Order> retriveOrder() throws OrderNotFoundException {
		log.info("Inside Service layer retriveOrder() ");
		List<OrderDTO> ordersDTO = orderRepository.findAll();
		List<Order> orders = new ArrayList<>();
		for (OrderDTO ord : ordersDTO) {
			List<Product> orderItem = itemClient.retriveOrderById(ord.getId());
			Order order = ObjectMapperUtils.map(ord, Order.class);
			if (orderItem != null && !orderItem.isEmpty()) {
				order.setOrderItems(orderItem);
				order.setTotal(totalCal(orderItem));
			}
			orders.add(order);

		}
		return orders;
	}

	/**
	 * @param orderItem
	 * @return
	 */
	private double totalCal(List<Product> orderItem) {
		double total = 0;
		for (Product pro : orderItem) {
			total = total + (pro.getQuantity() * pro.getPrice());
		}
		return total;
	}
}
