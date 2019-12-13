package com.energizeglobal.internship;

import java.io.Closeable;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        tryWithResources();
        try {
            tryCatchWithException();
        } catch (Exception ignored) {
        }

        tryWithSystemExit();


    }

    static void tryWithSystemExit() {
        System.out.println("Try with System.exit()");
        try {
            System.out.println("In try block");
            throw new Exception();
        } catch (Exception ex) {
            System.out.println("In catch block");
            System.exit(0);
            System.out.println("catch block after exit command");
        } finally {
            System.out.println("In finally block");
        }
        System.out.println();
    }

    static void tryWithResources() {
        System.out.println("Try with resources.");
        try (A a = new A();
             B b = new B();
             C c = new C();) {
            System.out.println("in try");
        } finally {
            System.out.println("In finally");
        }
        System.out.println();
    }

    static void tryCatchWithException() {
        System.out.println("Try with catch exception.");
        try {
            System.out.println("In try block");
            throw new Exception();
        } catch (Exception ex) {
            System.out.println("In catch block");
            throw new RuntimeException();
        } finally {
            System.out.println("In finally block");
            System.out.println();
        }
    }

    static class A implements AutoCloseable {
        @Override
        public void close() {
            System.out.println("A class closing");
        }
    }


    /**
     * Closeable interface for IO streams.
     */
    static class B implements Closeable {
        @Override
        public void close() {
            System.out.println("B class closing");
        }
    }

    static class C implements Closeable {
        @Override
        public void close() {
            System.out.println("C class closing.");
        }
    }


}


