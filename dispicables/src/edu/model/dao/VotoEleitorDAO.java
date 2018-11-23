package edu.model.dao;

import java.io.IOException;

import edu.controller.datamanager.Manager;
import edu.controller.dto.VotoEleitor;

public class VotoEleitorDAO {

	public void adiconar(VotoEleitor votoEleitor) {
	        Manager fileManger = new Manager();
	        try {
	            fileManger.escreverArquivo("VotoEleitor.txt", votoEleitor.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		
	}

