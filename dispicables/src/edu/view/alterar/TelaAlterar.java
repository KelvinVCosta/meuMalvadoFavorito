package edu.view.alterar;

import java.awt.BorderLayout;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class TelaAlterar {
	
	public TelaAlterar() {
		ShowGUI();
	}
	
	public void ShowGUI() {
		JFrame janela = new JFrame("Lista de Votos");
		
		JPanel painelPrincipal = new JPanel(new BorderLayout());
		
		JPanel painelTabela = new JPanel();
		
		String[][] data = { 
	            { "Kundan Kumar Jha", "Favor", "Detalhes" }, 
	            { "Anand Jha", "Contra", "Detalhes" } 
	        }; 
		String[] columnNames = { "Proposição", "Voto", "Detalhes"};
		
		JTable tbVotos = new JTable(data, columnNames);
//		tbVotos.setBounds(30, 40, 200, 300);
		
		JScrollPane scrPane = new JScrollPane(tbVotos);
		
		
		
		
		
		painelTabela.add(scrPane);
		painelPrincipal.add(painelTabela, BorderLayout.CENTER);
		
		
		janela.setContentPane(painelPrincipal); 

		janela.setSize(800, 650);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
