package edu.controller.actionListeners.votar;

import edu.view.TelaMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Votar implements ActionListener {
    JFrame janelaAnterior;
    public Votar(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if ("A Favor".equals(e.getActionCommand())){
//            TODO: Mudar em banco a resposta do eleitor sobre aquela proposicao, a favor
        } else if ("Contra".equals(e.getActionCommand())){
//            TODO: Mudar em banco a resposta do eleitor sobre aquela proposicao, contra
        } else if ("Voltar".equals(e.getActionCommand())){
//            TODO: Volta para a proposicao anterior vista por ele
        } else if ("Próximo".equals(e.getActionCommand())){
//            TODO: Troca para uma nova proposicao
        } else if ("Cancelar".equals(e.getActionCommand())){
//            TODO: Voltar pra telaMain
              janelaAnterior.dispose();
              new TelaMain();

        }
    }
}
