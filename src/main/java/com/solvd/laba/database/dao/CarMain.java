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


            //CarModel newCar = new CarModel(447, "BMW", "X6", 2023, 15000, "2023-06-20 14:30:00");
            //carDAO.create(newCar);

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




