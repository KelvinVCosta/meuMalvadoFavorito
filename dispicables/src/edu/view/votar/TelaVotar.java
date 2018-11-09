package edu.view.votar;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class TelaVotar{
	
	private JFrame janela;
	
	public TelaVotar() {
		criarLayout();
	}
	
	protected void makeButton(String name, GridBagLayout gridbag, GridBagConstraints c) {
		Button button = new Button(name);
		gridbag.setConstraints(button, c);
		janela.add(button);
	}
	
	public void criarLayout() {
		JFrame janela = new JFrame("Votar");
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();	
	
		JPanel painelPrincipal = new JPanel();
		
		Font font = new Font("SansSerif", Font.PLAIN, 14);
		painelPrincipal.setFont(font);
		
		painelPrincipal.setLayout(gridbag);
		
		constraints.fill = GridBagConstraints.BOTH;
		
		constraints.weightx = 1.0;
		
		JLabel tipoProposicao = new JLabel("Tipo");
		tipoProposicao.setBorder(new CompoundBorder(new TitledBorder("Database"), null));
		gridbag.setConstraints(tipoProposicao, constraints);
		painelPrincipal.add(tipoProposicao);
		constraints.gridwidth = GridBagConstraints.REMAINDER;
			
		janela.setContentPane(painelPrincipal);
		
		janela.setSize(800, 400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
