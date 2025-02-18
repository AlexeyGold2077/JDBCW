package ru.alexeygold2077.jdbcw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private final String URL;
    private final String DRIVER;

    private Connection connection;

    public DB(String url, String driver) throws ClassNotFoundException {
        this.URL = url;
        this.DRIVER = driver;
        Class.forName(DRIVER);
    }

    public void Connect() throws SQLException {
        connection = DriverManager.getConnection(URL);
    }

    public void Disconnect() throws SQLException {
        connection.close();
    }
}
