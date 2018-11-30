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
    JFrame jFrame;
    VotoEleitorDAO votoEleitorDAO = new VotoEleitorDAO();
    public Alterar3Votar(TelaAlterar3 janela, JFrame jFrame, TelaAlterar2 telaAlterar2) {
        this.janela = janela;
        this.jFrame = jFrame;
        this.telaAlterar2 = telaAlterar2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Contra".equals(e.getActionCommand())) {
            try {
                votoEleitorDAO.alterarVoto("false",telaAlterar2.getIdProposicao(),telaAlterar2.getIdEleitor());
                setText("Contra");
                jFrame.dispose();
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }

        } else if ("Favor".equals(e.getActionCommand())) {
            try {
                votoEleitorDAO.alterarVoto("true",telaAlterar2.getIdProposicao(),telaAlterar2.getIdEleitor());
                setText("A favor");
                jFrame.dispose();
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        }
    }

    private void setText(String voto) {
        if (!"Não votado".equals(telaAlterar2.getLblVoto().getText())){
            telaAlterar2.getLblVoto().setText(voto);
        } else {
            JOptionPane.showMessageDialog(null, "Voto nao realizado, a proposicao nao tem voto para alterar!", "MVF - Voto nao realizado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
