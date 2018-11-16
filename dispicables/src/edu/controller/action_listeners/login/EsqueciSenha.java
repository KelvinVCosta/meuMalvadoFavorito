package edu.controller.action_listeners.login;

import edu.view.login.TelaLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EsqueciSenha implements ActionListener {
    JFrame janelaAnterior;

    public EsqueciSenha(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        TODO: Verificar se o email existe, caso sim enviar um e-mail informando a nova senha. Informar por um JOptionPane
        new TelaLogin();
        janelaAnterior.dispose();

    }
}
