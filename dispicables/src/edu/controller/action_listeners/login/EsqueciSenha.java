package edu.controller.action_listeners.login;

import edu.model.dao.EleitorDAO;
import edu.view.login.TelaEsqueciSenha;
import edu.view.login.TelaLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EsqueciSenha implements ActionListener {
    private TelaEsqueciSenha telaEsqueci;
    private final JFrame janelaAnterior;


    public EsqueciSenha(JFrame janelaAnterior, TelaEsqueciSenha telaEsqueci ) {
        this.janelaAnterior = janelaAnterior;
        this.telaEsqueci = telaEsqueci;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EleitorDAO control = new EleitorDAO();
        if (control.checkEmail(telaEsqueci.getTxtEmail().getText())) {
            new TelaLogin();
            janelaAnterior.dispose();
            JOptionPane.showMessageDialog(null, "Enviamos uma senha nova para seu email", "MVF - EMAIL ENVIADO", JOptionPane.INFORMATION_MESSAGE);
            //TODO: Fazer enviar um email para este email valido
        } else {
            JOptionPane.showMessageDialog(null, "Email incorreto, por favor coloque um email valido", "MVF - Email incorreto", JOptionPane.ERROR_MESSAGE);
        }
    }
}
