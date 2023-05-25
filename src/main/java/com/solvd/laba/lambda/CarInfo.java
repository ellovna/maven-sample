package com.solvd.laba.lambda;

import com.solvd.laba.lambda.interfaces.ICarChecks;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CarInfo{
    void testCars(ArrayList<Car> al, ICarChecks cs){
        for(Car c:al){
            if(cs.check(c)){
                System.out.println(c);
            }
        }
    }

    // methods
    /*void printCarDate(ArrayList<Car> al, int date) {
        for (Car c : al) {
            if (c.manufactureDate < date) {
                System.out.println(c);
            }
        }
    }

    void printCarPrice(ArrayList<Car> al, int price) {
        for (Car c : al) {
            if (c.averagePrice > price) {
                System.out.println(c);
            }
        }
    }
}*/

}

