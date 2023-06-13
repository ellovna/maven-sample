package com.solvd.laba.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestEnumsRunner {
    private static final Logger LOGGER = LogManager.getLogger(TestEnumsRunner.class);

    public static void main(String[] args){
        Test1 largePizza = new Test1(SizeEnum.LARGE);
        Test1 mediumPizza = new Test1(SizeEnum.MEDIUM);
        largePizza.orderPizza();
        mediumPizza.orderPizza();

        //System.out.println("-----------------------------------------");
        LOGGER.info("-----------------------------------------");
        Test2 t2 = new Test2(ComplexEnum.PIZZA);
        t2.getInfo();


    }
}
