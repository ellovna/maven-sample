package com.solvd.laba.database.service;

import com.solvd.laba.database.jdbc.dao.CarDAO;
import com.solvd.laba.database.jdbc.dao.IDAO;
import com.solvd.laba.database.model.CarModel;

import java.sql.SQLException;
import java.util.List;

public class CarService implements IDAO<CarModel>{

    IDAO<CarModel> carDAO;
    public CarService(CarDAO carDAO) {
            this.carDAO = this.carDAO;
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

