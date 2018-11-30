package edu.controller.action_listeners;

import edu.view.alterar.TelaAlterar2;
import edu.view.lecomparativos.TelaComparativo;
import edu.view.votar.TelaVotar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame janelaAnterior;
    String login;
    public Main(JFrame janelaAnterior, String login) {
        this.janelaAnterior = janelaAnterior;
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Votar em proposição".equals(e.getActionCommand())) {
            new TelaVotar(login);
            janelaAnterior.dispose();
        } else if ("Ler Comparativos".equals(e.getActionCommand())) {
            new TelaComparativo(login);
            janelaAnterior.dispose();
        } else if ("Verificar votos realizados".equals(e.getActionCommand())) {
            new TelaAlterar2(login);
            janelaAnterior.dispose();
        }
    }
}
