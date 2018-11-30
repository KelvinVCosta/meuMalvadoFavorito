package edu.controller.datamanager;

import javax.swing.*;
import java.io.*;

public class LastLogin {

    JTextField txtLogin;

    public LastLogin(JTextField txtLogin) {
        this.txtLogin = txtLogin;
    }

    public LastLogin() {
    }

    private File abrirArquivo(String fileName) throws IOException {
        File file = new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }
        return file;
    }

    public void gravarArquivo(String fileName,String textLogin) throws IOException {
        File file = abrirArquivo(fileName);
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(textLogin);
        bw.close();
    }

    public void getArquivo(String fileName) throws IOException {
        File file = abrirArquivo(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        line = br.readLine();
        txtLogin.setText(line);
        br.close();
    }

	public void DeleteTxt(String fileName) throws IOException {
		File file = abrirArquivo(fileName);
		file.delete();
	}
}
