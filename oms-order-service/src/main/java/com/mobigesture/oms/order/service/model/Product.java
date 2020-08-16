/**
 * 
 */
package com.mobigesture.oms.order.service.model;





import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ignat
 *
 */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	//@NotBlank(message = "{product.code.not-null}")
	//@Size(min = 3, max = 10, message = "{product.code.size}")
	private String productCode;

	//@NotBlank(message = "{product.name.not-null}") 
	private String productName;

	@NotNull(message = "{product.quantity.not-null}")
	private int quantity;
	private double price;
	private long orderId;

}
