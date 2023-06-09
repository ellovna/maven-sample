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

@XmlRootElement(name = "SportsCars")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName(value="SportsCars")
@JsonPropertyOrder({"carId", "brand", "model", "topSpeed", "date"})
@JsonIgnoreProperties({"year", "name"})
public class SportsCarM extends CarM {

    @XmlElement
    @JsonProperty("topSpeed")
    private int topSpeed;

    public SportsCarM() {

    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public SportsCarM(int carId, String brand, String model, int topSpeed, Date date) {}
}
