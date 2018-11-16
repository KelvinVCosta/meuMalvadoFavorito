package edu.controller.action_listeners.login;

import edu.view.TelaMain;
import edu.view.login.TelaCadastro;
import edu.view.login.TelaEsqueciSenha;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login implements ActionListener {
    JFrame janelaAnterior;

    public Login(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Entrar".equals(e.getActionCommand())) {
//            Comandos do entrar, buscar pelo DAO e comparar
            new TelaMain();
            janelaAnterior.dispose();

        } else if ("Esqueci a senha".equals(e.getActionCommand())) {
//            Comandos do Esqueci a Senha
            new TelaEsqueciSenha();
            janelaAnterior.dispose();

        } else {
//            Comandos do Cadastrar
            new TelaCadastro();
            janelaAnterior.dispose();

        }
    }
}