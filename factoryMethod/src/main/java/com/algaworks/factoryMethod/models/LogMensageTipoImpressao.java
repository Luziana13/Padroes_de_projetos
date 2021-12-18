package com.algaworks.factoryMethod.models;

import com.algaworks.factoryMethod.interfaces.impl.LogMenssageConsole;
import com.algaworks.factoryMethod.interfaces.impl.LogMenssageTxt;
import com.algaworks.factoryMethod.interfaces.impl.LogMenssageXml;

public enum LogMensageTipoImpressao {
	CONSOLE {

		@Override
		public void tipoImpressao(String message) {
			LogMenssageConsole lmc = new LogMenssageConsole();
			lmc.generateFileLog(new LogMessage(message));
		}
		
	},
	TXT{

		@Override
		public void tipoImpressao(String message) {
			LogMenssageTxt lmT = new LogMenssageTxt();
			lmT.generateFileLog(new LogMessage(message));
		}
		
	},
	XML{

		@Override
		public void tipoImpressao(String message) {
			LogMenssageXml lmX = new LogMenssageXml();
			lmX.generateFileLog(new LogMessage(message));
			
		}
		
	};
	
	public abstract void tipoImpressao(String message);

}
