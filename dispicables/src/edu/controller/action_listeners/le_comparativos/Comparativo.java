package edu.controller.actionListeners.lecomparativos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comparativo implements ActionListener {
    JFrame janelaAnterior;

    public Comparativo(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Voltar".equals(e.getActionCommand())){

        } else if ("Ver Rank".equals(e.getActionCommand())){

        }
    }
}
