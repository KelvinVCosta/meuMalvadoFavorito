package edu.controller.dto;

public class VotoEleitor {
	String loginEleitor;
	int idProposicao;
	int voto;
	
//	Proposicao proposicao;
//	Eleitor eleitor;
	
	
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
//	public Proposicao getProposicao() {
//		return proposicao;
//	}
//	public void setProposicao(Proposicao proposicao) {
//		this.proposicao = proposicao;
//	}
//	public Eleitor getEleitor() {
//		return eleitor;
//	}
//	public void setEleitor(Eleitor eleitor) {
//		this.eleitor = eleitor;
//	}
}
