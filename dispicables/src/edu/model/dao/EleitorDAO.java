package edu.model.dao;

import edu.controller.dto.Eleitor;

import java.util.ArrayList;
import java.util.List;

public class EleitorDAO {
    public List<Eleitor> eleitorList = new ArrayList<>();

    public void Adicionar(Eleitor eleitor) {
        eleitorList.add(eleitor);
    }

    public boolean LoginCheck (String login, String senha){
        for (Eleitor eleitor : eleitorList) { //TODO: Est� acontecendo alguma falha ao entrar no foreach, necess�rio verificar.
            if (eleitor.getLogin().equals(login)) {
                if (eleitor.getSenha().equals(senha)) {
                    return true;
                }
            }
        }
        return false;
    }

}
