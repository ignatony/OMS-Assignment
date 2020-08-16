/**
 * 
 */
package com.mobigesture.oms.item.service.exception;

import com.mobigesture.oms.item.service.constant.ResponseStatusConstants;

import lombok.Getter;

/**
 * @author ignat
 *
 */
@Getter
public class ItemNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ResponseStatusConstants.HttpConstants status;

	/**
	 * @param status
	 */
	public ItemNotFoundException(ResponseStatusConstants.HttpConstants status) {
		super(status.getDesc(), null);
		this.status = status;
	}

}
