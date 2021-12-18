package com.algaworks.factoryMethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.algaworks.factoryMethod.models.LogMensageTipoImpressao;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);
		LogMensageTipoImpressao.CONSOLE.tipoImpressao("teste impressao em log");
		LogMensageTipoImpressao.TXT.tipoImpressao("teste impressao em txt");
		LogMensageTipoImpressao.XML.tipoImpressao("teste impressao em xml");
		
	}

}
