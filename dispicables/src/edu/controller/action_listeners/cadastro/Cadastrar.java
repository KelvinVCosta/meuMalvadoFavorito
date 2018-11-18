package edu.controller.action_listeners.cadastro;

import edu.controller.dto.Eleitor;
import edu.model.dao.EleitorDAO;
import edu.view.login.TelaCadastro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastrar implements ActionListener {
    private final JFrame janelaAnterior;
    private final TelaCadastro telaCadastro;

    EleitorDAO control = new EleitorDAO();

    public Cadastrar(JFrame janelaAnterior, TelaCadastro telaCadastro) {
        this.janelaAnterior = janelaAnterior;
        this.telaCadastro = telaCadastro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Criando novo Eleitor
        Eleitor eleitor = new Eleitor();
        //Setando dados do eleitor no objeto.
        eleitor.setNome(telaCadastro.getTxtNome().getText());
        eleitor.setEmail(telaCadastro.getTxtEMail().getText());
        eleitor.setSenha(telaCadastro.getTxtSenha().getText()); //TODO: Senha sendo tratada como getText(). Deve-se alterar para tratar como getPassword.
        eleitor.setLogin(telaCadastro.getTxtLogin().getText());
        //Limpando JTextFields
        telaCadastro.getTxtNome().setText("");
        telaCadastro.getTxtEMail().setText("");
        telaCadastro.getTxtSenha().setText("");
        telaCadastro.getTxtLogin().setText("");
        //Adicionando o Eleitor no ArrayList.
        control.Adicionar(eleitor);
        JOptionPane.showMessageDialog(null, "cadastro efetuado com sucesso.", "MVF - cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
    }
}
