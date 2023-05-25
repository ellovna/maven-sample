package com.solvd.laba.lambda.interfaces;

@FunctionalInterface
public interface IPrinter { // IPrinter, 5 interfaces
    void print(String msg);

    default void colorPrint(String msg) {
        System.out.println("Default method, message:" + msg);
    }
}
