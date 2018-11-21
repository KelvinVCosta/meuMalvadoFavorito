package edu.controller.action_listeners.votar;

import edu.view.TelaMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionVotar implements ActionListener {
    JFrame janelaAnterior;

    public ActionVotar(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent cancelar) {
        janelaAnterior.dispose();
        new TelaMain();
    }
}
