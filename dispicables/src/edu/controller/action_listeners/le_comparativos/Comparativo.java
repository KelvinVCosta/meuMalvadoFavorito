package edu.controller.action_listeners.le_comparativos;

import edu.view.TelaMain;
import edu.view.lecomparativos.TelaComparativoRank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comparativo implements ActionListener {
    JFrame janelaAnterior;
    String login;
    public Comparativo(JFrame janelaAnterior,String login) {
        this.janelaAnterior = janelaAnterior;
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Ver Rank".equals(e.getActionCommand())){
            janelaAnterior.dispose();
            new TelaComparativoRank(login);
        } else if ("Voltar".equals(e.getActionCommand())){
            janelaAnterior.dispose();
            new TelaMain();
        }
    }
}
