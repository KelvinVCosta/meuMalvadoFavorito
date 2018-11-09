package edu.view.alterar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

//Referente ao protótipo TelaAlterarDetalhes

public class TelaAlterar3 {
	public TelaAlterar3() {
		criarLayout();
	}

	public void criarLayout() {
//		Criação de Janela, painel e objetos necessários.
		JFrame janela = new JFrame("Deseja alterar seu voto?"); // TODO: Alterar o Título da janea conforme o titulo da
		// proposição mostrada na tela.

		// GridBagLayout.

		// sempre visivel.

//		Criação de botões
		JButton btnCancel = new JButton("Cancelar");
		JButton btnContra = new JButton("Contra");
		JButton btnFavor = new JButton("Favor");

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

//		Adicionando o Tipo Proposicao no inicio do painel.

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 800) / 2, (ds.height - 650) / 2);

//		Atributos finais da janela.
		janela.setContentPane(painelBotoes); // Setando o painelprincipal dentro da janela.

		janela.setSize(400, 100);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
