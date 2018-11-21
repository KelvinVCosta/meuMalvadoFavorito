package edu.controller.action_listeners.votar;

import edu.controller.dto.Eleitor;
import edu.controller.dto.Proposicao;
import edu.view.TelaMain;
import edu.view.votar.TelaVotar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Votar implements ActionListener {
    JFrame janelaAnterior;
    String login;
    TelaVotar telaVotar;
    List<Proposicao> proposicoes;
    int id;

    public Votar( String login, TelaVotar telaVotar, List<Proposicao> proposicoes) {
        this.login = login;
        this.telaVotar = telaVotar;
        this.proposicoes = proposicoes;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void jump() {
//        TODO: Gravar o resultado em um tx, login-idproposicao- 0 ou 1 ( contra ou a favor)
        System.out.println(proposicoes.get(telaVotar.getI()).getId());
        System.out.println(login);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("A Favor".equals(e.getActionCommand())) {
            jump();
            System.out.println("A favor");
        } else if ("Contra".equals(e.getActionCommand())) {
            jump();
            System.out.println("Contra");
        }
    }


}
