package com.solvd.laba.database;

import com.solvd.laba.database.jdbc.dao.*;
import com.solvd.laba.database.jdbc.dao.IDAO;
import com.solvd.laba.database.mapper.CarMapper;
import com.solvd.laba.database.model.*;
import com.solvd.laba.database.service.*;
import org.apache.ibatis.session.SqlSessionManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CarMain {
    private static final Logger LOGGER = LogManager.getLogger(CarMain.class);

    public static void main(String[] args) {

        Connection connection = ConnectionPool.getInstance().retrieve();

        //CarDAO carDAO = new CarDAO(connection);
        IDAO<CarModel> carDAO = new CarDAO(connection);
        //CarAccidentDAO carAccidentDAO = new CarAccidentDAO(connection);
        IDAO<CarAccidentModel> carAccidentDao = new CarAccidentDAO(connection);
        //CarOwnerDAO carOwnerDAO = new CarOwnerDAO(connection);
        IDAO<CarOwnerModel> carOwnerDAO = new CarOwnerDAO(connection);
        //CarsPriceListDAO carPriceListDAO = new CarsPriceListDAO(connection);
        IDAO<CarsPriceListModel> carsPriceListDAO = new CarsPriceListDAO(connection);
        //ElectricCarDAO electricCarDAO = new ElectricCarDAO(connection);
        IDAO<ElectricCarModel> electricCarDAO = new ElectricCarDAO(connection);



        try {
            List<CarModel> cars = carDAO.getAll();
            for (CarModel car : cars) {
                //System.out.println(cars);
                LOGGER.info(cars.toString());
            }

            //CarModel newCar = new CarModel(150, "Mercedes", "Benz", 2023, "red", 150, "Ali Lee");
            //carDAO.create(newCar);
            //LOGGER.info(newCar);

            //CarModel existingCar = carDAO.getById(1);
            //existingCar.setBrand("Toyota");
            //System.out.println(existingCar);
            //LOGGER.info(existingCar);
            //carDAO.update(existingCar);


            List<CarAccidentModel> carAccidents = carAccidentDao.getAll();
            for (CarAccidentModel carAccident : carAccidents) {
                //System.out.println(carsAccident);
                LOGGER.info(carAccidents.toString());
            }


            //CarAccidentModel newAccidentCar = new CarAccidentModel(150, 7/23/2021, "Colorado", "Scratch", "white", 150);
            //carAccidentDAO.create(newAccidentCar);


            LOGGER.info("----------------------------------------------------------------------");


            List<CarOwnerModel> carOwners = carOwnerDAO.getAll();
            for (CarOwnerModel carOwnerModel : carOwners) {
                //System.out.println(carsOwner);
                LOGGER.info(carOwners);
            }


            //CarOwnerModel newOwnerCar = new CarOwnerModel(56, "Will S", 150056, "will.smith@email.com");
            //carOwnerDAO.create(newOwnerCar);


            LOGGER.info("------------------------------------------------------------------");


            List<CarsPriceListModel> carsPrices = carsPriceListDAO.getAll();
            for (CarsPriceListModel carsPriceListModel : carsPrices) {
                //System.out.println(carsOwner);
                LOGGER.info(carsPrices);
            }


            //CarsPriceListModel newPriceList = new CarsPriceListModel(59, "Toyota", "Highlander", 2023, 30000);
            //carPriceListDAO.create(newPriceList);


            LOGGER.info("------------------------------------------------------------------");


            List<ElectricCarModel> electricCars = electricCarDAO.getAll();
            for (ElectricCarModel carPriceListModel : electricCars) {
                LOGGER.info(electricCars);
            }


            //ElectricCarModel newElectricCar = new ElectricCarModel(53, "Tesla", 99, 2, 65);
            //carPriceListDAO.create(newElectricCar);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionPool.getInstance().putback(connection);
        }
    }
}






