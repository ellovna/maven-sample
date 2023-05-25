package com.solvd.laba.enums;

public class TestEnums {
    public static void main(String[] args){
        Test1 t1 = new Test1(SizeEnum.LARGE);
        t1.orderPizza();

        System.out.println("-----------------------------------------");
        Test2 t2 = new Test2(ComplexEnum.PIZZA);
        t2.getInfo();


    }
}
