package edu.controller.action_listeners.cadastro;

import edu.controller.dto.Eleitor;
import edu.model.dao.EleitorDAO;
import edu.view.login.TelaCadastro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Cadastrar implements ActionListener {
    private final TelaCadastro telaCadastro;

    EleitorDAO eleitorDAO = new EleitorDAO();

    public Cadastrar(TelaCadastro telaCadastro) {
    	this.telaCadastro = telaCadastro;
	}

	@Override
    public void actionPerformed(ActionEvent e) {
        //Criando novo Eleitor
        Eleitor eleitor = new Eleitor();
        eleitor.setEmail(telaCadastro.getTxtEmail().getText());
        eleitor.setSenha(String.valueOf(telaCadastro.getTxtSenha().getPassword()));
        //Limpando JTextFields
        telaCadastro.getTxtEmail().setText("");
        telaCadastro.getTxtSenha().setText("");
        //Adicionando o Eleitor no ArrayList.
        try {
            eleitorDAO.adicionar(eleitor);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.", "MVF - Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cadastro não efetuado. Favor, consultar o administrador do sistema", "MVF - Cadastro não realizado", JOptionPane.INFORMATION_MESSAGE);
            ex.printStackTrace();
        }
    }
}
