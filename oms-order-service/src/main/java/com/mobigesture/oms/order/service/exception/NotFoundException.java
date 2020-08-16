package com.mobigesture.oms.order.service.exception;



import com.mobigesture.oms.order.service.constant.StatusConstants;

import lombok.Getter;

/**
 * @author ignat
 *
 */
@Getter
public class NotFoundException extends Exception {

    private StatusConstants.HttpConstants status;

    /**
     * @param status
     */
    public NotFoundException(StatusConstants.HttpConstants status) {
        super(status.getDesc(), null);
        this.status = status;
    }
}