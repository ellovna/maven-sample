package com.solvd.laba.database.dao.jdbc.service;

import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.model.CarAccidentModel;
import com.solvd.laba.database.dao.model.CarModel;
import com.solvd.laba.database.dao.model.CarsPriceListModel;

import java.sql.SQLException;
import java.util.List;

public class CarAccidentService implements IDAO<CarAccidentModel> {
    private final IDAO<CarAccidentModel> carAccidentDAO;

    public CarAccidentService(IDAO<CarAccidentModel> carAccidentDAO) {

        this.carAccidentDAO = carAccidentDAO;
    }

    @Override
    public List<CarAccidentModel> getAll() throws SQLException {
        return carAccidentDAO.getAll();
    }

    @Override
    public void create(CarAccidentModel entity) throws SQLException {
        carAccidentDAO.create(entity);

    }

    @Override
    public void update(CarAccidentModel entity) throws SQLException {
        carAccidentDAO.update(entity);

    }

    @Override
    public void delete(int car_id) throws SQLException {
        carAccidentDAO.delete(car_id);
    }

    @Override
    public CarAccidentModel getById(int car_id) throws SQLException {
        return carAccidentDAO.getById(car_id);
    }
}
