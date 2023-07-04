package com.solvd.laba.database.model;

public class CarsPriceListModel {
    int car_id;
    String car_brand;
    String car_model;
    int year;
    int price;

    public CarsPriceListModel(int car_id, String car_brand, String car_model, int year, int price) {
        this.car_id = car_id;
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.year = year;
        this.price = price;
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

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarPriceListDao{" +
                "car_id=" + car_id +
                ", car_brand='" + car_brand + '\'' +
                ", car_model='" + car_model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void add(CarsPriceListModel carPrice) {
    }
}
