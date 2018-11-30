package edu.model.dao;

import java.io.IOException;
import java.sql.SQLException;

import edu.controller.datamanager.Manager;
import edu.controller.dto.VotoEleitor;

import javax.swing.*;

public class VotoEleitorDAO extends DAO {

    public void adicionar(VotoEleitor votoEleitor) {
        try {
            insertQuery("voto_eleitor", "proposicao_id, eleitor_id, voto", votoEleitor.toString());
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Você já votou nesta proposição", "MVF - Proposição já votada", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

