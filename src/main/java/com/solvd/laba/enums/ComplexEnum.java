package com.solvd.laba.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public enum ComplexEnum {
    PIZZA(SizeEnum.SMALL, SizeEnum.MEDIUM);

    private SizeEnum small;
    private SizeEnum medium;

    ComplexEnum(SizeEnum small, SizeEnum medium) {
        this.small = small;
        this.medium = medium;
    }
}




