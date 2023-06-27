package com.solvd.laba.database.dao.model;

public class CarAccidentModel {
    int car_id;
    int accident_date;
    String location;
    String description;
    int car_car_id;


    public CarAccidentModel(int car_id, int accident_date, String location, String description, String color, int car_car_id) {
        this.car_id = car_id;
        this.accident_date = accident_date;
        this.location = location;
        this.description = description;
        this.car_car_id = car_car_id;
    }


    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getAccident_date() {
        return accident_date;
    }

    public void setAccident_date(int accident_date) {
        this.accident_date = accident_date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCar_car_id() {
        return car_car_id;
    }

    public void setCar_car_id(int car_car_id) {
        this.car_car_id = car_car_id;
    }

    @Override
    public String toString() {
        return "CarAccidentModel{" +
                "car_id=" + car_id +
                ", accident_date=" + accident_date +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", car_car_id=" + car_car_id +
                '}';
    }

    public void add(CarAccidentModel car) {
    }
}
