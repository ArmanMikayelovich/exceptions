package com.energizeglobal.internship;

import com.energizeglobal.internship.exceptions.MachineFailureException;
import com.energizeglobal.internship.exceptions.NoSuchComponentException;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ToyFactoryImpl toyFactory = new ToyFactoryImpl();
        try {
            System.out.println("Car department.");
            System.out.println(Arrays.toString(toyFactory.makeCars()));
        } catch (NoSuchComponentException ex) {
            System.out.println("no such components car department.");
        }
        try {
            System.out.println("Barby department.");
            System.out.println(Arrays.toString(toyFactory.makeBarbies()));
        } catch (MachineFailureException ex) {
            System.out.println("in barby department we have a failure.");
        }
        System.out.println("Gun department.");
        System.out.println(Arrays.toString(toyFactory.makeGuns()));
        System.out.println("Dinosaur department.");
        System.out.println(Arrays.toString(toyFactory.makeDinosaurs()));

    }
}
