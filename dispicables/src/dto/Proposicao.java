package dto;

import java.sql.Date;

public class Proposicao {

	int id;
	String ementa;
	Date dataApresentacao;
	String ementaDetalhada;
	String texto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Date getDataApresentacao() {
		return dataApresentacao;
	}
	public void setDataApresentacao(Date dataApresentacao) {
		this.dataApresentacao = dataApresentacao;
	}
	public String getEmentaDetalhada() {
		return ementaDetalhada;
	}
	public void setEmentaDetalhada(String ementaDetalhada) {
		this.ementaDetalhada = ementaDetalhada;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
