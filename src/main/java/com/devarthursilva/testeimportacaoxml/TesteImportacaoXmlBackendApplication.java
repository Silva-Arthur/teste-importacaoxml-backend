package com.devarthursilva.testeimportacaoxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TesteImportacaoXmlBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteImportacaoXmlBackendApplication.class, args);
	}

}
