package edu.model.dao;

import java.sql.*;

public class DAO {

    private final String DRIVER = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://localhost:5432/";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "admin";

    protected ResultSet runQuery(String query) throws SQLException {
        System.setProperty("jdbc.Drivers", DRIVER);
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        con.close();
        return rs;
    }

}
