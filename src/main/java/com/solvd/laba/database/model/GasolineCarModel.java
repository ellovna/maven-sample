package com.solvd.laba.database.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "GasolineCars")
@XmlAccessorType(XmlAccessType.FIELD)
public class GasolineCarModel extends CarModel {

    @XmlElement
    private int fuelEconomy;

    public int getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(int fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public GasolineCarModel(int carId, String brand, String model, int year, int price, Date date, int fuelEconomy) {
        super(carId, brand, model, year, price, date);
        this.fuelEconomy = fuelEconomy;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "fuelEconomy=" + fuelEconomy +
                '}';
    }

    public GasolineCarModel() {}
}