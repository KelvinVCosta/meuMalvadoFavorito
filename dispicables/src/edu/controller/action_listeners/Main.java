package edu.controller.action_listeners;

import edu.view.alterar.TelaAlterar2;
import edu.view.lecomparativos.TelaComparativo;
import edu.view.votar.TelaVotar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame janelaAnterior;
    public Main(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("Votar em proposição".equals(e.getActionCommand())){
//            TODO:
            new TelaVotar();
            janelaAnterior.dispose();
        } else if ("Ler Comparativos".equals(e.getActionCommand())){
//            TODO:
            new TelaComparativo();
            janelaAnterior.dispose();
        } else if ("Verificar votos realizados".equals(e.getActionCommand())){
//            TODO:
            new TelaAlterar2();
            janelaAnterior.dispose();
        }

    }
}
