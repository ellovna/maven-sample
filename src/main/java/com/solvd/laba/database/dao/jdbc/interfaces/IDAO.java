package com.solvd.laba.database.dao.jdbc.interfaces;

import com.solvd.laba.database.dao.model.CarAccidentModel;
import com.solvd.laba.database.dao.model.ElectricCarModel;
import com.sun.xml.bind.v2.model.core.ID;

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
