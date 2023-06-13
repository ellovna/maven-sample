package com.solvd.laba.lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;


// Use at least 5 lambda functions from the java.util.function package.
public class LambdaFunctionExercises {
    private static final Logger Logger = LogManager.getLogger(LambdaFunctionGenerics.class);

    public static void main(String[] args){
        // #1 BinaryOperator //
        // Lambda function (Functional Interface) that takes two integers and returns their sum
        // from java.util.function package;
        IntBinaryOperator add = (a, b) ->  a + b; // 2 parameters -> expression // lambda function
        //System.out.println(add.applyAsInt(3, 5)); //
        Logger.info(add.applyAsInt(3, 5));


        // #2 IntConsumer, java.util.function package
        // This method takes in only one parameter:value–the input argument
        IntConsumer display = a ->
                //System.out.println(a * 10);
                Logger.info(a * 10);
        // Using accept() method
       display.accept(3);
       display.accept(10);

        // #3 BiFunction, java.util.function package
        // Lambda function that takes two strings and returns their concatenation
        BiFunction<String, String, String> concat = (w1, w2) -> w1 + w2;
        //System.out.println(concat.apply("Lambda", "Exercise!"));
        Logger.info(concat.apply("Lambda", "Exercise!"));

        // #4 Function, java.util.function package
        // Lambda function that takes a string and returns its length
        Function<String, Integer> stringLength = str -> str.length();
        //System.out.println(stringLength.apply("lambda"));
        Logger.info(stringLength.apply("lambda"));

    }
}
