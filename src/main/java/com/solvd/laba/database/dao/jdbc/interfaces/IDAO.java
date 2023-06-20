package com.solvd.laba.database.dao.jdbc.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface IDAO<T> {
    // DAO interface defines and abstract API that performs CRUD operations on object of type T
    List<T> getAll() throws SQLException;
    void create(T entity) throws SQLException;
    void update(T entity) throws SQLException;

    void delete(int id) throws SQLException;
}
