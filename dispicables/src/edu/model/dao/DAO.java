package edu.model.dao;


import edu.controller.dto.Proposicao;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public abstract class DAO {

        private final String DRIVER = "org.postgresql.Driver";

        private Connection getConnection(){
            try{
                String url = "jdbc:postgresql://localhost:5432/dispicables";
                Properties props = new Properties();
                props.setProperty("user","postgres");
                props.setProperty("password","admin");
                props.setProperty("ssl","false");
                return DriverManager.getConnection(url, props);
            } catch (Exception ex){
                ex.printStackTrace();
            }
            return null;
        }

        protected ResultSet selectRS(String query) throws SQLException, ClassNotFoundException {
            Class.forName(DRIVER);
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            con.close();
            return rs;
        }

        protected boolean selectBoolean(String query) throws SQLException, ClassNotFoundException {
            Class.forName(DRIVER);
            Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            con.close();
            return rs.next();
        }

        protected void insertQuery(String table, String headers, String values) throws SQLException, ClassNotFoundException {
            Class.forName(DRIVER);
            Connection con = getConnection();

            String insertTableSQL = "INSERT INTO "+ table
                    + "(" + headers + ") VALUES"
                    + "(" + values + ")";
            PreparedStatement preparedStatement = con.prepareStatement(insertTableSQL);
            preparedStatement.executeUpdate();
            con.close();
        }

        protected void updateQuery(String newVoto ,int idProposicao,int idEleitor) throws SQLException, ClassNotFoundException {
            Class.forName(DRIVER);
            Connection con = getConnection();
            String updateTableSQL = "UPDATE voto_eleitor SET voto ="
                    + newVoto + " WHERE proposicao_id =" + idProposicao +" and "
                    + " eleitor_id = " + idEleitor;
            PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL);
            preparedStatement.executeUpdate();
            con.close();
        }

}
