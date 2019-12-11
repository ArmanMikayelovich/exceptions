package com.energizeglobal.internship;

import com.energizeglobal.internship.exceptions.MachineFailureException;

public interface ToyFactory {
    Object[] makeCars();

    Object[] makeBarbies() throws MachineFailureException;

    Object[] makeGuns() throws MachineFailureException;

    Object[] makeDinosaurs() throws MachineFailureException;
}
