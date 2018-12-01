package edu.view.login;

import edu.controller.action_listeners.cadastro.Cadastrar;
import edu.controller.action_listeners.cadastro.Voltar;

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

    private final JTextField txtEmail = new JTextField();
    private final JPasswordField txtSenha = new JPasswordField();

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public TelaCadastro() {
		criarLayout();
	}

	private void criarLayout() {
// 		Criar Janela, painel e objetos necessários
		JFrame janela = new JFrame("MVF - cadastro ");
		
		JPanel painelPrincipal = new JPanel(new GridBagLayout());// Criando o painel principal e setando como
														// GridBagLayout.
		GridBagConstraints gbc = new GridBagConstraints();
//		Criar componentes para colocar dentro do painel
		JLabel eMail = new JLabel("E-mail");
		JLabel senha = new JLabel("Senha");

		JButton btnVoltar = new JButton("Voltar");
		JButton btnCadFinal = new JButton("Cadastrar");

//		Adicionando os componentes ao painel
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.25;
		gbc.insets = new Insets(4, 4, 4, 4);
		
		gbc.ipady = 7;
		gbc.gridx++;
		gbc.gridx = 0;
		painelPrincipal.add(eMail, gbc);
		gbc.gridx++;
		painelPrincipal.add(txtEmail,gbc);
		gbc.gridy++;
		gbc.gridx = 0;
		painelPrincipal.add(senha,gbc);
		gbc.gridx++;
		painelPrincipal.add(txtSenha,gbc);
		gbc.gridy++;
		gbc.gridx = 0;
		gbc.ipady = 0;
		painelPrincipal.add(btnVoltar,gbc);
		gbc.gridx++;
		painelPrincipal.add(btnCadFinal,gbc);

//		Adicionando acao aos botoes
        Voltar voltarOuvinte = new Voltar(janela);
        Cadastrar cadastrarOuvinte = new Cadastrar(this);
        btnCadFinal.addActionListener(cadastrarOuvinte);
        btnVoltar.addActionListener(voltarOuvinte);

//		Atribui��es finais para a janela
		janela.setContentPane(painelPrincipal);
		janela.setSize(300,300);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 300) / 2, (ds.height - 300) / 2);
		
		janela.setVisible(true);
		janela.setResizable(false);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
