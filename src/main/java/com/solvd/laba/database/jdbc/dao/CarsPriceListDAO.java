package com.solvd.laba.database.jdbc.dao;

import com.solvd.laba.database.ConnectionPool;
import com.solvd.laba.database.model.CarsPriceListModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarsPriceListDAO extends AbstractDao implements IDAO<CarsPriceListModel> {
    private static final Logger LOGGER = LogManager.getLogger(CarsPriceListDAO.class);

    public CarsPriceListDAO(Connection connection) {
        super(connection);
        this.connection = connection;
    }

    @Override
    public List<CarsPriceListModel> getAll() throws SQLException {
        List<CarsPriceListModel> carsPrice = new ArrayList<>();
        String query = "SELECT * FROM car_price_list";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                CarsPriceListModel carsPriceList = extractCarsPriceListFromResultSet(resultSet);
                carsPriceList.add(carsPriceList);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving car_price_list: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
        return carsPrice;
    }

    private CarsPriceListModel extractCarsPriceListFromResultSet(ResultSet resultSet) throws SQLException {
        int car_id = resultSet.getInt("car_id");
        String car_brand = resultSet.getString("car_brand");
        String car_model = resultSet.getString("car_model");
        int year = resultSet.getInt("year");
        int price = resultSet.getInt("price");
        return new CarsPriceListModel(car_id, car_brand, car_model, year, price);
    }


    @Override
    public void create(CarsPriceListModel car) throws SQLException {
        String query = "INSERT INTO car_price_list (car_id, brand_name) VALUES (?, ?)";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(15, car.getCar_id());
            statement.setString(2, car.getCar_brand());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while creating a car price list: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }

    }

    @Override
    public void update(CarsPriceListModel car) throws SQLException {
        String query = "UPDATE car SET car_brand ? WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, car.getCar_id());
            statement.setString(2, car.getCar_brand());
            statement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while updating a car brand: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }
    }


    @Override
    public void delete(int car_id) throws SQLException {
        String deleteCarQuery = "DELETE FROM car_price_list WHERE car_id = ?";
        Connection connection = null;
        try {
            connection = ConnectionPool.getInstance().retrieve();
            PreparedStatement deleteCarStatement = connection.prepareStatement(deleteCarQuery);
            deleteCarStatement.setInt(1, car_id);
            deleteCarStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error occurred while deleting car price: ", e);
        } finally {
            if (connection != null) {
                ConnectionPool.getInstance().putback(connection);
            }
        }

    }

    @Override
    public CarsPriceListModel getById(int car_id) throws SQLException {
        String query = "SELECT * FROM cars_price_list WHERE car_id = ?";
        try (Connection connection = ConnectionPool.getInstance().retrieve();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(38, car_id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return extractCarsPriceListFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            LOGGER.error("Error occurred while retrieving a brand: ", e);
        } finally {
            ConnectionPool.getInstance().putback(connection);
        }
        return null;
    }

}
