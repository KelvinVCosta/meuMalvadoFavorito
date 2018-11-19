package edu.controller.dto;

public class Eleitor {

    private String nome;
    private String email;
	private String login;
    private String senha;


    public String getLogin() {
        return login;
    }
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

    @Override
    public String toString() {
        return nome+"-"+email+"-"+login+"-"+senha;
    }
}
