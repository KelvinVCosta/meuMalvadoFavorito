package edu.view.lecomparativos;

import edu.controller.action_listeners.le_comparativos.ComparativosRank;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaComparativoRank {
	String login;
	public TelaComparativoRank(String login) {
		criarLayout();
		this.login = login;
	}

	private void criarLayout() {
		JFrame janela = new JFrame("Lista de Votos");
		
		JPanel painelPrincipal = new JPanel(new BorderLayout());
		
		JPanel painelTabela = new JPanel();
		JPanel painelBotao = new JPanel();
		
		String[][] data = { 
	            { "Kundan Kumar Jha", "100%" },
	            { "Anand Jha", "80%" },
	        }; 
		String[] columnNames = { "Nome deputado", "Votos iguais","Votos totais"};
		
		JTable tbVotos = new JTable(data, columnNames);
		tbVotos.setBounds(30, 40, 200, 300);
		
		JScrollPane scrPane = new JScrollPane(tbVotos);
		
		JButton btnVoltar = new JButton("Voltar");
		
		painelBotao.add(btnVoltar);

		ComparativosRank comparativosRankOuvinte = new ComparativosRank(janela,login);
		btnVoltar.addActionListener(comparativosRankOuvinte);
		
		painelTabela.add(scrPane);
		painelPrincipal.add(painelTabela, BorderLayout.CENTER);
		painelPrincipal.add(painelBotao, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		janela.setLocation((ds.width - 800) / 2, (ds.height - 550) / 2);
		
		janela.setContentPane(painelPrincipal); 

		janela.setSize(800, 550);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	}

}
