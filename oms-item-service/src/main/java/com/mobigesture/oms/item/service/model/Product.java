/**
 * 
 */
package com.mobigesture.oms.item.service.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author ignat
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

	// @NotBlank(message = "{product.code.not-null}")
	// @Size(min = 3, max = 10, message = "{product.code.size}")
	private String productCode;

	// @NotBlank(message = "{product.name.not-null}")
	private String productName;

	@NotNull(message = "{product.quantity.not-null}")
	private int quantity;
	
	private double price;

	private long orderId;

}
