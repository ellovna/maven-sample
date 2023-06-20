package com.solvd.laba.database.model;

import com.solvd.laba.database.jaxb.DateAdapter;

import javax.xml.bind.annotation.*;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class CarModel {
    @XmlElement(name="carId")
    private int carId;
    @XmlElement(name = "brand")
    private String brand;
    @XmlElement(name="model")
    private String model;
    @XmlElement(name="year")
    private int year;
    @XmlElement(name="price")
    private int price;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date date;

    public CarModel(){}

    public CarModel(int carId, String brand, String model, int year, int price, Date date) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.date = date;
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

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + carId +
                ", name='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", year ='" + year + '\'' +
                ", price ='" + price + '\'' +
                "Date: " + date + '\'' +
                '}';
    }

    public void add(CarModel car) {
    }
}


