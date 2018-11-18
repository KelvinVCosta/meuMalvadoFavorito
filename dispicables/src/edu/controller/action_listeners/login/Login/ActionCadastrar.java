package edu.controller.action_listeners.login.Login;

import edu.view.login.TelaCadastro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCadastrar implements ActionListener {
    JFrame janelaAnterior;

    public ActionCadastrar(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//            Comandos do Cadastrar
        new TelaCadastro();
        janelaAnterior.dispose();

    }
}