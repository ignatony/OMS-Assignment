package com.mobigesture.oms.order.service.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
	
	private String customerName;
	private String orderDate;
	private Address shippingAddress;
	private  List<Product> orderItems;
	private double total;
	

}
