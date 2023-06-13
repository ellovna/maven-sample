package com.solvd.laba.database.model;

public class CarModel {
    private int carId;
    private String brand;
    private String model;
    private int year;
    private String color;


    public CarModel(int carId, String brand, String model, int year, String color) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    public int getId() {
        return carId;
    }

    public void setId(int car_id) {
        this.carId = car_id;
    }


    public String getName() {

        return brand;
    }
    public void setName(String brand) {
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + carId +
                ", name='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", year ='" + year + '\'' +
                ", color ='" + color +
                '}';
    }

    public void add(CarModel car) {
    }
}


