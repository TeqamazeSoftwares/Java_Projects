package com.teqamaze.laundry.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.teqamaze.laundry.dto.ApiResponse;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.util.ApiResponseUtil;

@ControllerAdvice
public class TslExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(TslExceptionHandler.class);

    @ExceptionHandler(value = Throwable.class)
    public void handleException(Throwable t) {
        LOGGER.error("Unhandled handled exception.", t);
    }

    @ExceptionHandler(value = LaundryException.class)
    @ResponseBody
    public ApiResponse handleException(LaundryException e) {
        LOGGER.error("Business error.", e);
        return ApiResponseUtil.fail(e);
    }   
}
