package edu.model.dao;

import edu.controller.dto.Proposicao;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ProposicaoDAO extends DAO {
    public Proposicao getProposicao(int idProposicao) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM proposicao WHERE id = " + idProposicao;
        return selectProposicao(query);
    }
}