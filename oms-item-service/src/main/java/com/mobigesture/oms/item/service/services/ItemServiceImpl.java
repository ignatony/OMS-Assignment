package com.mobigesture.oms.item.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobigesture.oms.item.service.dto.ProductDTO;
import com.mobigesture.oms.item.service.exception.ItemNotFoundException;
import com.mobigesture.oms.item.service.model.Product;
import com.mobigesture.oms.item.service.repository.ItemRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ignat
 *
 */
@Slf4j
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	/**
	 *
	 */
	@Override
	public void createOrderItem(ProductDTO product) throws ItemNotFoundException {
		log.info("inside createOrderItem() {}", product.toString());
		itemRepository.save(product);

	}

	/**
	 *
	 */
	@Override
	public void createAllOrderItem(List<ProductDTO> listProduct) throws ItemNotFoundException {
		log.info("inside createAllOrderItem() ");
		itemRepository.saveAll(listProduct);
	}

	/**
	 *
	 */
	@Override
	public List<ProductDTO> retriveOrderItem() throws ItemNotFoundException {
		log.info("inside retriveOrderItem() ");
		return itemRepository.findAll();
	}

	/**
	 *
	 */
	@Override
	public List<ProductDTO> retriveOrderItemById(long orderId) throws ItemNotFoundException {
		log.info("inside retriveOrderItem() orderId : {}", orderId);
		return itemRepository.findOrderItemById(orderId);
	}

}
