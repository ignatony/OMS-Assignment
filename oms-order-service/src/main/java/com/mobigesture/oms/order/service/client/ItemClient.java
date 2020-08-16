/**
 * 
 */
package com.mobigesture.oms.order.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mobigesture.oms.order.service.model.Product;

/**
 * @author ignat
 *
 */
@FeignClient(name = "item-client", url = "${feign.url}")
public interface ItemClient {
	/**
	 * @return
	 */
	@RequestMapping(path = "/retrive")
	public List<Product> retriveOrder();

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(path = "/retrive/{id}")
	public List<Product> retriveOrderById(@PathVariable("id") long id);

	/**
	 * @param products
	 */
	@RequestMapping(path = "/createAll", method = RequestMethod.POST)
	void createAllItem(List<Product> products);

}
