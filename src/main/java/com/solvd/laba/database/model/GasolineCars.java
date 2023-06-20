package com.solvd.laba.database.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class GasolineCars extends CarModel {

    @XmlElement
    private int fuelEconomy;

    public int getFuelCapacity() {
        return fuelEconomy;
    }

    public void setFuelEconomy(int fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public GasolineCars() {}
}