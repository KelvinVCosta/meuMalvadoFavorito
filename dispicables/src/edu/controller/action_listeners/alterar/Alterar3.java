package edu.controller.action_listeners.alterar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alterar3 implements ActionListener {
    JFrame janelaAnterior;

    public Alterar3(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Cancelar".equals(e.getActionCommand())) {
            janelaAnterior.dispose();
        } else if ("Contra".equals(e.getActionCommand())) {
//          Salva em banco a mudanca do eleitor
        } else if ("Favor".equals(e.getActionCommand())) {
//          Salva em banco a mudanca do eleitor
        }
    }
}
