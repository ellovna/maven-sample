package com.solvd.laba.enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

class Test2 {

    private static final Logger Logger = LogManager.getLogger(Test2.class);
    ComplexEnum info;

    public Test2(ComplexEnum info) {
        this.info = info;
    }

    public void getInfo() {
        if (Objects.requireNonNull(info) == ComplexEnum.PIZZA) {
            //System.out.println("We have small and medium pizza at the moment!");
            Logger.info("We have small and medium pizza at the moment!");
        }
    }
}

