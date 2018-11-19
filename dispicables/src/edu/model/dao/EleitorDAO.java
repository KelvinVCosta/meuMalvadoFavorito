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
        Manager manager = new Manager();
        try {
            if (manager.procuraArquivo("Eleitores.txt", login).getLogin().equals(login)) {
                if (manager.procuraArquivo("Eleitores.txt", login).getSenha().equals(senha)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
