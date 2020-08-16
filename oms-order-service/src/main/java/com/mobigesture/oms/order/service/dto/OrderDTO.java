package com.mobigesture.oms.order.service.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class OrderDTO {
	@Id
	private long id;
	private String customerName;
	private String orderDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private AddressDTO shippingAddress;

}
