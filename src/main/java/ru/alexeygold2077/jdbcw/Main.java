package ru.alexeygold2077.jdbcw;

import java.sql.SQLException;

public class Main {

    public static final String DB_URL = "jdbc:h2:/Users/alexey/Documents/programming/JDB/jdbcw_1";
    public static final String DB_Driver = "org.h2.Driver";

    public static void main(String[] args) {

        try {
            DB database = new DB(DB_URL, DB_Driver);
            database.Connect();
            database.Disconnect();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
