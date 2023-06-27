package com.solvd.laba.database.dao.jdbc.service;

import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;
import com.solvd.laba.database.dao.model.CarModel;
import com.solvd.laba.database.dao.model.CarsPriceListModel;
import com.solvd.laba.database.dao.model.ElectricCarModel;

import java.sql.SQLException;
import java.util.List;

public class ElectricCarService implements IDAO<ElectricCarModel> {
    private final IDAO<ElectricCarModel> electricCarDAO;

    public ElectricCarService(IDAO<ElectricCarModel> electricCarDAO) {

        this.electricCarDAO = electricCarDAO;
    }

    @Override
    public List<ElectricCarModel> getAll() throws SQLException {
        return electricCarDAO.getAll();
    }

    @Override
    public void create(ElectricCarModel entity) throws SQLException {
        electricCarDAO.create(entity);

    }

    @Override
    public void update(ElectricCarModel entity) throws SQLException {
        electricCarDAO.update(entity);

    }

    @Override
    public void delete(int car_id) throws SQLException {
        electricCarDAO.delete(car_id);

    }

    @Override
    public ElectricCarModel getById(int car_id) throws SQLException {
        return electricCarDAO.getById(car_id);
    }
}


