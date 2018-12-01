package edu.controller.action_listeners.le_comparativos;

import edu.view.lecomparativos.TelaComparativo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComparativosRank implements ActionListener {
    JFrame janelaAnterior;
    String login;
    public ComparativosRank(JFrame janelaAnterior, String login) {
        this.janelaAnterior = janelaAnterior;
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            janelaAnterior.dispose();
            new TelaComparativo(login);
    }
}