package edu.view.alterar;

import edu.controller.action_listeners.alterar.Alterar3;
import edu.controller.action_listeners.alterar.Alterar3Votar;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


//Referente ao protótipo TelaAlterarDetalhes

public class TelaAlterar3 {
	int eleitorId;
	public TelaAlterar2 telaAlterar2;
	public TelaAlterar3(TelaAlterar2 telaAlterar2) {
		this.telaAlterar2 = telaAlterar2;
		criarLayout();
	}
	public int getEleitorId() {
		return eleitorId;
	}

	public void criarLayout() {
//		Criação de Janela, painel e objetos necessários.
		JFrame janela = new JFrame("Deseja alterar seu voto?");
//		Criação de botões
		JButton btnCancel = new JButton("Cancelar");
		JButton btnContra = new JButton("Contra");
		JButton btnFavor = new JButton("Favor");

//		Adicionando funcionalidade nos botoes
        Alterar3 alterar3Ouvinte = new Alterar3(janela);
		Alterar3Votar alterar3Voltar = new Alterar3Votar(this, janela,telaAlterar2);
        btnCancel.addActionListener(alterar3Ouvinte);
        btnContra.addActionListener(alterar3Voltar);
        btnFavor.addActionListener(alterar3Voltar);

		JPanel painelBotoes = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		JLabel lbLQuestion = new JLabel("Deseja alterar seu voto?");

		gbc.gridx = 1;
		painelBotoes.add(lbLQuestion, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.25;
		gbc.insets = new Insets(4, 4, 4, 4);

		painelBotoes.add(btnCancel, gbc);
		gbc.gridx++;
		painelBotoes.add(btnContra, gbc);
		gbc.gridx++;
		painelBotoes.add(btnFavor, gbc);
		gbc.gridx++;

//		Adicionando o Tipo posicao no inicio do painel.

        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        janela.setLocation((ds.width - 400) / 2, (ds.height - 100) / 2);

//		Atributos finais da janela.
		janela.setContentPane(painelBotoes); // Setando o painelprincipal dentro da janela.

		janela.setSize(400, 100);
        janela.setResizable(false);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
