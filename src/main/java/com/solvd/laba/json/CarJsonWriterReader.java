package com.solvd.laba.json;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.laba.Cars;
import com.solvd.laba.database.model.*;
import com.solvd.laba.xml.CarXmlParserRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class CarJsonWriterReader {

    private static final Logger LOGGER = LogManager.getLogger(CarXmlParserRunner.class);
    public static void main(String[] args) throws JsonProcessingException {
        // Create car objects
        /*CarModel car = new CarModel(1, "Mercedes", "Benz", 2023, 292929, new Date());
        ElectricCarModel electricCar = new ElectricCarModel(2, "Tesla", "Model S", 95000, 50, new Date());
        GasolineCarModel gasolineCar = new GasolineCarModel(3, "Ford", "Mustang", 2023, 65000, new Date(), 8);
        SportsCarModel sportsCar = new SportsCarModel(4, "Ferrari", "Jjj", 202, new Date());
        UsedCarModel usedCar = new UsedCarModel(5, "Corolla", "Toyota", 20000, 737, new Date());

        // Serialize the cars to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("cars.json"), electricCar);
            System.out.println("JSON file created successfully.");
            String jsonContent = objectMapper.writeValueAsString(car);
            System.out.println("Car Hierarchy: " + jsonContent);

        // Deserialize the JSON file back into cars
            Cars deserializedCar = objectMapper.readValue(new File("cars.json"), Cars.class);

            // Print the deserialized car
            System.out.println(deserializedCar);
        } catch (IOException e) {
            System.out.println("Failed to parse JSON file: " + e.getMessage());
        }
    }
}*/




        // Create instances of the car hierarchy classes
        CarModel car = new CarModel();
        car.setCarId(1);
        car.setName("Toyota");
        car.setModel("Camry");
        car.setYear(2022);
        car.setPrice(25000);
        car.setDate(new Date());


        ElectricCarModel electricCar = new ElectricCarModel();
        electricCar.setCarId(4);
        electricCar.setName("Tesla");
        electricCar.setModel("Model 3");
        electricCar.setBatteryCapacity(80);
        electricCar.setPrice(29000);
        electricCar.setDate(new Date());


        GasolineCarModel gasolineCar = new GasolineCarModel();
        gasolineCar.setCarId(7);
        gasolineCar.setName("Nissan");
        gasolineCar.setModel("Versa");
        gasolineCar.setFuelEconomy(35);
        gasolineCar.setPrice(15000);
        gasolineCar.setDate(new Date());


        SportsCarModel sportsCar = new SportsCarModel();
        sportsCar.setCarId(10);
        sportsCar.setName("Porsche");
        sportsCar.setModel("Cayman");
        sportsCar.setTopSpeed(200);
        sportsCar.setPrice(63400);
        sportsCar.setDate(new Date());


        UsedCarModel usedCar = new UsedCarModel();
        usedCar.setCarId(13);
        usedCar.setName("Chevrolet");
        usedCar.setModel("Camaro");
        usedCar.setMileage(6794);
        usedCar.setPrice(48000);
        usedCar.setDate(new Date());

        List<CarModel> carList = Arrays.asList(car, electricCar, gasolineCar, sportsCar, usedCar);


        // Create an array of car objects
        //CarModel[] cars = {car, usedCar, sportsCar, electricCar, gasolineCar};


        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();


        try {
            // Write the array of car objects to a JSON file. Serialize
            //objectMapper.writeValue(new File("src/main/resources/cars.json"), carList);
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

            //System.out.println("JSON file created successfully.");

            String jsonContent = objectMapper.writeValueAsString(carList);
            System.out.println("Car Hierarchy: " + jsonContent);

            Cars deserializedCar;
            deserializedCar = objectMapper.readValue(new File("cars.json"), Cars.class);
            System.out.println(deserializedCar);



        } catch (IOException e) {
            System.out.println("Failed to create JSON file: " + e.getMessage());
        }
    }
}
