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
    List<Proposicao> proposicoes;

    public ActionNavegar(TelaVotar telaVotar, List<Proposicao> proposicoes) {
        this.telaVotar = telaVotar;
        this.proposicoes = proposicoes;
    }

    private void setDados () {
        telaVotar.getJanela().setTitle(proposicoes.get(telaVotar.getI()).getEmenta());
        telaVotar.getAreaConteudoProposicao().setText(proposicoes.get(telaVotar.getI()).getTexto());
        telaVotar.getLblTipoProposicao().setText(proposicoes.get(telaVotar.getI()).getEmentaDetalhada());
    }

    @Override
    public void actionPerformed(ActionEvent navegar)  {

        if ("Anterior".equals(navegar.getActionCommand())){
            if (telaVotar.getI() > 0 ) {
                telaVotar.setI(telaVotar.getI()-1);
                setDados();
            } else {
                JOptionPane.showMessageDialog(null, "Está é a primeira proposição", "Erro ao mostrar anterior", JOptionPane.ERROR_MESSAGE);
            }
        } else if ("Próximo".equals(navegar.getActionCommand())){
            if (telaVotar.getI() < (proposicoes.size()-1) ) {
                telaVotar.setI(telaVotar.getI()+1);
                setDados();
            } else {
                JOptionPane.showMessageDialog(null, "Está é a última proposição", "Erro ao mostrar anterior", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}