package edu.model.dao;

import edu.controller.datamanager.Manager;
import edu.controller.dto.Eleitor;
import edu.controller.dto.Proposicao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProposicaoDAO {
    private Proposicao setProposicao (Proposicao proposicao, String line) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] splited = line.split("^");
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

    private List<Proposicao> preencheProposicoes (List<Proposicao> proposicoes) {
        Proposicao proposicao = new Proposicao();
        Manager manager = new Manager();
        String line;
        try {
            File file = manager.lerArquivo("Proposicoes.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                setProposicao(proposicao, line);
                proposicoes.add(proposicao);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return proposicoes;
    }

}
