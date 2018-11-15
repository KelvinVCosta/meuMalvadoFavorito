package edu.view.lecomparativos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaComparativosCandidato {
		public TelaComparativosCandidato() {
			criarLayout();
		}

		private void criarLayout() {
			JFrame janela = new JFrame("Detalhe Candidato XXXXXX"); //TODO: Buscar nome do candidato e setar no nome da janela 
			
			JPanel painelPrincipal = new JPanel(new BorderLayout());
			
			JPanel painelTabela = new JPanel();
			JPanel painelBotao = new JPanel();
			
			String[][] data = { 
		            { "Kundan Kumar Jha", "Favor", "Favor" }, 
		            { "Anand Jha", "Contra", "Contra" },
		        }; 
			String[] columnNames = { "Proposição", "Seu Voto", "Voto do Candidato"};
			
			JTable tbVotos = new JTable(data, columnNames);
			tbVotos.setBounds(30, 40, 200, 300);
			
			JScrollPane scrPane = new JScrollPane(tbVotos);
			
			JButton btnVoltar = new JButton("Voltar");
			
			painelBotao.add(btnVoltar);
			
			
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
