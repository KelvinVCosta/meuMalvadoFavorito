package edu.view;

import edu.controller.action_listeners.Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaMain {

	public TelaMain() {
		criarLayout();
	}

	private void criarLayout() {
		JFrame janela = new JFrame("Meu Malvado Favorito");
		JPanel painelPrincipal = new JPanel(new BorderLayout()); // Painel principal onde vãos os outros paineis
		JPanel painelBotoes = new JPanel();

//		Botões da tela principal.
		JButton btnVotar = new JButton("Votar em proposição");
		JButton btnLer = new JButton("Ler Comparativos");
		JButton btnVerificar = new JButton("Verificar votos realizados");

//		Adiocionando os componentes ao painel
		painelPrincipal.add(painelBotoes, BorderLayout.CENTER);
		painelPrincipal.add(new JLabel("Meu Malvado Favorito"), BorderLayout.NORTH);
		painelBotoes.add(btnVotar);
		painelBotoes.add(btnLer);
		painelBotoes.add(btnVerificar);

//		Adicionando acoes aos botoes
        Main mainOuvinte = new Main(janela);
        btnVotar.addActionListener(mainOuvinte);
        btnLer.addActionListener(mainOuvinte);
        btnVerificar.addActionListener(mainOuvinte);

//      Finalizando ajustes da tela
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 800) / 2, (ds.height - 400) / 2);
		janela.setContentPane(painelPrincipal);
		janela.setSize(800, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
