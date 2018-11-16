package edu.view.login;

import edu.controller.action_listeners.login.EsqueciSenha;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaEsqueciSenha {
	public TelaEsqueciSenha() {
		criarLayout();
	}

	private void criarLayout() {
// 		Cria��o da Janela, painel e objetos necess�rios
		JFrame janela = new JFrame("MVF - Esqueci minha senha ");
		
		JPanel painelPrincipal = new JPanel(new GridBagLayout());// Criando o painel principal e setando como
														// GridBagLayout.
		GridBagConstraints gbc = new GridBagConstraints();
//		Cria��o dos componentes para colocar dentro do painel
		JLabel descUse = new JLabel("Digite o E-mail cadastrado, por favor.");
		JLabel descUse2 = new JLabel("Ser� enviado um email imediatamente para voc�  ");
		JLabel descUse3	= new JLabel("com um link de redefini��o.");
		
		JTextField txtEMail = new JTextField("exemplo@exemplo.com");
		
		JButton btnEnviar = new JButton("Enviar");

//		Adicionando acao ao botao
		EsqueciSenha ouv = new EsqueciSenha(janela);
		btnEnviar.addActionListener(ouv);
//		Adicionando os componentes ao painel
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.25;
		gbc.insets = new Insets(4, 4, 4, 4);
		
		gbc.ipady = 50;
		gbc.gridwidth = 2;
		painelPrincipal.add(descUse, gbc);
		gbc.gridy++;
		gbc.gridwidth = 0;    
		gbc.ipady = 15;
		painelPrincipal.add(txtEMail, gbc);
		gbc.gridy++;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		painelPrincipal.add(descUse2, gbc);
		gbc.gridy++;
		painelPrincipal.add(descUse3, gbc);
		gbc.gridy++;
		gbc.ipady = 5;
		painelPrincipal.add(btnEnviar, gbc);
		
		
		
//		Atribui��es finais para a janela
		janela.setContentPane(painelPrincipal);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 300) / 2, (ds.height - 300) / 2);
		
		janela.setSize(400,300);
		janela.setVisible(true);
        janela.setResizable(false);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
