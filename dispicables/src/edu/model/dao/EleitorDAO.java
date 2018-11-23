package edu.model.dao;

import edu.controller.datamanager.Manager;
import edu.controller.dto.Eleitor;

import java.io.IOException;

public class EleitorDAO {

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
            if ((manager.procuraArquivo("Eleitores.txt", login).getLogin().equals(login)) && (manager.procuraArquivo("Eleitores.txt", login).getSenha().equals(senha))) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkEmail (String email){
        Manager manager = new Manager();
        try {
            if (manager.procuraEmailEsqueci("Eleitores.txt").getEmail().equals(email)) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

}
