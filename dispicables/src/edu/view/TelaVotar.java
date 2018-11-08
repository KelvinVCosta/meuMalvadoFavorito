package edu.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class TelaVotar {
	
	public TelaVotar() {
		JFrame janela = new JFrame("Votar");
		
		JPanel painelPrincipal = new JPanel(new BorderLayout());
		JPanel painelConteudo = new JPanel();
		JTextField tipoProposicao = new JTextField(30);
		JButton btnFavor = new JButton("A favor");
		JButton btnContra = new JButton("Contra");
		JButton btnCancel = new JButton("Cancelar");
		JButton btnProx = new JButton("Próximo");
		JTextArea conteudoProposicao = new JTextArea(9, 40);
		
		tipoProposicao.setEnabled(false);
		
		//TODO: deve ser carregado com variavel contendo Proposicao.getTipo()
		tipoProposicao.setText("Tipo"); 
		
		
		painelConteudo.setBorder(new CompoundBorder(new TitledBorder("Conteúdo"), null));
		
		painelPrincipal.add(painelConteudo, BorderLayout.CENTER);
		painelPrincipal.add(tipoProposicao, BorderLayout.NORTH);
		janela.setContentPane(painelPrincipal);
//		painelPrincipal.add(aFavor);
		
		janela.setSize(800, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
