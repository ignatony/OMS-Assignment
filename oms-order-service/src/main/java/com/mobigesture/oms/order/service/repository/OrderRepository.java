/**
 * 
 */
package com.mobigesture.oms.order.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mobigesture.oms.order.service.dto.OrderDTO;

/**
 * @author ignat
 *
 */
public interface OrderRepository extends CrudRepository<OrderDTO, Long> {

	/**
	*
	*/
	List<OrderDTO> findAll();

}
