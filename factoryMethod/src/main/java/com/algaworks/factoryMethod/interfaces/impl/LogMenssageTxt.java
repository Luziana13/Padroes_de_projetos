package com.algaworks.factoryMethod.interfaces.impl;

import java.io.FileWriter;
import java.io.IOException;

import com.algaworks.factoryMethod.interfaces.LogMessageImpressao;
import com.algaworks.factoryMethod.models.LogMessage;

public class LogMenssageTxt implements LogMessageImpressao {

	@Override
	public void generateFileLog(LogMessage mensage) {
		String pathArquivo = "/home/luziana/Documents/Padroes_de_projetos/factoryMethod/src/main/java/com/algaworks/factoryMethod/arquivos/logMessage.txt"; 
		try {
			FileWriter logMessage = new FileWriter(pathArquivo);
			logMessage.write(mensage.getDataAtual() + " - " + mensage.getMenssage());
			logMessage.close();
			System.out.println(mensage.getDataAtual() + " - " + mensage.getMenssage());
		} catch (IOException e) {
			System.err.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
