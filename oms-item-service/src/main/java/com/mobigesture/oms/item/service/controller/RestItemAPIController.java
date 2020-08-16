package com.mobigesture.oms.item.service.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobigesture.oms.item.service.dto.ProductDTO;
import com.mobigesture.oms.item.service.model.Product;
import com.mobigesture.oms.item.service.services.ItemService;
import com.mobigesture.oms.item.service.utils.ObjectMapperUtils;

@RestController
@RequestMapping(path = "/api/item")
public class RestItemAPIController {
	@Autowired
	ItemService itemService;

	@PostMapping(path = "/create")
	public ResponseEntity<String> newOrder(@Valid @RequestBody Product product) {
		String success = " Product created Successfully !!";
		itemService.createOrderItem(ObjectMapperUtils.map(product, ProductDTO.class));
		return new ResponseEntity<String>(success, HttpStatus.OK);
	}

	@PostMapping(path = "/createAll")
	public ResponseEntity<String> newOrder(@Valid @RequestBody List<Product> productList) {
		String success = " Products created Successfully !!";
		itemService.createAllOrderItem(ObjectMapperUtils.mapAll(productList, ProductDTO.class));
		return new ResponseEntity<String>(success, HttpStatus.OK);
	}

	@GetMapping(path = "/retrive")
	public List<Product> retriveOrder() {
		return ObjectMapperUtils.mapAll(itemService.retriveOrderItem(), Product.class);
	}

	@GetMapping(path = "/retrive/{id}")
	public List<Product> retriveOrderById(@PathVariable("id") long id) {
		return ObjectMapperUtils.mapAll(itemService.retriveOrderItemById(id), Product.class);
	}

}
