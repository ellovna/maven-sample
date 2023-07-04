package com.solvd.laba.database.model;

public class CarModel {
    int car_id;
    String brand;
    String model;
    int year;
    String color;
    int car_owner_car_id;
    String car_owner_owner_name;

    public CarModel(int car_id, String brand, String model, int year, String color, int car_owner_car_id, String car_owner_owner_name) {
        this.car_id = car_id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.car_owner_car_id = car_owner_car_id;
        this.car_owner_owner_name = car_owner_owner_name;
    }

    public CarModel() {
    }

    public CarModel(String brand){
        this.brand = brand;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCar_owner_car_id() {
        return car_owner_car_id;
    }

    public void setCar_owner_car_id(int car_owner_car_id) {
        this.car_owner_car_id = car_owner_car_id;
    }

    public String getCar_owner_owner_name() {
        return car_owner_owner_name;
    }

    public void setCar_owner_owner_name(String car_owner_owner_name) {
        this.car_owner_owner_name = car_owner_owner_name;
    }


    @Override
    public String toString() {
        return "CarModel{" +
                "car_id=" + car_id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", car_owner_car_id=" + car_owner_car_id +
                ", car_owner_owner_name='" + car_owner_owner_name + '\'' +
                '}';
    }

    public void add(CarModel car) {
    }
}
