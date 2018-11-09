package edu.view.alterar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
		JFrame janela = new JFrame("Alterar Voto"); // TODO: Alterar o Título da janea conforme o titulo da
															// proposição mostrada na tela.

		JPanel painelPrincipal = new JPanel(new GridBagLayout()); // Criando o painel principal e setando como
																	// GridBagLayout.
		GridBagConstraints c = new GridBagConstraints();	
		
		JTextArea areaConteudoProposicao = new JTextArea(); // Criando TxtArea
		areaConteudoProposicao.setEditable(false); // Tornando o TxtArea não editável
		JScrollPane scrConteudo = new JScrollPane(areaConteudoProposicao); // Criando o ScrollBar e atribuindo ao TxtArea
		scrConteudo.setVisible(true);
		scrConteudo.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // Deixando o Scrol Bar
																								// sempre visivel.

//		Criação de botões
		JButton btnCancel = new JButton("Cancelar");
		JButton btnContra = new JButton("Contra");
		JButton btnFavor = new JButton("Voltar");

		JPanel painelBotoes = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weightx = 0.25;
		gbc.insets = new Insets(4, 4, 4, 4);

		painelBotoes.add(btnCancel, gbc);
		gbc.gridx++;
		painelBotoes.add(btnContra, gbc);
		gbc.gridx++;
		painelBotoes.add(btnFavor, gbc);
		gbc.gridx++;

//		Adicionando o Tipo Proposicao no inicio do painel.
		
		c.anchor = GridBagConstraints.FIRST_LINE_END;

//		Adicionando o PainelConteudo no principal.
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 150;
		c.weightx = 1.0;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 1;

//		Adicionando o painel com os botoes;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		c.gridheight = 3;
		c.weightx = 1.0;
		c.gridx = 0;
		c.gridy = 2;
		painelPrincipal.add(painelBotoes, c);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 800) / 2, (ds.height - 650) / 2);

//		Atributos finais da janela.
		janela.setContentPane(painelPrincipal); // Setando o painelprincipal dentro da janela.

		janela.setSize(400, 100);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
