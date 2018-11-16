package edu.controller.action_listeners.le_comparativos;

import edu.view.TelaMain;
import edu.view.lecomparativos.TelaComparativoRank;
import edu.view.lecomparativos.TelaComparativosCandidato;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Comparativo implements ActionListener {
    JFrame janelaAnterior;

    public Comparativo(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Detalhes".equals(e.getActionCommand())){
            janelaAnterior.dispose();
            new TelaComparativosCandidato();
        } else if ("Ver Rank".equals(e.getActionCommand())){

            janelaAnterior.dispose();
            new TelaComparativoRank();

        } else if ("Voltar".equals(e.getActionCommand())){
//           TODO: Voltar pra janela Inicial
            janelaAnterior.dispose();
            new TelaMain();
        }
    }
}
