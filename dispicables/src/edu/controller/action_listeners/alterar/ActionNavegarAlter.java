package edu.controller.action_listeners.alterar;

import edu.controller.dto.Proposicao;
import edu.view.alterar.TelaAlterar2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ActionNavegarAlter implements ActionListener {
	    TelaAlterar2 telaAlterar2;
	    List<Proposicao> proposicoes;

	    public ActionNavegarAlter (TelaAlterar2 telaAlterar2, List<Proposicao> proposicoes) {
	        this.telaAlterar2 = telaAlterar2;
	        this.proposicoes = proposicoes;
	    }

	    private void setDados () {
	        telaAlterar2.getJanela().setTitle(proposicoes.get(telaAlterar2.getI()).getEmenta());
	        telaAlterar2.getAreaConteudoProposicao().setText(proposicoes.get(telaAlterar2.getI()).getTexto());
	    }

	    @Override
	    public void actionPerformed(ActionEvent navegar) {

	        if ("Anterior".equals(navegar.getActionCommand())){
	            if (telaAlterar2.getI() > 0 ) {
	                telaAlterar2.setI(telaAlterar2.getI()-1);
	                setDados();
	            } else {
	                JOptionPane.showMessageDialog(null, "Está é a primeira proposição", "Erro ao mostrar anterior", JOptionPane.ERROR_MESSAGE);
	            }
	        } else if ("Próximo".equals(navegar.getActionCommand())){
	            if (telaAlterar2.getI() < (proposicoes.size()-1) ) {
	                telaAlterar2.setI(telaAlterar2.getI()+1);
	                setDados();
	            } else {
	                JOptionPane.showMessageDialog(null, "Está é a última proposição", "Erro ao mostrar anterior", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }
	}