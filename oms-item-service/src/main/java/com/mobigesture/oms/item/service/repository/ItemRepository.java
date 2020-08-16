package com.mobigesture.oms.item.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobigesture.oms.item.service.dto.ProductDTO;

/**
 * @author ignat
 *
 */
@Repository
public interface ItemRepository extends CrudRepository<ProductDTO, String> {

	/**
	*
	*/
	List<ProductDTO> findAll();

	/**
	 * @param id
	 * @return
	 */
	@Query("select p from ProductDTO p where p.orderId = ?1")
	List<ProductDTO> findOrderItemById(long id);

}
