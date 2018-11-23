package edu.controller.datamanager;

import edu.controller.dto.Eleitor;

import java.io.*;

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

    public Eleitor procuraArquivo (String fileName, String login) throws IOException {
        Eleitor eleitor = new Eleitor();
        File file = abrirArquivo(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(login)) {
                setEleitor(eleitor,line);
                return eleitor;
            }
        }
        br.close();
        return null;
    }

    public Eleitor procuraEmailEsqueci (String fileName) throws IOException {
        Eleitor eleitor = new Eleitor();
        File file = abrirArquivo(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
                setEleitor(eleitor,line);
                return eleitor;
        }
        br.close();
        return null;
        
    }

    public Eleitor setEleitor (Eleitor eleitor,String line) {
        String[] splited = line.split("-");
        eleitor.setNome(splited[0]);
        eleitor.setEmail(splited[1]);
        eleitor.setLogin(splited[2]);
        eleitor.setSenha(splited[3]);
        return eleitor;
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
