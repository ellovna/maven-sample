package com.solvd.laba.database.model;

public class ElectricCarModel extends CarModel{
    int car_id;
    String car_brand;
    int battery_capacity;
    int car_car_id;
    int car_type_car_id;

    public ElectricCarModel(int car_id, String car_brand, int battery_capacity, int car_car_id, int car_type_car_id) {
        this.car_id = car_id;
        this.car_brand = car_brand;
        this.battery_capacity = battery_capacity;
        this.car_car_id = car_car_id;
        this.car_type_car_id = car_type_car_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public int getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(int battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public int getCar_car_id() {
        return car_car_id;
    }

    public void setCar_car_id(int car_car_id) {
        this.car_car_id = car_car_id;
    }

    public int getCar_type_car_id() {
        return car_type_car_id;
    }

    public void setCar_type_car_id(int car_type_car_id) {
        this.car_type_car_id = car_type_car_id;
    }

    @Override
    public String toString() {
        return "ElectricCarModel{" +
                "car_id=" + car_id +
                ", car_brand='" + car_brand + '\'' +
                ", battery_capacity=" + battery_capacity +
                ", car_car_id=" + car_car_id +
                ", car_type_car_id=" + car_type_car_id +
                '}';
    }

    public void add(ElectricCarModel electricCar) {
    }
}
