package com.solvd.laba.database.dao.jdbc;

import com.solvd.laba.database.dao.ConnectionPool;
import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.model.CarAccidentModel;
import com.solvd.laba.database.dao.model.CarOwnerModel;
import com.solvd.laba.database.dao.model.ElectricCarModel;
import com.sun.xml.bind.v2.model.core.ID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarOwnerDAO extends AbstractDao implements IDAO<CarOwnerModel> {
    private static final Logger LOGGER = LogManager.getLogger(CarOwnerDAO.class);

    public CarOwnerDAO(Connection connection) {

        super(connection);
        this.connection = connection;
    }

    @Override
    public List<CarOwnerModel> getAll() throws SQLException {
        List<CarOwnerModel> carOwners = new ArrayList<>();
        String query = "SELECT * FROM car_owner";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                CarOwnerModel carOwner = extractCarOwnerFromResultSet(resultSet);
                carOwner.add(carOwner);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving car_owner: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
        return carOwners;
    }

    @Override
    public CarOwnerModel getById(int car_id) throws SQLException {
        String query = "SELECT * FROM car WHERE car_id = ?";
        try (Connection connection = ConnectionPool.getInstance().retrieve();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, car_id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return extractCarOwnerFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving a car_owner: ", e);
        } finally {
            ConnectionPool.getInstance().putback(connection);
        }
        return null;
    }


    private CarOwnerModel extractCarOwnerFromResultSet(ResultSet resultSet) throws SQLException {
        int car_id = resultSet.getInt("car_id");
        String owner_name = resultSet.getString("owner_name");
        int owner_contact_number = resultSet.getInt("owner_contact_number");
        String owner_email = resultSet.getString("owner_email");
        return new CarOwnerModel(car_id, owner_name, owner_contact_number, owner_email);
    }

    @Override
    public void create(CarOwnerModel car) throws SQLException {
        String query = "INSERT INTO car_owner (car_id, owner_name) VALUES (?, ?)";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, car.getCar_id());
            statement.setString(2, car.getOwner_name());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while creating a car owner: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
    }

    @Override
    public void update(CarOwnerModel car)  {
        String query = "UPDATE car SET owner_name ? WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, car.getCar_id());
            statement.setString(2, car.getOwner_name());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while updating a car owner: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
    }

    @Override
    public void delete(int car_id) throws SQLException {
        String deleteCarQuery = "DELETE FROM car_owner WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement deleteCarStatement = connection.prepareStatement(deleteCarQuery);
            deleteCarStatement.setInt(1, car_id);
            deleteCarStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while deleting car owner: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }


    }
}
