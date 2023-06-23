package com.solvd.laba.jaxb;


import com.solvd.laba.Cars;
import com.solvd.laba.database.model.*;
import com.solvd.laba.xml.CarXmlParserRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class CarsJaxBReader {
    private static final Logger LOGGER = LogManager.getLogger(CarXmlParserRunner.class);

    public static void main(String[] args) throws JAXBException {

        try {
            JAXBContext context = JAXBContext.newInstance(Cars.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Cars cars = (Cars) unmarshaller.unmarshal(new File("src/main/resources/cars.xml"));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            //System.out.println(dtf.format(now));

            List<CarModel> carsList = cars.getCar();
            List<ElectricCarModel> electricCarModelList = cars.getElectricCars();
            List<GasolineCarModel> gasolineCarModelList = cars.getGasolineCars();
            List<SportsCarModel> sportsCarModelList = cars.getSportsCars();
            List<UsedCarModel> usedCarModelList = cars.getUsedCars();

            for (CarModel car : carsList) {
                //System.out.println("Car ID: " + car.getId());
                LOGGER.info("Car ID: " + car.getCarId());
                //System.out.println("Brand: " + car.getName());
                LOGGER.info("Brand: " + car.getName());
                //System.out.println("Model: " + car.getModel());
                LOGGER.info("Model: " + car.getModel());
                //System.out.println("Year: " + car.getYear());
                LOGGER.info("Year: " + car.getYear());
                //System.out.println("Price: " + car.getPrice());
                LOGGER.info("Price: " + car.getPrice());
                //System.out.println("Current Date: " + dtf.format(now));
                LOGGER.info("Current Date: " + dtf.format(now));
                //System.out.println();
                LOGGER.info("---------------------------------------------");
            }

            for (ElectricCarModel electricCarModel : electricCarModelList) {
                //System.out.println("Electric Car ID: " + electricCarModel.getId());
                LOGGER.info("Electric Car ID: " + electricCarModel.getCarId());
                //System.out.println("Brand: " + electricCarModel.getName());
                LOGGER.info("Brand: " + electricCarModel.getName());
                //System.out.println("Model: " + electricCarModel.getModel());
                LOGGER.info("Model: " + electricCarModel.getModel());
                //System.out.println("BatteryCapacity: " + electricCarModel.getBatteryCapacity());
                LOGGER.info("BatteryCapacity: " + electricCarModel.getBatteryCapacity());
                //System.out.println("Price: " + electricCarModel.getPrice());
                LOGGER.info("Price: " + electricCarModel.getPrice());
                //System.out.println("Current Date: " + dtf.format(now));
                LOGGER.info("Current Date: " + dtf.format(now));
                LOGGER.info("---------------------------------------------------------------");
            }

            for (GasolineCarModel gasolineCarModel : gasolineCarModelList) {
                //System.out.println("Gasoline Car ID: " + gasolineCarModel.getId());
                LOGGER.info("Gasoline Car ID: " + gasolineCarModel.getCarId());
                //System.out.println("Brand: " + gasolineCarModel.getName());
                LOGGER.info("Brand: " + gasolineCarModel.getName());
                //System.out.println("Model: " + gasolineCarModel.getModel());
                LOGGER.info("Model: " + gasolineCarModel.getModel());
                //System.out.println("Fuel economy: " + gasolineCarModel.getFuelEconomy());
                LOGGER.info("Fuel economy: " + gasolineCarModel.getFuelEconomy());
                //System.out.println("Price: " + gasolineCarModel.getPrice());
                LOGGER.info("Price: " + gasolineCarModel.getPrice());
                //System.out.println("Current Date: " + dtf.format(now));
                LOGGER.info("Current Date: " + dtf.format(now));
                LOGGER.info("-------------------------------------------------------");
            }

            for (SportsCarModel sportsCarModel : sportsCarModelList) {
                //System.out.println("Sports Car ID: " + sportsCarModel.getId());
                LOGGER.info("Sports Car ID: " + sportsCarModel.getCarId());
                //System.out.println("Brand: " + sportsCarModel.getName());
                LOGGER.info("Brand: " + sportsCarModel.getName());
                //System.out.println("Model: " + sportsCarModel.getModel());
                LOGGER.info("Model: " + sportsCarModel.getModel());
                //System.out.println("Top Speed: " + sportsCarModel.getTopSpeed());
                LOGGER.info("Top Speed: " + sportsCarModel.getTopSpeed());
                //System.out.println("Price: " + sportsCarModel.getPrice());
                LOGGER.info("Price: " + sportsCarModel.getPrice());
                //System.out.println("Current Date: " + dtf.format(now));
                LOGGER.info("Current Date: " + dtf.format(now));
                LOGGER.info("--------------------------------------------");
            }

            for (UsedCarModel usedCarModel : usedCarModelList) {
                //System.out.println("Used Car ID: " + usedCarModel.getId());
                LOGGER.info("Used Car ID: " + usedCarModel.getCarId());
                //System.out.println("Brand: " + usedCarModel.getName());
                LOGGER.info("Brand: " + usedCarModel.getName());
                //System.out.println("Model: " + usedCarModel.getModel());
                LOGGER.info("Model: " + usedCarModel.getModel());
                //System.out.println("Mileage: " + usedCarModel.getMileage());
                LOGGER.info("Mileage: " + usedCarModel.getMileage());
                //System.out.println("Price: " + usedCarModel.getPrice());
                LOGGER.info("Price: " + usedCarModel.getPrice());
                //System.out.println("Current Date: " + dtf.format(now));
                LOGGER.info("Current Date: " + dtf.format(now));
                LOGGER.info("-------------------------------------------");
            }

        }  catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}





