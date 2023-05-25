package com.solvd.laba.lambda.interfaces;

@FunctionalInterface
public interface IStringConcatenation<T> {
    T concatenate(T a, T b);
}

