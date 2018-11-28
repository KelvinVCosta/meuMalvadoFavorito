package edu.model.dao;

import java.sql.*;

public class DAO {

    private final String DRIVER = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://localhost:5432/";
    private final String USERNAME = "postgres";
    private final String PASSWORD = "admin";

    protected ResultSet runQuery(Connection con, String query) throws SQLException {
        Statement stmt = con.createStatement();
        return stmt.executeQuery(query);
    }

    protected Connection createCon() throws SQLException{
        System.setProperty("jdbc.Drivers", DRIVER);
        return DriverManager.getConnection(url, user, password);
    }

    protected void destroyCon(Connection con) throws SQLException{
        con.close();
    }

}
