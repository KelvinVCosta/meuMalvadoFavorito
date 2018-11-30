package edu.controller.dto;

public class VotoEleitor {
	int idEleitor;
	int idProposicao;
	boolean voto;

	public int getIdEleitor() {
		return idEleitor;
	}
	public void setIdEleitor(int idEleitor) {
		this.idEleitor = idEleitor;
	}
	public int getId() {
		return idProposicao;
	}
	public void setId(int id) {
		this.idProposicao = id;
	}
	public boolean isVoto() {
		return voto;
	}
	public void setVoto(boolean voto) {
		this.voto = voto;
	}

	@Override
	public String toString() {
		return idProposicao +","+ idEleitor +","+ String.valueOf(voto);
	}
}
