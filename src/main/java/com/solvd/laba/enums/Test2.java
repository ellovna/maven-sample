package com.solvd.laba.enums;

import java.util.Objects;

class Test2 {
    ComplexEnum info;

    public Test2(ComplexEnum info) {
        this.info = info;
    }

    public void getInfo() {
        if (Objects.requireNonNull(info) == ComplexEnum.PIZZA) {
            System.out.println("We have small and medium pizza at the moment!");
        }
    }
}

