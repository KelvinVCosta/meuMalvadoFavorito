package edu.model.dao;

import edu.controller.datamanager.LastLogin;


import javax.swing.*;
import java.io.IOException;


public class LogginDAO {
    private JTextField txtLogin;

    public LogginDAO(JTextField txtLogin) {
        this.txtLogin = txtLogin;
    }

    public LogginDAO() {
    }

    public void Adicionar(String login) {
        LastLogin fileManger = new LastLogin();
        try {
            fileManger.gravarArquivo("LastLogin.txt", login);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setLastLogin (){
        LastLogin fileManger = new LastLogin(txtLogin);
        try {
            fileManger.getArquivo("LastLogin.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void RemoverTxt() {
		LastLogin fileManger = new LastLogin();
        try {
            fileManger.DeleteTxt("LastLogin.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
