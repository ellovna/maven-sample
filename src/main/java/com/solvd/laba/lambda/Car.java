package com.solvd.laba.lambda;

public class Car {
    // fields, properties
    private final String model;
    String color;
    int averagePrice;
    String type;
    int manufactureDate;

    // constructor
    public Car(String model, String color, int averagePrice, String type, int manufactureDate){
        this.model = model;
        this.color = color;
        this.averagePrice = averagePrice;
        this.type = type;
        this.manufactureDate = manufactureDate;
    }
    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getAveragePrice(){
        return averagePrice;
    }


    public String getType(){
        return type;
    }

    public int getManufactureDate(){
        return manufactureDate;
    }

    // method toString
    @Override
    public String toString() {
        return "Car(" +
                "model= " + model + '\'' +
                ", color= " + color +
                ", averagePrice=" + averagePrice +
                ", type=" + type +
                ", manufactureDate=" + manufactureDate +
                '}';
    }


    }

