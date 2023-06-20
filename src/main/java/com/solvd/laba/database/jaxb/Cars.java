package com.solvd.laba.database.jaxb;

import com.solvd.laba.database.model.*;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "cars")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cars {
    @XmlElement(name = "carModel")
    private List<CarModel> cars;
    public List<CarModel> getCar() {
        return cars;
    }
    public void setCar(List<CarModel> cars) {
        this.cars = cars;
    }

    @XmlElementWrapper(name = "electricCars")
    @XmlElement(name = "electricCar")
    private List<ElectricCars> electricCars;

    public List<ElectricCars> getElectricCars() {
        return electricCars;
    }
    public void setElectricCars(List<ElectricCars> electricCars) {
        this.electricCars = electricCars;
    }

    @XmlElementWrapper(name = "gasolineCars")
    @XmlElement(name = "gasolineCar")
    private List<GasolineCars> gasolineCars;
    public List<GasolineCars> getGasolineCars() {
        return gasolineCars;
    }
    public void setGasolineCars(List<GasolineCars> gasolineCars) {
        this.gasolineCars= gasolineCars;
    }

    @XmlElementWrapper(name = "sportsCars")
    @XmlElement(name = "sportsCar")
    private List<SportsCars> sportsCars;
    public List<SportsCars> getSportsCars() {
        return sportsCars;
    }
    public void setSportsCars(List<SportsCars> sportsCars) {
        this.sportsCars= sportsCars;
    }

    @XmlElementWrapper(name = "usedCars")
    @XmlElement(name = "usedCar")
    private List<UsedCars> usedCars;

    public List<UsedCars> getUsedCars() {
        return usedCars;
    }
    public void setUsedCars(List<UsedCars> usedCars) {
        this.usedCars= usedCars;
    }
}