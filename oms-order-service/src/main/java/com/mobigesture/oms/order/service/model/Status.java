/**
 * 
 */
package com.mobigesture.oms.order.service.model;

import com.mobigesture.oms.order.service.constant.StatusConstants;

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
    public Status(StatusConstants.HttpConstants httpConstants) {
        this.code = httpConstants.getCode();
        this.message = httpConstants.getDesc();
    }
}
