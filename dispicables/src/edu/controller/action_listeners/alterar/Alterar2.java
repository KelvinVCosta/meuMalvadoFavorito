package edu.controller.action_listeners.alterar;

import edu.view.TelaMain;
import edu.view.alterar.TelaAlterar2;
import edu.view.alterar.TelaAlterar3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alterar2 implements ActionListener {
    JFrame janelaAnterior;
    int eleitorId;
    TelaAlterar2 telaAlterar2;
    public Alterar2(JFrame janelaAnterior, int eleitorId,TelaAlterar2 telaAlterar2 ) {
        this.janelaAnterior = janelaAnterior;
        this.eleitorId = eleitorId;
        this.telaAlterar2 = telaAlterar2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Alterar".equals(e.getActionCommand())) {
            new TelaAlterar3( telaAlterar2);
        } else if ("Cancelar".equals(e.getActionCommand())) {
            janelaAnterior.dispose();
            new TelaMain();
        }
    }
}