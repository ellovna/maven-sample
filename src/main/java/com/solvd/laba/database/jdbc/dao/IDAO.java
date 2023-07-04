package com.solvd.laba.database.jdbc.dao;

import com.solvd.laba.database.model.CarModel;
import com.solvd.laba.lambda.Car;

import java.sql.SQLException;
import java.util.List;

public interface IDAO<T> {
    // DAO interface defines and abstract API that performs CRUD operations on object of type T
    List<T> getAll() throws SQLException;

    void create(T entity) throws SQLException;

    void update(T entity) throws SQLException;

    void delete(int id) throws SQLException;
    T getById(int id) throws SQLException;


}
