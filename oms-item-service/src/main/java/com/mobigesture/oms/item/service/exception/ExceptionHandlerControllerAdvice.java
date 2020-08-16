/**
 * 
 */
package com.mobigesture.oms.item.service.exception;

import com.mobigesture.oms.item.service.model.Status;
import com.mobigesture.oms.item.service.constant.ResponseStatusConstants;
import com.mobigesture.oms.item.service.model.Response;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
	@ExceptionHandler(ItemNotFoundException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody Response handleServiceException(final ItemNotFoundException exception) {

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

		Status status = new Status(ResponseStatusConstants.HttpConstants.INTERNAL_SERVER_ERROR);
		return new com.mobigesture.oms.item.service.model.Response(status, null);

	}
}
