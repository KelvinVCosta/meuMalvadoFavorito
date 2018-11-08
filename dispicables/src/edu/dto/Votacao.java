package dto;

import java.sql.Date;

public class Votacao {

	int id;
	Proposicao proposicao;
	Date dataVotacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Proposicao getProposicao() {
		return proposicao;
	}
	public void setProposicao(Proposicao proposicao) {
		this.proposicao = proposicao;
	}
	public Date getDataVotacao() {
		return dataVotacao;
	}
	public void setDataVotacao(Date dataVotacao) {
		this.dataVotacao = dataVotacao;
	}
	
	
	
}
