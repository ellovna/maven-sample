package com.solvd.laba.carJaxbJson.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.solvd.laba.Cars;
import com.solvd.laba.jaxb.DateAdapter;
import com.solvd.laba.json.CustomSerializer;

import javax.xml.bind.annotation.*;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



@XmlRootElement(name = "Car")
@XmlAccessorType(XmlAccessType.FIELD)

@JsonRootName(value="Car")
@JsonPropertyOrder({"carId", "brand", "model", "year", "price", "date"})
@JsonIgnoreProperties({"name"})


@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cars.class, name = "car"),
        @JsonSubTypes.Type(value = ElectricCarM.class, name = "electricCars"),
        @JsonSubTypes.Type(value = ElectricCarM.class, name = "gasolineCars"),
        @JsonSubTypes.Type(value = ElectricCarM.class, name = "sportsCars"),
        @JsonSubTypes.Type(value = ElectricCarM.class, name = "usedCars")
})
public class CarM {
    @XmlElement(name="carId")
    @JsonProperty("carId")
    private int carId;
    @XmlElement(name = "brand")
    @JsonProperty("brand")
    private String brand;
    @XmlElement(name="model")
    @JsonProperty("model")
    private String model;
    @XmlElement(name="year")
    @JsonProperty("year")
    private int year;
    @XmlElement(name="price")
    @JsonProperty("price")
    private int price;

    @XmlElement(name="date")
    @XmlJavaTypeAdapter(DateAdapter.class)

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonSerialize(using = CustomSerializer.class)
    private Date date;

    public CarM(){}

    public CarM(int carId, String brand, String model, int year, int price, Date date) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.date = date;
        }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int car_id) {
        this.carId = car_id;
    }


    public String getName() {

        return brand;
    }
    public void setName(String brand) {
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Car{" +
                "CarId=" + carId +
                ", brand='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", year ='" + year + '\'' +
                ", price ='" + price + '\'' +
                "Date: " + date + '\'' +
                '}';
    }

    public void add(CarM car) {
    }
}


