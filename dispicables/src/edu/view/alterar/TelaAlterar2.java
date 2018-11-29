package edu.view.alterar;

import edu.controller.action_listeners.alterar.ActionNavegarAlter;
import edu.controller.action_listeners.alterar.Alterar2;
import edu.controller.dto.Proposicao;
import edu.model.dao.ProposicaoDAO;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
import javax.swing.text.JTextComponent;

//Referente ao prot�tipo TelaAlterarDetalhes

public class TelaAlterar2 {
	private List<Proposicao> proposicoes = new ArrayList<>();
	JFrame janela;
    JTextArea areaConteudoProposicao;
    int i = 0;
    String login;
    Proposicao proposicao;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public JFrame getJanela() {
        return janela;
    }

    public String getLogin() {
    	return login;
    }	
    
    public TelaAlterar2(String login) {
    	this.login = login;
        criarLayout();
    }

    public void criarLayout() {
        ProposicaoDAO proposicaoDAO = new ProposicaoDAO();
        try {
            proposicao = proposicaoDAO.getProposicao(i);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//		Criação de Janela, painel e objetos necessários.
        janela = new JFrame(proposicao.getEmenta());

        JPanel painelPrincipal = new JPanel(new GridBagLayout()); // Criando o painel principal e setando como
        // GridBagLayout.
        GridBagConstraints c = new GridBagConstraints();

        JPanel painelConteudo = new JPanel(new BorderLayout()); // Criando o Painel Conteudo e atribuido o Border Layout
        // (Dentro deste painel, somente ir� o texto;
        painelConteudo.setBorder(new CompoundBorder(new TitledBorder("Conte�do"), null)); // Colocando a borda no
        // Paneil.

//		Cria��o de objetos que seram comportados dentro dos paineis.

        String[] tipo = {"Tipo", "Teste2", "Teste3"};
        String[] titulo = {"Titulo", "Teste2", "Teste3"};
        JComboBox cmbTipo = new JComboBox<String>(tipo);
        JComboBox cmbTitulo = new JComboBox<String>(titulo);


        areaConteudoProposicao = new JTextArea(); // Criando TxtArea
        areaConteudoProposicao.setEditable(false); // Tornando o TxtArea n�o edit�vel
        JScrollPane scrConteudo = new JScrollPane(areaConteudoProposicao); // Criando o ScrollBar e atribuindo ao TxtArea
        scrConteudo.setVisible(true);
        scrConteudo.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // Deixando o Scrol Bar
        // sempre visivel.
        areaConteudoProposicao.setText(proposicao.getTexto());
        areaConteudoProposicao.setLineWrap(true);
        areaConteudoProposicao.setWrapStyleWord(true);

//		Cria��o de bot�es
        JButton btnAlterar = new JButton("Alterar");
        JButton btnCancel = new JButton("Cancelar");
        JButton btnVoltar = new JButton("Anterior");
        JButton btnProx = new JButton("Pr�ximo");
        JButton btnPesquisar = new JButton("Pesquisar");

//		Adicionando acoes aos botoes
        Alterar2 alterarOuvinte = new Alterar2(janela);
        ActionNavegarAlter actionNavegar = new ActionNavegarAlter(this,proposicoes);
        btnAlterar.addActionListener(alterarOuvinte);
        btnCancel.addActionListener(alterarOuvinte);
        btnVoltar.addActionListener(actionNavegar);
        btnProx.addActionListener(actionNavegar);
        btnPesquisar.addActionListener(alterarOuvinte);

        JLabel lblVoto = new JLabel("Favor/Contra");

        JPanel painelBotoes = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weightx = 0.25;
        gbc.insets = new Insets(4, 4, 4, 4);

        painelBotoes.add(btnAlterar, gbc);
        gbc.gridx--;
        painelBotoes.add(lblVoto, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        painelBotoes.add(btnCancel, gbc);
        gbc.gridx++;
        painelBotoes.add(btnVoltar, gbc);
        gbc.gridx++;
        painelBotoes.add(btnProx, gbc);

//		Adicionando objetos aos paineis.
        painelConteudo.add(areaConteudoProposicao, BorderLayout.CENTER); // Adicionando o TxtArea dentro do painel
        // Conteudo.

//		Adicionando o Tipo Proposicao no inicio do painel.
//		c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        painelPrincipal.add(cmbTipo, c);

        c.anchor = GridBagConstraints.PAGE_START;
        painelPrincipal.add(cmbTitulo, c);

        c.anchor = GridBagConstraints.FIRST_LINE_END;
        painelPrincipal.add(btnPesquisar, c);

//		Adicionando o PainelConteudo no principal.
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 150;
        c.weightx = 1.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        painelPrincipal.add(painelConteudo, c);

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

        janela.setSize(800, 650);
        janela.setResizable(false);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



	public JTextComponent getAreaConteudoProposicao() {
		// TODO Auto-generated method stub
		return areaConteudoProposicao;
	}

}
