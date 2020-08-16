package com.mobigesture.oms.order.service.exception;

import com.mobigesture.oms.order.service.constant.StatusConstants;

import lombok.Getter;

/**
 * @author ignat
 *
 */
@Getter
public class CanNotGetResponseException extends RuntimeException {

	private StatusConstants.HttpConstants status;

	/**
	 * @param status
	 */
	public CanNotGetResponseException(StatusConstants.HttpConstants status) {
		super(status.getDesc(), null);
		this.status = status;
	}
}