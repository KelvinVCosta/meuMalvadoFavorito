package edu.controller.action_listeners.le_comparativos;

import edu.view.lecomparativos.TelaComparativo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComparativosCandidato implements ActionListener {
    JFrame janelaAnterior;

    public ComparativosCandidato(JFrame janelaAnterior) {
        this.janelaAnterior = janelaAnterior;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("Voltar".equals(e.getActionCommand())){
            janelaAnterior.dispose();
            new TelaComparativo();
        } else if ("Detalhes".equals(e.getActionCommand())){
//            TODO: BOTAO A SER IMPLEMENTADO DENTRO DO JTEXT AREA
        }
    }
}
