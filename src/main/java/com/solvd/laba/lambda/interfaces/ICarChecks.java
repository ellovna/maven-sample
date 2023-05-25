package com.solvd.laba.lambda.interfaces;

import com.solvd.laba.lambda.Car;

@FunctionalInterface // contains only 1 abstract method, can have other default methods
public interface ICarChecks {
    boolean check(Car c); //abstract method
}

