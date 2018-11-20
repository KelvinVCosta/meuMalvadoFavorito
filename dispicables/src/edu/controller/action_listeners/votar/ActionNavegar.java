package edu.controller.action_listeners.votar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionNavegar implements ActionListener {
    JFrame janelaAnterior;

    public ActionNavegar(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent navegar) {

        if ("Anterior".equals(navegar.getActionCommand())){
//            TODO: Volta para a proposicao anterior
            System.out.println("Anterior");
        } else if ("Próximo".equals(navegar.getActionCommand())){
//            TODO: Troca para a proxima proposicao
            System.out.println("Prox");
        }
    }
}
