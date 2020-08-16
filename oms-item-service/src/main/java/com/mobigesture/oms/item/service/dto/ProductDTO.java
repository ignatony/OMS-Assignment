package com.mobigesture.oms.item.service.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ignat
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class ProductDTO {
	@Id
	private String productCode;
	private String productName;
	private int quantity;
	private double price;
	private long orderId;

}
