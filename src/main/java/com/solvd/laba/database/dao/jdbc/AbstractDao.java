package com.solvd.laba.database.dao.jdbc;

import com.solvd.laba.database.dao.jdbc.interfaces.DatabaseConnection;
import com.solvd.laba.database.dao.jdbc.interfaces.IDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDao implements DatabaseConnection {
    // Common implementations for CRUD operations using JDBC
    // Implementations can be overridden in specific DAO classes if required

    protected Connection connection;

    public AbstractDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ResultSet executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }

    @Override
    public int executeUpdate(String query) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(query);
    }

}

