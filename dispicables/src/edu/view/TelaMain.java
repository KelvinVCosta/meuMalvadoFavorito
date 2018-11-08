package edu.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaMain {

	public TelaMain() {
		JFrame telaMain = new JFrame("Meu Malvado Favorito");
		JPanel painelPrincipal = new JPanel(new BorderLayout()); // Painel principal onde vãos os outros paineis
		JPanel painelBotoes = new JPanel();

//		Botões da tela principal.
		JButton btnVotar = new JButton("Votar em proposição");
		JButton btnLer = new JButton("Ler Comparativos");
		JButton btnVerificar = new JButton("Verificar votos realizados");

		painelPrincipal.add(painelBotoes, BorderLayout.CENTER);
		painelPrincipal.add(new JLabel("Meu Malvado Favorito"), BorderLayout.NORTH);
		painelBotoes.add(btnVotar);
		painelBotoes.add(btnLer);
		painelBotoes.add(btnVerificar);

		telaMain.setContentPane(painelPrincipal);

		telaMain.setSize(800, 400);
		telaMain.setVisible(true);
		telaMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
