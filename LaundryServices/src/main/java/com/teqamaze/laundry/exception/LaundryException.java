package com.teqamaze.laundry.exception;

import java.util.HashSet;
import java.util.Set;

import com.teqamaze.laundry.error.LaundryError;

public class LaundryException extends Exception {

    private static final long serialVersionUID = -3022130821044839914L;

    private Set<LaundryError> errors;

    public LaundryException(LaundryError error) {
        if (error != null) {
            this.errors = new HashSet<>();
            this.errors.add(error);
        }
    }

    @Override
    public String getMessage() {
        return this.toString();
    }

    public LaundryException(Set<LaundryError> errors) {
        this.errors = errors;
    }

    public Set<LaundryError> getErrors() {
        return errors;
    }

    public void setErrors(Set<LaundryError> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "LaundryException [errors=" + errors + "]";
    }
}
