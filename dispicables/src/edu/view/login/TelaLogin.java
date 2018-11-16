package edu.view.login;

import edu.controller.action_listeners.login.Login;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin {
	public TelaLogin() {
		criarLayout();
	}

	private void criarLayout() {
// 		Cria��o da Janela, painel e objetos necess�rios
		JFrame janela = new JFrame("MVF - Login");
		
		JPanel painelPrincipal = new JPanel(new GridBagLayout());// Criando o painel principal e setando como
														// GridBagLayout.
		GridBagConstraints gbc = new GridBagConstraints();
		
// 		Cria��o para colocar dentro do painel
		JLabel login = new JLabel("Login");
		JLabel senha = new JLabel("Senha");
		
		JTextField txtLogin = new JTextField();
		JPasswordField txtSenha = new JPasswordField();
		
		JCheckBox lembrarMim = new JCheckBox("Lembrar de mim");
		
		JButton btnEsqSen = new JButton("Esqueci a senha");
		
		JButton btnEntrar = new JButton("Entrar");
		JButton btnCad = new JButton("Cadastrar");
		
//		Adicionando os componentes ao painel		
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.25;
		gbc.insets = new Insets(4, 4, 4, 4);
		
		
		gbc.ipady = 7;
		painelPrincipal.add(login, gbc);
		gbc.gridx++;
		painelPrincipal.add(txtLogin, gbc);
		gbc.gridy = 1;
		gbc.gridx = 0;
		painelPrincipal.add(senha, gbc);
		gbc.gridx++;
		painelPrincipal.add(txtSenha, gbc);
		gbc.gridy = 2;
		gbc.gridx = 0;
		gbc.ipady = 0;
		painelPrincipal.add(lembrarMim, gbc);
		gbc.gridx++;
		painelPrincipal.add(btnEsqSen,gbc);
		gbc.gridy = 3;
		gbc.gridx = 0;
		painelPrincipal.add(btnEntrar,gbc);
		gbc.gridx++;
		painelPrincipal.add(btnCad,gbc);
		
//		Atribuindo Fun��es para os bot�es
        Login loginOuvinte = new Login(janela);
        btnEntrar.addActionListener(loginOuvinte);
        btnCad.addActionListener(loginOuvinte);
        btnEsqSen.addActionListener(loginOuvinte);
		
//		Atribui��es finais para a janela
		janela.setContentPane(painelPrincipal);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 300) / 2, (ds.height - 300) / 2);
		
		janela.setSize(300,300);
		janela.setVisible(true);
		janela.setResizable(false);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

}