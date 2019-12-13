package com.energizeglobal.internship;

public class CustomRuntimeException extends RuntimeException {
    /**
     * this type of constructor uses for send a message with Exception
     * the message will be save in 'detailMessage" field
     * which inherits from Throwable class:)
     * @param message
     */
    public CustomRuntimeException(String message) {
        super(message);
    }

    public CustomRuntimeException() { }
}
