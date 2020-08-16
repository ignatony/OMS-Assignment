package com.mobigesture.oms.order.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
	private String houseNo;
	private String street;
	private String city;
	private String country;
	private String pin;
	

}
