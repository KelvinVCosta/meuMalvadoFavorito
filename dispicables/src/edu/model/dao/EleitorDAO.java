package edu.model.dao;

import edu.controller.dto.ComparativoDTO;
import edu.controller.dto.Eleitor;
import edu.controller.dto.VotoEleitor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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

    public int getEleitorId(String email) throws SQLException, ClassNotFoundException {
        String query = "SELECT id FROM eleitor WHERE email = '" + email + "'";
        ResultSet rs = selectRS(query);
        rs.next();
        return rs.getInt("id");
    }

    public String getEleitorEmail(int id) throws SQLException, ClassNotFoundException {
        String query = "SELECT email FROM eleitor WHERE id = '" + id + "'";
        ResultSet rs = selectRS(query);
        rs.next();
        return rs.getString("email");
    }

    /**
     * Classe para comparação de votos do eleitor com os parlamentares
     * Retorna os seguintes headers dentro do ResultSet:
     *  deputado_id
     *  nome_deputador
     *  votos_iguais
     *  votos_totais
     * @param eleitor
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     *
     */
    public List<ComparativoDTO> getComparativo(int  idEleitor) throws SQLException, ClassNotFoundException {
        String query = "select q_vd.deputado_id, d.nome nome_deputado, sum(case when ve.voto = q_vd.voto then 1 else 0 end) votos_iguais, count(case when ve.voto is not null and q_vd.voto is not null then 1 else 0 end) votos_totais from voto_eleitor ve inner join ( select q1.proposicao_id, q1.deputado_id, q1.voto from ( select v.proposicao_id, vd.deputado_id, vd.voto, v.data_votacao from votacao v inner join voto_deputado vd on v.id = vd.votacao_id ) q1 inner join ( select v.proposicao_id, vd.deputado_id, max(v.data_votacao) as data_votacao from votacao v inner join voto_deputado vd on v.id = vd.votacao_id group by v.proposicao_id, vd.deputado_id ) q2 on q1.proposicao_id = q2.proposicao_id and q1.deputado_id = q2.deputado_id and q1.data_votacao = q2.data_votacao) q_vd on ve.proposicao_id = q_vd.proposicao_id inner join deputado d on q_vd.deputado_id = d.id where ve.eleitor_id = "+ idEleitor +" group by q_vd.deputado_id, d.nome";

        ResultSet rs = selectRS(query);
        List<ComparativoDTO> listaComparativo = new ArrayList<ComparativoDTO>();
        while(rs.next()){
            ComparativoDTO c = new ComparativoDTO();
            c.setDeputadoId(rs.getInt("deputado_id"));
            c.setNomeDeputado(rs.getString("nome_deputado"));
            c.setQtdVotosIguais(rs.getInt("votos_iguais"));
            c.setQtdVotosTotais(rs.getInt("votos_totais"));
            listaComparativo.add(c);
        }
        return listaComparativo;
    }
}
