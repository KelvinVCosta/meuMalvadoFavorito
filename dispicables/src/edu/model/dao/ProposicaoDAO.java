package edu.model.dao;

import edu.controller.datamanager.Manager;
import edu.controller.dto.Eleitor;
import edu.controller.dto.Proposicao;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProposicaoDAO {
    private Proposicao setProposicao (Proposicao proposicao, String line) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] splited = line.split("_");
        Date dataApresentacao = null;
        try {
            dataApresentacao = sdf.parse(splited[2]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        proposicao.setId(Integer.parseInt(splited[0]));
        proposicao.setEmentaDetalhada(splited[1]);
        proposicao.setDataApresentacao(dataApresentacao);
        proposicao.setEmenta(splited[3]);
        proposicao.setTexto(splited[4]);
        return proposicao;
    }

    public List<Proposicao> preencheProposicoes (List<Proposicao> proposicoes) {
        Proposicao proposicao = new Proposicao();
        Manager manager = new Manager();
        String line;
        try {
            File file = manager.lerArquivo("Proposicoes.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getPath()), "ISO-8859-1"));
            while ((line = br.readLine()) != null) {
                proposicoes.add(setProposicao(proposicao, line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proposicoes;
    }

}
