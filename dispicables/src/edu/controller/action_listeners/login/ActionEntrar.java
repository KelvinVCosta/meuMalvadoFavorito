package edu.controller.action_listeners.login;

import edu.model.dao.EleitorDAO;
import edu.model.dao.LogginDAO;
import edu.view.TelaMain;
import edu.view.login.TelaLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEntrar implements ActionListener {

    private final JFrame janelaAnterior;
    private final TelaLogin telaLogin;


    public ActionEntrar(JFrame janelaAnterior, TelaLogin telaLogin) {
        this.janelaAnterior = janelaAnterior;
        this.telaLogin = telaLogin;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        EleitorDAO control = new EleitorDAO();
        if (control.LoginCheck(telaLogin.getTxtLogin().getText(), String.valueOf(telaLogin.getTxtSenha().getPassword()))) { //TODO: Senha sendo tratada como getText(). Deve-se alterar para tratar como getPassword.
        		LogginDAO logginDAO = new LogginDAO();
        	if(telaLogin.getLembrarmim().isSelected()){
                
                logginDAO.Adicionar(telaLogin.getTxtLogin().getText());
            } else {
            	logginDAO.RemoverTxt();
            	
            }


            new TelaMain(telaLogin.getTxtLogin().getText());
            janelaAnterior.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos", "MVF - Erro ao logar", JOptionPane.ERROR_MESSAGE);
        }

    }
}
