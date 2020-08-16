package com.mobigesture.oms.item.service.exception;

import com.mobigesture.oms.item.service.constant.ResponseStatusConstants;

import lombok.Getter;

/**
 * @author ignat
 *
 */
@Getter
public class ConnectionTimeoutException extends Exception {

	private ResponseStatusConstants.HttpConstants status;

	/**
	 * @param status
	 */
	public ConnectionTimeoutException(ResponseStatusConstants.HttpConstants status) {
		super(status.getDesc(), null);
		this.status = status;
	}
}