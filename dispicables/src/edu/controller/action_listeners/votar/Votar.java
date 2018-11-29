package edu.controller.action_listeners.votar;

import edu.controller.dto.Proposicao;
import edu.controller.dto.VotoEleitor;
import edu.model.dao.VotoEleitorDAO;
import edu.view.votar.TelaVotar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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

    public void setId(int id) {
        this.id = id;
    }

    private void jump(int voto) {
    		VotoEleitor votoEleitor = new VotoEleitor();
	    	votoEleitor.setId(proposicao.getId());
	    	votoEleitor.setLoginEleitor(login);
	    	votoEleitor.setVoto(voto);
	    	
	    	votoEleitorDao.adiconar(votoEleitor);
	    	
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("A Favor".equals(e.getActionCommand())) {
            jump(1);
            System.out.println("A favor");
        } else if ("Contra".equals(e.getActionCommand())) {
            jump(0);
            System.out.println("Contra");
        }
    }


}
