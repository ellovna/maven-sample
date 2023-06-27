package com.solvd.laba.database.dao.jdbc.service;

import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.model.CarModel;

import java.sql.SQLException;
import java.util.List;

public class CarService implements IDAO<CarModel> {

    private final IDAO<CarModel> carDAO;
    public CarService(IDAO<CarModel> carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<CarModel> getAll() throws SQLException {
        return carDAO.getAll();
    }

    @Override
    public void create(CarModel entity) throws SQLException {
        carDAO.create(entity);

    }

    @Override
    public void update(CarModel entity) throws SQLException {
        carDAO.update(entity);

    }

    @Override
    public void delete(int car_id) throws SQLException {
        carDAO.delete(car_id);

    }

    @Override
    public CarModel getById(int car_id) throws SQLException {
        return carDAO.getById(car_id);
    }
}
