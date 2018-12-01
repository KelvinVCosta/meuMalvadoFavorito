package edu.controller.action_listeners.votar;

import edu.view.TelaMain;
import edu.view.votar.TelaVotar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionVotar implements ActionListener {
    JFrame janelaAnterior;
    TelaVotar telaVotar;
    String email;
    public ActionVotar(JFrame janelaAnterior, TelaVotar telaVotar) {
    	this.janelaAnterior = janelaAnterior;
    	this.telaVotar = telaVotar;;
	}

	@Override
    public void actionPerformed(ActionEvent cancelar) {
		
        janelaAnterior.dispose();
        new TelaMain(telaVotar.getLogin());
    }
}
