package edu.controller.action_listeners.votar;

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
            System.out.println("A favor");
        } else if ("Contra".equals(e.getActionCommand())){
//            TODO: Mudar em banco a resposta do eleitor sobre aquela proposicao, contra
            System.out.println("Contra");
        }
    }
}
