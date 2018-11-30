package edu.controller.dto;

public class ComparativoDTO {
    private int deputadoId;
    private String nomeDeputado;
    private int qtdVotosIguais;
    private int qtdVotosTotais;

    public int getDeputadoId() {
        return deputadoId;
    }

    public void setDeputadoId(int deputadoId) {
        this.deputadoId = deputadoId;
    }

    public String getNomeDeputado() {
        return nomeDeputado;
    }

    public void setNomeDeputado(String nomeDeputado) {
        this.nomeDeputado = nomeDeputado;
    }

    public int getQtdVotosIguais() {
        return qtdVotosIguais;
    }

    public void setQtdVotosIguais(int qtdVotosIguais) {
        this.qtdVotosIguais = qtdVotosIguais;
    }

    public int getQtdVotosTotais() {
        return qtdVotosTotais;
    }

    public void setQtdVotosTotais(int qtdVotosTotais) {
        this.qtdVotosTotais = qtdVotosTotais;
    }
}
