package edu.controller.action_listeners.votar;

import edu.controller.dto.Proposicao;
import edu.controller.dto.VotoEleitor;
import edu.model.dao.EleitorDAO;
import edu.model.dao.VotoEleitorDAO;
import edu.view.votar.TelaVotar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Votar implements ActionListener {
    JFrame janelaAnterior;
    String login;
    TelaVotar telaVotar;
    Proposicao proposicao;
    int id;
    VotoEleitorDAO votoEleitorDao = new VotoEleitorDAO();
    
    public Votar( String login, TelaVotar telaVotar, Proposicao proposicao) {
        this.login = login;
        this.telaVotar = telaVotar;
        this.proposicao = proposicao;
    }

    private void votarProposicao(boolean voto) {
    		VotoEleitor votoEleitor = new VotoEleitor();
    		EleitorDAO EleitorDAO = new EleitorDAO();
	    	votoEleitor.setId(proposicao.getId());
        try {
            votoEleitor.setIdEleitor(EleitorDAO.getEleitorId(login));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        votoEleitor.setVoto(voto);
	    	
	    	votoEleitorDao.adicionar(votoEleitor);
	    	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("A Favor".equals(e.getActionCommand())) {
            votarProposicao(true);
        } else if ("Contra".equals(e.getActionCommand())) {
            votarProposicao(false);
        }
    }


}
