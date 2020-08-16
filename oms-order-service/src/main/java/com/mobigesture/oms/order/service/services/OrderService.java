/**
 * 
 */
package com.mobigesture.oms.order.service.services;

import java.util.List;

import com.mobigesture.oms.order.service.exception.OrderNotFoundException;
import com.mobigesture.oms.order.service.model.Order;

/**
 * @author ignat
 *
 */
public interface OrderService {
	
	/**
	 * @param order
	 * @throws OrderNotFoundException
	 */
	void createOrder(Order order) throws OrderNotFoundException; 
	
	/**
	 * @return
	 * @throws OrderNotFoundException
	 */
	List<Order> retriveOrder() throws OrderNotFoundException; 

}
