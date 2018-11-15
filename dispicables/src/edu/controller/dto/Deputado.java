package edu.controller.dto;

public class Deputado {
	
	int id;
	UnidadeFederativa uf;
	String siglaPartido;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public UnidadeFederativa getUf() {
		return uf;
	}

	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}
	
	
	
}
