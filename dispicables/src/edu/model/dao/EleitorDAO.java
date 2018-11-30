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
    public List<ComparativoDTO> getComparativo(Eleitor eleitor) throws SQLException, ClassNotFoundException {
        int id = getEleitorId(eleitor.getEmail());
        String query = "select\n" +
                "\tq_vd.deputado_id,\n" +
                "\td.nome nome_deputado,\n" +
                "\tsum(case when ve.voto = q_vd.voto then 1 else 0 end) votos_iguais, \n" +
                "\tcount(case when ve.voto is not null and q_vd.voto is not null then 1 else 0 end) votos_totais\n" +
                "from voto_eleitor ve\n" +
                "inner join (\n" +
                "\tselect \n" +
                "\t\tq1.proposicao_id,\n" +
                "\t\tq1.deputado_id,\n" +
                "\t\tq1.voto\n" +
                "\tfrom (\n" +
                "\t\tselect  \n" +
                "\t\t\tv.proposicao_id, \n" +
                "\t\t\tvd.deputado_id, \n" +
                "\t\t\tvd.voto,\n" +
                "\t\t\tv.data_votacao\n" +
                "\t\tfrom votacao v\n" +
                "\t\tinner join voto_deputado vd\n" +
                "\t\ton v.id = vd.votacao_id\n" +
                "\t) q1\n" +
                "\tinner join (\n" +
                "\t\tselect  \n" +
                "\t\t\tv.proposicao_id, \n" +
                "\t\t\tvd.deputado_id, \n" +
                "\t\t\tmax(v.data_votacao) as data_votacao\n" +
                "\t\tfrom votacao v\n" +
                "\t\tinner join voto_deputado vd\n" +
                "\t\ton v.id = vd.votacao_id\n" +
                "\t\tgroup by v.proposicao_id, vd.deputado_id\n" +
                "\t) q2\n" +
                "\ton \n" +
                "\t\tq1.proposicao_id = q2.proposicao_id \n" +
                "\t\tand q1.deputado_id = q2.deputado_id\n" +
                "\t\tand q1.data_votacao = q2.data_votacao\n" +
                ") q_vd\n" +
                "on ve.proposicao_id = q_vd.proposicao_id\n" +
                "inner join deputado d\n" +
                "on q_vd.deputado_id = d.id \n" +
                "where ve.eleitor_id = " + id + "\n" +
                "group by q_vd.deputado_id, d.nome;";

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
