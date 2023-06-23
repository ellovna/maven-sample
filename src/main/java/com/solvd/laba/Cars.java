package com.solvd.laba;

import com.fasterxml.jackson.annotation.*;
import com.solvd.laba.database.model.*;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "cars")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("Cars")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cars {
    @XmlElement(name = "car")
    @JsonProperty("cars")
    private List<CarModel> cars;
    @JsonGetter("car")
    public List<CarModel> getCar() {
        return cars;
    }
    @JsonSetter("car")
    public void setCar(List<CarModel> cars) {
        this.cars = cars;
    }

    @XmlElementWrapper(name = "electricCars")
    @XmlElement(name = "electricCar")
    @JsonProperty("electricCars")
    private List<ElectricCarModel> electricCars;

    @JsonGetter("electricCars")
    public List<ElectricCarModel> getElectricCars() {
        return electricCars;
    }

    @JsonSetter("electricCars")
    public void setElectricCars(List<ElectricCarModel> electricCars) {
        this.electricCars = electricCars;
    }

    @XmlElementWrapper(name = "gasolineCars")
    @XmlElement(name = "gasolineCar")
    @JsonProperty("gasolineCars")
    private List<GasolineCarModel> gasolineCars;

    @JsonGetter("gasolineCars")
    public List<GasolineCarModel> getGasolineCars() {
        return gasolineCars;
    }
    @JsonSetter("gasolineCars")
    public void setGasolineCars(List<GasolineCarModel> gasolineCars) {
        this.gasolineCars= gasolineCars;
    }

    @XmlElementWrapper(name = "sportsCars")
    @XmlElement(name = "sportsCar")
    @JsonProperty("sportsCars")
    private List<SportsCarModel> sportsCars;

    @JsonGetter("sportsCars")
    public List<SportsCarModel> getSportsCars() {
        return sportsCars;
    }
    @JsonSetter("sportsCars")
    public void setSportsCars(List<SportsCarModel> sportsCars) {
        this.sportsCars= sportsCars;
    }

    @XmlElementWrapper(name = "usedCars")
    @XmlElement(name = "usedCar")
    private List<UsedCarModel> usedCars;

    @JsonGetter("usedCars")
    public List<UsedCarModel> getUsedCars() {
        return usedCars;
    }
    @JsonSetter("usedCars")
    public void setUsedCars(List<UsedCarModel> usedCars) {
        this.usedCars= usedCars;
    }
}