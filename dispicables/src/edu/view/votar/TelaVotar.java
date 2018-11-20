package edu.view.votar;

import edu.controller.action_listeners.votar.ActionNavegar;
import edu.controller.action_listeners.votar.ActionVotar;
import edu.controller.action_listeners.votar.Votar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class TelaVotar {
	public TelaVotar() {
		criarLayout();
	}

	public void criarLayout() {
//		Criação de Janela, painel e objetos necessários.
		JFrame janela = new JFrame("Titulo da proposição"); // TODO: Alterar o Título da janea conforme o titulo da
															// proposição mostrada na tela.
		JPanel painelPrincipal = new JPanel(new GridBagLayout()); // Criando o painel principal e setando como
																	// GridBagLayout.
		GridBagConstraints c = new GridBagConstraints();

		JPanel painelConteudo = new JPanel(new BorderLayout()); // Criando o Painel Conteudo e atribuido o Border Layout
																// (Dentro deste painel, somente irá o texto;
		painelConteudo.setBorder(new CompoundBorder(new TitledBorder("Conteúdo"), null)); // Colocando a borda no
																							// Paneil.

//		Criação de objetos que seram comportados dentro dos paineis.
		JLabel lblTipoProposicao = new JLabel("Tipo da proposição"); // TODO: Alterar o tipo conforme o tipo da
																		// proposição mostrada na tela.
		JTextArea areaConteudoProposicao = new JTextArea(); // Criando TxtArea
		areaConteudoProposicao.setEditable(false); // Tornando o TxtArea não editável
		JScrollPane scrConteudo = new JScrollPane(areaConteudoProposicao); // Criando o ScrollBar e atribuindo ao TxtArea
		scrConteudo.setVisible(true);
		scrConteudo.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS); // Deixando o Scrol Bar
																								// sempre visivel.
		areaConteudoProposicao.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam rutrum sapien quis dignissim ornare. Integer faucibus vel nulla ut euismod. Nunc accumsan egestas lectus ut pellentesque. Nunc maximus odio vel lacinia rhoncus. Vivamus sagittis nunc ac lorem commodo, nec dictum erat imperdiet. Morbi tincidunt eros quis neque sodales pharetra. Integer lobortis sollicitudin purus. Nam at mauris sit amet lorem tristique aliquam sit amet sit amet est. Fusce pulvinar diam ac quam dignissim eleifend. Nullam eleifend facilisis vestibulum. Nullam volutpat dui et elit condimentum fringilla id id justo. Vivamus non metus auctor nisl viverra finibus nec eu velit. Sed sit amet ex a risus blandit scelerisque. Nullam eget orci non magna tincidunt pulvinar vel in lacus. Nunc nec fermentum ex.\r\n" +
                "\n" +
                "Curabitur odio mi, aliquet in feugiat eu, gravida eu ipsum. Maecenas cursus, diam sit amet sollicitudin ultrices, massa ante pretium nisi, ut vestibulum arcu magna eget purus. Maecenas ultrices quis lectus ac vestibulum. Nullam molestie enim id sodales placerat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Pellentesque pharetra turpis a lacus dapibus, vel rhoncus magna fringilla. Phasellus laoreet venenatis nulla, sed mollis odio lacinia vel. Nam convallis lectus lectus, at rutrum odio hendrerit eget. Phasellus gravida, turpis sit amet iaculis pellentesque, ex eros egestas est, a placerat purus ante eu felis. Maecenas efficitur, erat eu viverra porttitor, justo mi blandit sem, a condimentum odio felis sit amet purus. Curabitur commodo, ipsum at faucibus maximus, nibh tortor congue nisi, vel cursus massa magna a purus. Vivamus vel elit pulvinar, vulputate sapien at, tempor sem. Cras interdum arcu laoreet ipsum volutpat consequat.\r\n" +
                "\n" +
                "Pellentesque nisi risus, aliquet sed nisi non, pretium eleifend quam. Proin quam felis, vulputate in metus ut, imperdiet efficitur elit. Quisque nec libero egestas, congue ligula eget, tristique tellus. Donec eu euismod augue. Nulla dignissim turpis vel augue pretium, eget ultrices elit luctus. Nulla vulputate, sapien nec mollis ornare, nulla justo aliquam risus, sit amet scelerisque massa elit ac lorem. Suspendisse sed laoreet mauris. Proin scelerisque, arcu sed efficitur feugiat, lectus leo facilisis magna, eu pretium orci felis in mauris. Cras scelerisque tempus orci eu aliquet. Phasellus ac tellus porttitor, facilisis dolor quis, aliquam purus.");
        areaConteudoProposicao.setLineWrap(true);
		areaConteudoProposicao.setWrapStyleWord(true);
		
//		Criação de botões
		JButton btnFavor = new JButton("A Favor");
		JButton btnContra = new JButton("Contra");
		JButton btnCancel = new JButton("Cancelar");
		JButton btnVoltar = new JButton("Anterior");
		JButton btnProx = new JButton("Próximo");

		JPanel painelBotoes = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weightx = 0.25;
		gbc.insets = new Insets(4, 4, 4, 4);

		painelBotoes.add(btnFavor, gbc);
		gbc.gridx--;
		painelBotoes.add(btnContra, gbc);
		gbc.gridx = 0;
		gbc.gridy= 2;
		painelBotoes.add(btnCancel, gbc);
		gbc.gridx++;
		painelBotoes.add(btnVoltar, gbc);
		gbc.gridx++;
		painelBotoes.add(btnProx, gbc);

//		Adicionando acoes aos botoes
		Votar votarOuvinte = new Votar(janela);
        ActionVotar votarTela = new ActionVotar(janela);
        ActionNavegar votarNavegar = new ActionNavegar(janela);
		btnCancel.addActionListener(votarTela);
        btnContra.addActionListener(votarOuvinte);
        btnFavor.addActionListener(votarOuvinte);
        btnProx.addActionListener(votarNavegar);
        btnVoltar.addActionListener(votarNavegar);

//		Adicionando objetos aos paineis.
		painelConteudo.add(areaConteudoProposicao, BorderLayout.CENTER); // Adicionando o TxtArea dentro do painel
																		// Conteudo.
//		Adicionando o Tipo Proposicao no inicio do painel.
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		painelPrincipal.add(lblTipoProposicao, c);

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
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
