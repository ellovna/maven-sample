package com.solvd.laba.enums;

public enum SizeEnum {
    SMALL("small", 1),
    MEDIUM("medium", 2),
    LARGE("large", 3),
    EXTRALARGE("extralarge", 4);

    private String name;
    private int number;

    SizeEnum(String name, int number){
        this.name = name;
        this.setNumber(number);
    }

    public String getName(){
        return name;
    }
    public void getName(String name){
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

}

