package com.digipay.inventory.exception;

public class BusinessException extends Exception {

    public BusinessException() {
    }

    public BusinessException(String message) {
        super("خطا");
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
