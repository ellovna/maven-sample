package com.solvd.laba.database.service;

import com.solvd.laba.database.jdbc.dao.IDAO;
import com.solvd.laba.database.model.CarModel;
import com.solvd.laba.database.model.CarOwnerModel;

import java.sql.SQLException;
import java.util.List;

public class CarOwnerService implements IDAO<CarOwnerModel> {
    private final IDAO<CarOwnerModel> carOwnerDAO;
    public CarOwnerService(IDAO<CarOwnerModel> carOwnerDAO) {
        this.carOwnerDAO = carOwnerDAO;
    }

    @Override
    public List<CarOwnerModel> getAll() throws SQLException {
        return carOwnerDAO.getAll();
    }

    @Override
    public void create(CarOwnerModel entity) throws SQLException {
        carOwnerDAO.create(entity);

    }

    @Override
    public void update(CarOwnerModel entity) throws SQLException {
        carOwnerDAO.update(entity);

    }

    @Override
    public void delete(int car_id) throws SQLException {
        carOwnerDAO.delete(car_id);

    }

    @Override
    public CarOwnerModel getById(int car_id) throws SQLException {
        return carOwnerDAO.getById(car_id);
    }


}


