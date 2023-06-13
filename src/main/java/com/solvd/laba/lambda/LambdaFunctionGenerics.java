package com.solvd.laba.lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.laba.lambda.interfaces.IStringConcatenation;
import com.solvd.laba.lambda.interfaces.IMyGeneric;
import com.solvd.laba.lambda.interfaces.IStringLength;


// Create 3 custom Lambda functions with generics.
public class LambdaFunctionGenerics {
    private static final Logger Logger = LogManager.getLogger(LambdaFunctionGenerics.class);

    public static void main(String[] args) {

        // # 1. A generic lambda function that reverses a string
        IMyGeneric<String> reverse = (str) -> {   // Lambda Expression
            String result = "";
            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        //System.out.println(reverse.compute("Lambda with Generics!!"));
        Logger.info(reverse.compute("Lambda with Generics!!"));

        // # 2. A generic lambda function that concatenates two strings
        IStringConcatenation<String> two= (a, b) -> a + b;

        String result = two.concatenate("Concatenate", "This!");
        //System.out.println(result);
        Logger.info(result);

        // 3. A generic lambda function that returns the length of a string
        IStringLength<String> lengthCalculator = s -> s.length();

        int length = lengthCalculator.calculateLength("Calculate");
        //System.out.println(length);
        Logger.info(length);
    }
}
