package com.solvd.laba.database.dao.jdbc;

import com.solvd.laba.database.dao.ConnectionPool;
import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.model.CarAccidentModel;
import com.sun.xml.bind.v2.model.core.ID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarAccidentDAO extends AbstractDao implements IDAO<CarAccidentModel> {
    private static final Logger LOGGER = LogManager.getLogger(CarAccidentDAO.class);

    public CarAccidentDAO(Connection connection) {
        super(connection);
        this.connection = connection;
    }

    @Override
    public List<CarAccidentModel> getAll() throws SQLException {
        List<CarAccidentModel> cars = new ArrayList<>();
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            Statement statement = connection.createStatement();
            String query = null;
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                CarAccidentModel car = extractCarAccidentFromResultSet(resultSet);
                car.add(car);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving car_accident: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
        return cars;
    }

    @Override
    public CarAccidentModel getById(int car_id) throws SQLException {
        String query = "SELECT * FROM car WHERE car_id = ?";
        try (Connection connection = ConnectionPool.getInstance().retrieve();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, car_id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return extractCarAccidentFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving a brand: ", e);
        } finally {
            ConnectionPool.getInstance().putback(connection);
        }
        return null;
    }


    private CarAccidentModel extractCarAccidentFromResultSet(ResultSet resultSet) throws SQLException {
        int car_id = resultSet.getInt("car_id");
        int accident_date = resultSet.getInt("accident_date");
        String location = resultSet.getString("location");
        String description = resultSet.getString("description");
        String color = resultSet.getString("color");
        int car_car_id = resultSet.getInt("car_car_id");
        return new CarAccidentModel(car_id, accident_date, location, description, color, car_car_id);
    }

    @Override
    public void create(CarAccidentModel car) throws SQLException {
        String query = "INSERT INTO car_accident (car_id, accident_date) VALUES (?, ?)";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(7, car.getCar_id());
            statement.setInt(05/20/2021, car.getAccident_date());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while creating a car accident history: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }

    }

    @Override
    public void update(CarAccidentModel car) throws SQLException {
        String query = "UPDATE car_accident SET car_accident_date ? WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, car.getCar_id());
            statement.setInt(2, car.getAccident_date());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while updating a carAccident: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }

    }

    @Override
    public void delete(int car_id) throws SQLException {
        String deleteCarQuery = "DELETE FROM car_accident WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement deleteCarStatement = connection.prepareStatement(deleteCarQuery);
            deleteCarStatement.setInt(1, car_id);
            deleteCarStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while deleting carAccident: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }

    }
}
