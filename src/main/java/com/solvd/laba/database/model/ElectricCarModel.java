package com.solvd.laba.database.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "ElectricCars")
@XmlAccessorType(XmlAccessType.FIELD)
public class ElectricCarModel extends CarModel {

    @XmlElement
    private int batteryCapacity;

    public ElectricCarModel(int CarId, String brand, String model, int batteryCapacity, int price, Date date) {
        super(CarId, brand, model, batteryCapacity, price, date);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCarModel() {
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }
}
