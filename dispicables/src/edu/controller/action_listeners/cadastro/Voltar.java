package edu.controller.action_listeners.cadastro;

import edu.view.login.TelaLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Voltar implements ActionListener {
    JFrame janelaAnterior;

    public Voltar(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new TelaLogin();
        janelaAnterior.dispose();
    }
}