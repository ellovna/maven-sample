package com.solvd.laba.database.dao.jdbc.interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface DatabaseConnection {
    // To support switching between databases and frameworks, you can define an interface for the database connection
    ResultSet executeQuery(String query) throws SQLException;
    int executeUpdate(String query) throws SQLException;
}
