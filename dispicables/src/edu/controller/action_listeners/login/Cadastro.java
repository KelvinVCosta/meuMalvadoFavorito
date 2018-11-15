package edu.controller.actionListeners.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.view.login.TelaLogin;
import javax.swing.*;

public class Cadastro implements ActionListener {
    JFrame janelaAnterior;

    public Cadastro(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("Cadastrar".equals(e.getActionCommand())){
//          TODO: efetua o cadastro

        } else if ("Voltar".equals(e.getActionCommand()))  {
            new TelaLogin();
            janelaAnterior.dispose();
        }
    }
}
