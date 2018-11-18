package edu.controller.action_listeners.login.Login;

import edu.view.login.TelaEsqueciSenha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEsqueciSenha implements ActionListener {
    private final JFrame janelaAnterior;

    public ActionEsqueciSenha(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        new TelaEsqueciSenha();
        janelaAnterior.dispose();
    }
}
