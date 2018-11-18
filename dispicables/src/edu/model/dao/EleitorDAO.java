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
