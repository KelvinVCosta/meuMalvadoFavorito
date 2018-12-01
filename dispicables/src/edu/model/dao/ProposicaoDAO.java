package edu.model.dao;

import edu.controller.dto.Proposicao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProposicaoDAO extends DAO {
    public List getProposicao() throws SQLException, ClassNotFoundException {
        List<Proposicao> propocicoes= new ArrayList<>();
        String query = "SELECT * FROM proposicao";
        ResultSet rs = selectRS(query);

        while (rs.next()) {
            Proposicao proposicao = new Proposicao();
            proposicao.setId(rs.getInt("id"));
            proposicao.setEmenta(rs.getString("ementa"));
            proposicao.setEmentaDetalhada(rs.getString("ementa_detalhada"));
            proposicao.setTexto(rs.getString("texto"));
            propocicoes.add(proposicao);
        }
        return propocicoes;
    }
}