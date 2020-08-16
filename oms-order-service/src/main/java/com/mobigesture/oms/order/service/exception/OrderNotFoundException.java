/**
 * 
 */
package com.mobigesture.oms.order.service.exception;

import com.mobigesture.oms.order.service.constant.StatusConstants;

import lombok.Getter;

/**
 * @author ignat
 *
 */
@Getter
public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private StatusConstants.HttpConstants status;

	/**
	 * @param status
	 */
	public OrderNotFoundException(StatusConstants.HttpConstants status) {
		super(status.getDesc(), null);
		this.status = status;
	}
}
