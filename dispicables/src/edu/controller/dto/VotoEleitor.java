package edu.controller.dto;

public class VotoEleitor {
	String loginEleitor;
	int idProposicao;
	int voto;

	public String getLoginEleitor() {
		return loginEleitor;
	}
	public void setLoginEleitor(String loginEleitor) {
		this.loginEleitor = loginEleitor;
	}
	public int getId() {
		return idProposicao;
	}
	public void setId(int id) {
		this.idProposicao = id;
	}
	public int isVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	@Override
    public String toString() {
        return loginEleitor+"-"+idProposicao+"-"+voto;
    }
}
