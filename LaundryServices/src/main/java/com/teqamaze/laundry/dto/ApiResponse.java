package com.teqamaze.laundry.dto;

import java.util.Set;

import com.teqamaze.laundry.constant.Status;
import com.teqamaze.laundry.error.LaundryError;

public class ApiResponse {

    private Status status;

    private Set<LaundryError> errors;

    public ApiResponse() {
    }

    public ApiResponse(Set<LaundryError> errors) {
        this.status = Status.FAILED;
        this.errors = errors;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<LaundryError> getErrors() {
        return errors;
    }

    public void setErrors(Set<LaundryError> errors) {
        this.errors = errors;
    }

}
