package com.solvd.laba.database.dao.jdbc;

import com.solvd.laba.database.dao.ConnectionPool;
import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.model.CarModel;
import com.solvd.laba.database.dao.model.ElectricCarModel;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;

public class CarDAO extends AbstractDao implements IDAO<CarModel> {
    private static final Logger LOGGER = LogManager.getLogger(CarDAO.class);
    private final Connection connection;

    public CarDAO(Connection connection) {
        super(connection);
        this.connection = connection;
    }

    @Override
    public List<CarModel> getAll() throws SQLException {
        List<CarModel> cars = new ArrayList<>();
        String query = "SELECT * FROM car";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                CarModel car = extractCarFromResultSet(resultSet);
                cars.add(car);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving car: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
        return cars;
    }


    @Override
    public void create(CarModel car) throws SQLException {
        String query = "INSERT INTO car (car_id, brand) VALUES (?, ?)";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, car.getCar_id());
            statement.setString(2, car.getBrand());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while creating a car: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
    }

    @Override
    public void update(CarModel car) throws SQLException {
        String query = "UPDATE car SET car_brand ? WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, car.getCar_id());
            statement.setString(2, car.getBrand());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while updating a car: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
    }

    @Override
    public void delete(int car_id) throws SQLException {
        String deleteCarQuery = "DELETE FROM car WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement deleteCarStatement = connection.prepareStatement(deleteCarQuery);
            deleteCarStatement.setInt(1, car_id);
            deleteCarStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while deleting a brand: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
    }

    public CarModel getById(int car_id) throws SQLException {
        String query = "SELECT * FROM car WHERE car_id = ?";
        try (Connection connection = ConnectionPool.getInstance().retrieve();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, car_id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return extractCarFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving a brand: ", e);
        } finally {
            ConnectionPool.getInstance().putback(connection);
        }
        return null;
    }

    private CarModel extractCarFromResultSet(ResultSet resultSet) throws SQLException {
        int car_id = resultSet.getInt("car_id");
        String brand = resultSet.getString("brand");
        String model = resultSet.getString("model");
        int year = resultSet.getInt("year");
        String color = resultSet.getString("color");
        int car_owner_car_id = resultSet.getInt("car_owner_car_id");
        String car_owner_owner_name = resultSet.getString("car_owner_owner_name");
        return new CarModel(car_id, brand, model, year, color, car_owner_car_id, car_owner_owner_name);
    }
}




