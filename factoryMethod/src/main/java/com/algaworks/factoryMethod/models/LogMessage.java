package com.algaworks.factoryMethod.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogMessage {

	public String menssage;

	public String dataAtual;

	public LogMessage(String menssage) {
		super();
		this.menssage = menssage;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		this.dataAtual = LocalDateTime.now().format(dtf);
		
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}

	public String getDataAtual() {
		return dataAtual;
	}

}
