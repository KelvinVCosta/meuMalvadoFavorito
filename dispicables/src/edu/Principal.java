package edu;

import edu.view.lecomparativos.TelaComparativo;
import edu.view.lecomparativos.TelaComparativoRank;
import edu.view.TelaMain;
import edu.view.alterar.*;
import edu.view.lecomparativos.TelaComparativosCandidato;
import edu.view.login.TelaCadastro;
import edu.view.login.TelaEsqueciSenha;
import edu.view.login.TelaLogin;
import edu.view.votar.TelaVotar;

public class Principal {
	public static void main(String[] args) {
		new TelaLogin();
		new TelaCadastro();
		new TelaEsqueciSenha();
		new TelaMain();
		new TelaVotar();
		new TelaAlterar();
		new TelaAlterar2();
		new TelaAlterar3();
		new TelaComparativo();
		new TelaComparativosCandidato();
		new TelaComparativoRank();
	}

}
