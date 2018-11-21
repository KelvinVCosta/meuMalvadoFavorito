package edu.model.dao;

import edu.controller.datamanager.Manager;
import edu.controller.dto.Eleitor;
import edu.controller.dto.Proposicao;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProposicaoDAO {
    private Proposicao setProposicao (String line) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] splited = line.split("_");
        Date dataApresentacao = null;
        try {
            dataApresentacao = sdf.parse(splited[2]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Proposicao(Integer.parseInt(splited[0]), splited[1], dataApresentacao, splited[3], splited[4]);
    }

    public List<Proposicao> preencheProposicoes () {
        List<Proposicao> proposicoes = new ArrayList<>();
        Manager manager = new Manager();
        String line;
        int i = 0;
        try {
            File file = manager.lerArquivo("Proposicoes.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getPath()), "ISO-8859-1"));
            while ((line = br.readLine()) != null) {
                proposicoes.add(setProposicao(line));
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proposicoes;
    }

}
