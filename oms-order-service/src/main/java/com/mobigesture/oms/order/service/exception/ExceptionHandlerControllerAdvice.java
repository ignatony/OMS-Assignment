/**
 * 
 */
package com.mobigesture.oms.order.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mobigesture.oms.order.service.model.Response;
import com.mobigesture.oms.order.service.model.Status;
import com.mobigesture.oms.order.service.constant.StatusConstants;

/**
 * @author ignat
 *
 */
@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	/**
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(OrderNotFoundException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody Response handleServiceException(final OrderNotFoundException exception) {

		Status status = new Status(exception.getStatus());
		return new Response(status, null);

	}

	/**
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(CanNotGetResponseException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody Response handleResponseException(final CanNotGetResponseException exception) {
		Status status = new Status(exception.getStatus());
		return new Response(status, null);

	}

	/**
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody Response handleNotFoundException(final NotFoundException exception) {
		Status status = new Status(exception.getStatus());
		return new Response(status, null);

	}

	/**
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(ConnectionTimeoutException.class)
	@ResponseStatus(value = HttpStatus.GATEWAY_TIMEOUT)
	public @ResponseBody Response handleConnectionException(final ConnectionTimeoutException exception) {
		Status status = new Status(exception.getStatus());
		return new Response(status, null);

	}

	/**
	 * @param exception
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody Response internalServerException(final Exception exception) {

		Status status = new Status(StatusConstants.HttpConstants.INTERNAL_SERVER_ERROR);
		return new Response(status, null);

	}
}
