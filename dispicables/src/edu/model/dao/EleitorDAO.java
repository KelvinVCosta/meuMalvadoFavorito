package edu.model.dao;

import edu.controller.dto.Eleitor;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EleitorDAO extends DAO {

    private final String tableName = "eleitor";
    private final String headers = "email, senha";

    public void adicionar(Eleitor eleitor) throws SQLException, ClassNotFoundException {
        String values = "'" + eleitor.getEmail() + "', '" + eleitor.getSenha() + "'";
        insertQuery(tableName, headers, values);
    }

    public boolean loginCheck(String email, String senha) throws SQLException, ClassNotFoundException {
        String query = "SELECT email, senha FROM eleitor WHERE email = '" + email + "' and senha = '" + senha + "'";
        return selectBoolean(query);
    }

    public boolean checkEmail (String email) throws SQLException, ClassNotFoundException {
        String query = "SELECT email FROM eleitor WHERE email = '" + email + "'";
        return selectBoolean(query);
    }

}
