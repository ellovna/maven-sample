package com.solvd.laba.database.dao;

import com.solvd.laba.database.model.CarModel;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CarMain {
    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionPool.getInstance().retrieve();
        CarDAO carDAO = new CarDAO(connection);


        try {
            List<CarModel> cars = carDAO.getAll();
            for (CarModel car : cars) {
                System.out.println(cars);
            }


            //CarModel carModel = new CarModel(1, )
            //carDAO.create(carModel);

            CarModel existingCar = carDAO.getById(1);
            existingCar.setName("Toyota");
            System.out.println(existingCar);
            //carDAO.update(existingCar);

            //carDAO.delete(4);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionPool.getInstance().putback(connection);
        }
    }
}




