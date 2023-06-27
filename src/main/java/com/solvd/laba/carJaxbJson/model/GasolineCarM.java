package com.solvd.laba.carJaxbJson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "GasolineCars")
@XmlAccessorType(XmlAccessType.FIELD)

@JsonRootName(value="GasolineCars")
@JsonPropertyOrder({"carId", "brand", "model", "fuelEconomy", "date"})
@JsonIgnoreProperties({"year", "name"})
public class GasolineCarM extends CarM {

    @XmlElement
    @JsonProperty("fuelEconomy")
    private int fuelEconomy;


    public int getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(int fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public GasolineCarM(int carId, String brand, String model, int year, int price, Date date, int fuelEconomy) {
        super(carId, brand, model, year, price, date);
        this.fuelEconomy = fuelEconomy;
    }

    @Override
    public String toString() {
        return "GasolineCar{" +
                "fuelEconomy=" + fuelEconomy +
                '}';
    }

    public GasolineCarM() {}
}