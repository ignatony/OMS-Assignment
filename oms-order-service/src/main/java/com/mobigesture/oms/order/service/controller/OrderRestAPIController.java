package com.mobigesture.oms.order.service.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobigesture.oms.order.service.model.Order;
import com.mobigesture.oms.order.service.services.OrderService;

/**
 * @author ignat
 *
 */
@RestController
@RequestMapping(path = "/api/order")
public class OrderRestAPIController {

	@Autowired
	OrderService orderService;

	/**
	 * @param order
	 * @return
	 */
	@PostMapping(path = "/create")
	public ResponseEntity<String> createOrder(@Valid @RequestBody Order order) {
		String success = " Order created Successfully !!";
		orderService.createOrder(order);
		return new ResponseEntity<String>(success, HttpStatus.OK);

	}

	/**
	 * @return
	 */
	@GetMapping(path = "/retrive")
	public List<Order> retriveOrder() {
		return orderService.retriveOrder();

	}

}
