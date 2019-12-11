package com.energizeglobal.internship.exceptions;

public class NoSuchComponentException extends RuntimeException {
    public NoSuchComponentException(String message) {
        super(message);
    }

    public NoSuchComponentException() {
        super();
    }
}
