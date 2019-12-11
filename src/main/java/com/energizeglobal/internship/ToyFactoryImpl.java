package com.energizeglobal.internship;

import com.energizeglobal.internship.exceptions.FactoryCrashError;
import com.energizeglobal.internship.exceptions.MachineFailureException;
import com.energizeglobal.internship.exceptions.NoSuchComponentException;

import java.util.Random;

public class ToyFactoryImpl implements ToyFactory {

    public ToyFactoryImpl() {
        if (new Random().nextInt(10) == 1) {
            throw new FactoryCrashError();
        }
    }

    @Override
    public Object[] makeCars() {
        if (new Random().nextInt(3) == 0) {
            throw new NoSuchComponentException();
        }
        try {
            throw new MachineFailureException();
        } catch (MachineFailureException ex) {
            System.out.println("Machine is failed, but out engineers are repaired it.");
        }
        return new Object[]{"bmw", "mercedes", "niva"};
    }

    @Override
    public Object[] makeBarbies() throws MachineFailureException {
        if (new Random().nextInt(3) == 0) {
            throw new NoSuchComponentException();
        }
        throw new MachineFailureException();
    }

    @Override
    public Object[] makeDinosaurs() {
        try {
            if (new Random().nextInt(3) == 0) {
                throw new NoSuchComponentException();
            }
            if (new Random().nextInt(3) == 0) {
                throw new MachineFailureException();
            }
        } catch (MachineFailureException | NoSuchComponentException ex) {
            System.out.println("problems arose but were resolved․");
        }
        return new Object[]{"T-24", "T-54", "D-63"};
    }

    @Override
    public Object[] makeGuns() {
        return new Object[]{"AK", "Makarov", "M16"};
    }


}
