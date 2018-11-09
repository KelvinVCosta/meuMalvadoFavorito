package edu.view.login;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaCadastro {
	public TelaCadastro() {
		criarLayout();
	}

	private void criarLayout() {
// 		Criação da Janela, painel e objetos necessários
		JFrame janela = new JFrame("MVF - Cadastro ");
		
		JPanel painelPrincipal = new JPanel(new GridBagLayout());// Criando o painel principal e setando como
														// GridBagLayout.
		GridBagConstraints gbc = new GridBagConstraints();
//		Criação dos componentes para colocar dentro do painel
		JLabel nome = new JLabel("Nome");
		JLabel login = new JLabel("Login");
		JLabel eMail = new JLabel("E-mail");
		JLabel senha = new JLabel("Senha");
		
		JTextField txtNome = new JTextField();
		JTextField txtLogin = new JTextField();
		JTextField txtEMail = new JTextField();
		JPasswordField txtSenha = new JPasswordField();
		
		JButton btnVoltar = new JButton("Voltar");
		JButton btnCadFinal = new JButton("Cadastrar");
		
//		Adicionando os componentes ao painel
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.25;
		gbc.insets = new Insets(4, 4, 4, 4);
		
		painelPrincipal.add(nome, gbc);
		gbc.gridx++;
		painelPrincipal.add(txtNome, gbc);
		gbc.gridy++;
		gbc.gridx = 0;
		painelPrincipal.add(login, gbc);
		gbc.gridx++;
		painelPrincipal.add(txtLogin, gbc);
		gbc.gridy++;
		gbc.gridx = 0;
		painelPrincipal.add(eMail, gbc);
		gbc.gridx++;
		painelPrincipal.add(txtEMail,gbc);
		gbc.gridy++;
		gbc.gridx = 0;
		painelPrincipal.add(senha,gbc);
		gbc.gridx++;
		painelPrincipal.add(txtSenha,gbc);
		gbc.gridy++;
		gbc.gridx = 0;
		painelPrincipal.add(btnVoltar,gbc);
		gbc.gridx++;
		painelPrincipal.add(btnCadFinal,gbc);
		
		
		
		
//		Atribuições finais para a janela
		janela.setContentPane(painelPrincipal);
		janela.setSize(300,300);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 300) / 2, (ds.height - 300) / 2);
		
		janela.setVisible(true);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
