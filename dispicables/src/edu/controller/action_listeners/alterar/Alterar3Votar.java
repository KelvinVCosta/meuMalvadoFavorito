package edu.controller.action_listeners.alterar;

import edu.model.dao.VotoEleitorDAO;
import edu.view.alterar.TelaAlterar2;
import edu.view.alterar.TelaAlterar3;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


public class Alterar3Votar implements ActionListener {
    private final TelaAlterar2 telaAlterar2;
    TelaAlterar3 janela;
    JFrame jframe;
    VotoEleitorDAO votoEleitorDAO = new VotoEleitorDAO();
    public Alterar3Votar(TelaAlterar3 janela, JFrame jframe, TelaAlterar2 telaAlterar2) {
        this.janela = janela;
        this.jframe = jframe;
        this.telaAlterar2 = telaAlterar2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Contra".equals(e.getActionCommand())) {
            try {
                System.out.println(telaAlterar2.getIdEleitor());
                System.out.println(telaAlterar2.getIdProposicao());
                votoEleitorDAO.alterarVoto("false",telaAlterar2.getIdProposicao(),telaAlterar2.getIdEleitor());
                telaAlterar2.getLblVoto().setText("Contra");
                jframe.dispose();
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

        } else if ("Favor".equals(e.getActionCommand())) {
            try {
                votoEleitorDAO.alterarVoto("true",telaAlterar2.getIdProposicao(),telaAlterar2.getIdEleitor());
                telaAlterar2.getLblVoto().setText("A favor");
                jframe.dispose();
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

        }
    }
}
