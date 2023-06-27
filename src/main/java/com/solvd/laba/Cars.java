package com.solvd.laba;

import com.fasterxml.jackson.annotation.*;
import com.solvd.laba.carJaxbJson.model.*;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "cars")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("Cars")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cars {
    @XmlElement(name = "car")
    @JsonProperty("cars")
    private List<CarM> cars;
    @JsonGetter("car")
    public List<CarM> getCar() {
        return cars;
    }
    @JsonSetter("car")
    public void setCar(List<CarM> cars) {
        this.cars = cars;
    }

    @XmlElementWrapper(name = "electricCars")
    @XmlElement(name = "electricCar")
    @JsonProperty("electricCars")
    private List<ElectricCarM> electricCars;

    @JsonGetter("electricCars")
    public List<ElectricCarM> getElectricCars() {
        return electricCars;
    }

    @JsonSetter("electricCars")
    public void setElectricCars(List<ElectricCarM> electricCars) {
        this.electricCars = electricCars;
    }

    @XmlElementWrapper(name = "gasolineCars")
    @XmlElement(name = "gasolineCar")
    @JsonProperty("gasolineCars")
    private List<GasolineCarM> gasolineCars;

    @JsonGetter("gasolineCars")
    public List<GasolineCarM> getGasolineCars() {
        return gasolineCars;
    }
    @JsonSetter("gasolineCars")
    public void setGasolineCars(List<GasolineCarM> gasolineCars) {
        this.gasolineCars= gasolineCars;
    }

    @XmlElementWrapper(name = "sportsCars")
    @XmlElement(name = "sportsCar")
    @JsonProperty("sportsCars")
    private List<SportsCarM> sportsCars;

    @JsonGetter("sportsCars")
    public List<SportsCarM> getSportsCars() {
        return sportsCars;
    }
    @JsonSetter("sportsCars")
    public void setSportsCars(List<SportsCarM> sportsCars) {
        this.sportsCars= sportsCars;
    }

    @XmlElementWrapper(name = "usedCars")
    @XmlElement(name = "usedCar")
    private List<UsedCarM> usedCars;

    @JsonGetter("usedCars")
    public List<UsedCarM> getUsedCars() {
        return usedCars;
    }
    @JsonSetter("usedCars")
    public void setUsedCars(List<UsedCarM> usedCars) {
        this.usedCars= usedCars;
    }
}