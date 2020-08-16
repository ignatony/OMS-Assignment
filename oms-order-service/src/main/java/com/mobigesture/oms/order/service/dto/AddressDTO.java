/**
 * 
 */
package com.mobigesture.oms.order.service.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

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
public class AddressDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private String houseNo;
	private String street;
	private String city;
	private String country;
	private String pin;

}
