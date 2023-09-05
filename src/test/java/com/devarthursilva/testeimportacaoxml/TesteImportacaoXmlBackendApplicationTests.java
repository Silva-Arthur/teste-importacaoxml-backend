package com.devarthursilva.testeimportacaoxml;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.devarthursilva.testeimportacaoxml.domain.Agente;
import com.devarthursilva.testeimportacaoxml.domain.Regiao;
import com.devarthursilva.testeimportacaoxml.domain.enums.Regions;
import com.devarthursilva.testeimportacaoxml.repositories.AgenteRepository;

@SpringBootTest
class TesteImportacaoXmlBackendApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("ola mundo");
	}
	
	private Agente agente;

	@Autowired
	private AgenteRepository agenteRepository;

	@Test
	public void testeIncluirAgente() throws Exception {
		Agente agente = new Agente();
		agente.setCodigo(1l);
		agente.setData(new Date(System.currentTimeMillis()));
		
		this.agente = agenteRepository.save(agente);
		
		System.out.println(this.agente);
	}
	
	@Test
	public void testeIncluirRegaio() throws Exception {
		Regiao regiao = new Regiao();
		regiao.setAgente(this.agente);
		regiao.setSigla(Regions.N);
	}
}
