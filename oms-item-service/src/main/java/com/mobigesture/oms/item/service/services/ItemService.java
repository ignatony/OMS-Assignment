/**
 * 
 */
package com.mobigesture.oms.item.service.services;

import java.util.List;

import com.mobigesture.oms.item.service.dto.ProductDTO;
import com.mobigesture.oms.item.service.exception.ItemNotFoundException;

/**
 * @author ignat
 *
 */
public interface ItemService {
	
	/**
	 * @param listProduct
	 * @throws ItemNotFoundException
	 */
	public void createAllOrderItem(List<ProductDTO> listProduct) throws ItemNotFoundException;
	
	/**
	 * @param product
	 */
	public void createOrderItem(ProductDTO product) throws ItemNotFoundException;
	
	/**
	 * @return
	 */
	public List<ProductDTO> retriveOrderItem() throws ItemNotFoundException;
	
	/**
	 * @return
	 */
	public List<ProductDTO> retriveOrderItemById(long orderId) throws ItemNotFoundException;
	

}
