package com.solvd.laba.database.jaxb;

import com.solvd.laba.database.model.*;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "cars")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cars {
    @XmlElement(name = "car")
    private List<CarModel> cars;
    public List<CarModel> getCar() {
        return cars;
    }
    public void setCar(List<CarModel> cars) {
        this.cars = cars;
    }

    @XmlElementWrapper(name = "electricCars")
    @XmlElement(name = "electricCar")
    private List<ElectricCarModel> electricCars;

    public List<ElectricCarModel> getElectricCars() {
        return electricCars;
    }
    public void setElectricCars(List<ElectricCarModel> electricCars) {
        this.electricCars = electricCars;
    }

    @XmlElementWrapper(name = "gasolineCars")
    @XmlElement(name = "gasolineCar")
    private List<GasolineCarModel> gasolineCars;
    public List<GasolineCarModel> getGasolineCars() {
        return gasolineCars;
    }
    public void setGasolineCars(List<GasolineCarModel> gasolineCars) {
        this.gasolineCars= gasolineCars;
    }

    @XmlElementWrapper(name = "sportsCars")
    @XmlElement(name = "sportsCar")
    private List<SportsCarModel> sportsCars;
    public List<SportsCarModel> getSportsCars() {
        return sportsCars;
    }
    public void setSportsCars(List<SportsCarModel> sportsCars) {
        this.sportsCars= sportsCars;
    }

    @XmlElementWrapper(name = "usedCars")
    @XmlElement(name = "usedCar")
    private List<UsedCarModel> usedCars;

    public List<UsedCarModel> getUsedCars() {
        return usedCars;
    }
    public void setUsedCars(List<UsedCarModel> usedCars) {
        this.usedCars= usedCars;
    }
}