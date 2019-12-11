package com.energizeglobal.internship.exceptions;

public class MachineFailureException extends Exception {
    public MachineFailureException(String message) {
        super(message);
    }

    public MachineFailureException() {
        super();
    }
}
