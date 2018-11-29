package edu.controller.action_listeners.votar;

import edu.controller.dto.Proposicao;
import edu.model.dao.ProposicaoDAO;
import edu.view.votar.TelaVotar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class ActionNavegar implements ActionListener {
    TelaVotar telaVotar;
    Proposicao proposicao ;
    ProposicaoDAO proposicaoDAO = new ProposicaoDAO();
    public ActionNavegar(TelaVotar telaVotar) {
        this.telaVotar = telaVotar;
    }

    private void setDados () {
        telaVotar.getJanela().setTitle(proposicao.getEmenta());
        telaVotar.getAreaConteudoProposicao().setText(proposicao.getTexto());
        telaVotar.getLblTipoProposicao().setText(proposicao.getEmentaDetalhada());
    }

    @Override
    public void actionPerformed(ActionEvent navegar)  {

        if ("Anterior".equals(navegar.getActionCommand())){
            if (telaVotar.getI() > 1 ) {
                telaVotar.setI(telaVotar.getI()-1);
                try {
                    proposicao = proposicaoDAO.getProposicao(telaVotar.getI());
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                setDados();
            } else {
                JOptionPane.showMessageDialog(null, "Está é a primeira proposição", "Erro ao mostrar anterior", JOptionPane.ERROR_MESSAGE);
            }
        } else if ("Próximo".equals(navegar.getActionCommand())){
            if (telaVotar.getI() < 10 ) {
                telaVotar.setI(telaVotar.getI()+1);
                try {
                    proposicao = proposicaoDAO.getProposicao(telaVotar.getI());
                } catch (SQLException e) {

                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                setDados();
            } else {
                JOptionPane.showMessageDialog(null, "Está é a última proposição", "Erro ao mostrar anterior", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}