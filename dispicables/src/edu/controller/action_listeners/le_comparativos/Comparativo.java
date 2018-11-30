package edu.controller.action_listeners.le_comparativos;

import edu.controller.dto.ComparativoDTO;
import edu.view.TelaMain;
import edu.view.lecomparativos.TelaComparativoRank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Comparativo implements ActionListener {
    JFrame janelaAnterior;
    String login;
    List<ComparativoDTO> comparativoDTO;

    public Comparativo(JFrame janelaAnterior, String login, List<ComparativoDTO> comparativoDTO) {
        this.janelaAnterior = janelaAnterior;
        this.login = login;
        this.comparativoDTO = comparativoDTO;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Ver Rank".equals(e.getActionCommand())){
            janelaAnterior.dispose();
            new TelaComparativoRank(login,comparativoDTO);
        } else if ("Voltar".equals(e.getActionCommand())){
            janelaAnterior.dispose();
            new TelaMain(login);
        }
    }
}
