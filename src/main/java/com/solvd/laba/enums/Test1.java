package com.solvd.laba.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Test1 {
    private static final Logger LOGGER = LogManager.getLogger(Test1.class);

    SizeEnum pizzaSize;

    public Test1(SizeEnum pizzaSize) {
        this.pizzaSize = pizzaSize;
    }


    public void orderPizza() {
        switch (pizzaSize) {
            case SMALL:
                //System.out.println("I ordered a small size pizza");
                LOGGER.info("I ordered a small size pizza");
                break;
            case MEDIUM:
                //System.out.println("I ordered a medium size pizza");
                LOGGER.info("I ordered a medium size pizza");
                break;
            case LARGE:
                //System.out.println("I ordered a large pizza");
                LOGGER.info("I ordered a large pizza");
                break;
            case EXTRALARGE:
                //System.out.println("I ordered a extraLarge pizza");
                LOGGER.info("I ordered a extraLarge pizza");
                break;
            default:
                //System.out.println("I don't know which one to order");
                LOGGER.info("I don't know which one to order");
                break;
        }
    }
}
