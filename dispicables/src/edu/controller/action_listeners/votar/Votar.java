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
    int id;
    VotoEleitorDAO votoEleitorDao = new VotoEleitorDAO();
    
    public Votar( String login, TelaVotar telaVotar) {
        this.login = login;
        this.telaVotar = telaVotar;
    }

    private void votarProposicao(boolean voto) {
    		VotoEleitor votoEleitor = new VotoEleitor();
    		EleitorDAO EleitorDAO = new EleitorDAO();
	    	votoEleitor.setId(telaVotar.getProposicoes().get(telaVotar.getI()).getId());
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
            JOptionPane.showMessageDialog(null, "Voto a favor realizado!", "MVF - Voto realizado", JOptionPane.INFORMATION_MESSAGE);
        } else if ("Contra".equals(e.getActionCommand())) {
            votarProposicao(false);
            JOptionPane.showMessageDialog(null, "Voto contra realizado!", "MVF - Voto realizado", JOptionPane.INFORMATION_MESSAGE);
        }
    }


}
