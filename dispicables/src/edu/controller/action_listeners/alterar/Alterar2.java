package edu.controller.action_listeners.alterar;

import edu.model.dao.EleitorDAO;
import edu.view.TelaMain;
import edu.view.alterar.TelaAlterar2;
import edu.view.alterar.TelaAlterar3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Alterar2 implements ActionListener {
    JFrame janelaAnterior;
    int eleitorId;
    TelaAlterar2 telaAlterar2;
    EleitorDAO eleitorDAO = new EleitorDAO();
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
            try {
                new TelaMain(eleitorDAO.getEleitorEmail(eleitorId));
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        }
    }
}