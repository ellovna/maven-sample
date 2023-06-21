package com.solvd.laba.database.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "UsedCars")
@XmlAccessorType(XmlAccessType.FIELD)
public class UsedCarModel extends CarModel {

    @XmlElement
    private int mileage;

    public UsedCarModel(int carId, String brand, String model, int year, int price, Date date, int mileage) {
        super(carId, brand, model, year, price, date);
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "mileage=" + mileage +
                '}';
    }

    public UsedCarModel() {}
}
