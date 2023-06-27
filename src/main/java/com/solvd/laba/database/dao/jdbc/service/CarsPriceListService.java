package com.solvd.laba.database.dao.jdbc.service;

import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.model.CarModel;
import com.solvd.laba.database.dao.model.CarsPriceListModel;

import java.sql.SQLException;
import java.util.List;

public class CarsPriceListService implements IDAO<CarsPriceListModel> {
    private final IDAO<CarsPriceListModel> carsPriceListDAO;

    public CarsPriceListService(IDAO<CarsPriceListModel> carsPriceListDAO) {
        this.carsPriceListDAO = carsPriceListDAO;
    }

    @Override
    public List<CarsPriceListModel> getAll() throws SQLException {
        return carsPriceListDAO.getAll();
    }

    @Override
    public void create(CarsPriceListModel entity) throws SQLException {
        carsPriceListDAO.create(entity);

    }

    @Override
    public void update(CarsPriceListModel entity) throws SQLException {
        carsPriceListDAO.update(entity);

    }

    @Override
    public void delete(int car_id) throws SQLException {
        carsPriceListDAO.delete(car_id);

    }

    @Override
    public CarsPriceListModel getById(int car_id) throws SQLException {
        return carsPriceListDAO.getById(car_id);
    }
}
