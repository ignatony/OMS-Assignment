/**
 * 
 */
package com.mobigesture.oms.item.service.model;

import com.mobigesture.oms.item.service.constant.ResponseStatusConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ignat
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Status {

	public Integer code;

	public String message;

	/**
	 * @param httpConstants
	 */
	public Status(ResponseStatusConstants.HttpConstants httpConstants) {
		this.code = httpConstants.getCode();
		this.message = httpConstants.getDesc();
	}
}
