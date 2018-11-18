package edu.model.dao;

import edu.controller.datamanager.Manager;
import edu.controller.dto.Eleitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EleitorDAO {
    private List<Eleitor> eleitorList = new ArrayList<>();

    public void Adicionar(Eleitor eleitor) {
        Manager fileManger = new Manager();
        try {
            fileManger.escreverArquivo("Eleitores.txt", eleitor.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public boolean LoginCheck (String login, String senha){
        for (Eleitor eleitor : eleitorList) { //TODO: Está acontecendo alguma falha ao entrar no foreach, necessário verificar.
            if (eleitor.getLogin().equals(login)) {
                if (eleitor.getSenha().equals(senha)) {
                    return true;
                }
            }
        }
        return false;
    }

}
