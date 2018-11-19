package edu.controller.datamanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Manager {

    private File abrirArquivo(String fileName) throws IOException {
        File file = new File(fileName);

        if(!file.exists()){
            file.createNewFile();
        }

        return file;
    }

    public File lerArquivo(String fileName) throws IOException {
        return abrirArquivo(fileName);
    }

    public void escreverArquivo(String fileName, String conteudo) throws IOException {
        File file = abrirArquivo(fileName);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.append(conteudo);
        bw.newLine();
        bw.close();
    }


}
