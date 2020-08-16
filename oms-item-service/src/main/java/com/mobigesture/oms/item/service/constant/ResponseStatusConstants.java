/**
 * 
 */
package com.mobigesture.oms.item.service.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ignat
 *
 */
public class ResponseStatusConstants {

	@Getter
	@AllArgsConstructor
	public enum HttpConstants {

		SUCCESS(1, "Success"),

		CUSTOM_FIELD_VALIDATION(2, null),

		INTERNAL_SERVER_ERROR(0, "System error! Please try after some time");

		private Integer code;

		private String desc;

	}
}
