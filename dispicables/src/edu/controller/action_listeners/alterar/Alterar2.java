package edu.controller.action_listeners.alterar;

import edu.view.TelaMain;
import edu.view.alterar.TelaAlterar3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alterar2 implements ActionListener {
    JFrame janelaAnterior;

    public Alterar2(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Alterar".equals(e.getActionCommand())) {
            new TelaAlterar3();
        } else if ("Cancelar".equals(e.getActionCommand())) {
            janelaAnterior.dispose();
            new TelaMain();
        } else if ("Voltar".equals(e.getActionCommand())) {
//           Botao de navegacao entre Proposicoes
        } else if ("Pr�ximo".equals(e.getActionCommand())) {
//           Botao de navegacao entre Proposicoes
            System.out.println("Funciona com acento");

        } else if ("Pesquisar".equals(e.getActionCommand())) {
//          Botao que realiza a

        }
    }
}