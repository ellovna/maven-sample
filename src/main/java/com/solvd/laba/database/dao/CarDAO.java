package com.solvd.laba.database.dao;

import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.jdbc.AbstractDao;
import com.solvd.laba.database.model.CarModel;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;

public class CarDAO extends AbstractDao<CarModel> implements IDAO<CarModel> {
    private static final Logger LOGGER = LogManager.getLogger(CarDAO.class);
    private final Connection connection;

    public CarDAO(Connection connection) {
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
                car.add(car);
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
                statement.setInt(1, car.getId());
                statement.setString(2, car.getName());
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
        public void update (CarModel car) throws SQLException {
            String query = "UPDATE car SET car_brand ? WHERE car_id = ?";
            Connection connection = null;
            try {
                connection = ConnectionPool.getInstance().retrieve();
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, car.getId());
                statement.setString(2, car.getName());
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
    public void delete(int carId) throws SQLException {
        String deleteCarQuery = "DELETE FROM car WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement deleteCarStatement = connection.prepareStatement(deleteCarQuery);
            deleteCarStatement.setInt(1, carId);
            deleteCarStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while deleting a brand: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
    }
        public CarModel getById(int id) throws SQLException {
            String query = "SELECT * FROM car WHERE car_id = ?";
            try (Connection connection = ConnectionPool.getInstance().retrieve();
                 PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
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

    private CarModel extractCarFromResultSet (ResultSet resultSet) throws SQLException {
            int car_id = resultSet.getInt("car_id");
            String brand = resultSet.getString("brand");
            String model = resultSet.getString("model");
            int year = resultSet.getInt("year");
            String color = resultSet.getString("color");
            return new CarModel(car_id, brand, model, year, color);
        }

}



