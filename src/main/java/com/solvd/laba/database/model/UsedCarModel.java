package com.solvd.laba.database.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;



@XmlRootElement(name = "UsedCars")
@XmlAccessorType(XmlAccessType.FIELD)

@JsonRootName(value="UsedCars")
@JsonPropertyOrder({"carId", "brand", "model", "mileage", "date"})
@JsonIgnoreProperties({"year", "name"})
public class UsedCarModel extends CarModel {

    @XmlElement
    @JsonProperty("mileage")
    private int mileage;

    public UsedCarModel(int carId, String brand, String model, int year, int price, Date date) {
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
