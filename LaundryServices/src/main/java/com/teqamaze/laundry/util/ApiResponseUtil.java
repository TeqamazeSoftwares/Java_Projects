package com.teqamaze.laundry.util;

import com.teqamaze.laundry.dto.ApiResponse;
import com.teqamaze.laundry.exception.LaundryException;

public class ApiResponseUtil {

    public static ApiResponse success() {
        return new ApiResponse();
    }

    public static ApiResponse fail(LaundryException laundryException) {
        return new ApiResponse(laundryException.getErrors());
    }
}
