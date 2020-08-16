package com.mobigesture.oms.item.service.exception;

import com.mobigesture.oms.item.service.constant.ResponseStatusConstants;

import lombok.Getter;

/**
 * @author ignat
 *
 */
@Getter
public class CanNotGetResponseException extends RuntimeException {

	private ResponseStatusConstants.HttpConstants status;

	/**
	 * @param status
	 */
	public CanNotGetResponseException(ResponseStatusConstants.HttpConstants status) {
		super(status.getDesc(), null);
		this.status = status;
	}
}