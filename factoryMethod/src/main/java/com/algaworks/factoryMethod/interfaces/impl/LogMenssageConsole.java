package com.algaworks.factoryMethod.interfaces.impl;


import java.time.format.DateTimeFormatter;

import com.algaworks.factoryMethod.interfaces.LogMessageImpressao;
import com.algaworks.factoryMethod.models.LogMessage;

public class LogMenssageConsole implements LogMessageImpressao {

	
	@Override
	public void generateFileLog(LogMessage mensage) {
		System.out.println( mensage.getDataAtual() + " - " + mensage.getMenssage());
	}

}
