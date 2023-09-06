package com.devarthursilva.testeimportacaoxml.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devarthursilva.testeimportacaoxml.domain.dtos.AgenteDTO;
import com.devarthursilva.testeimportacaoxml.services.ProcessarAgentesService;

@RestController
@RequestMapping(value = "/upload")
public class ReceberDadosResource {
	
	@Autowired
	ProcessarAgentesService processarAgentesService;
	
	@PostMapping
	public ResponseEntity<String> receberDados(@RequestBody List<AgenteDTO> agentes) {
		System.out.println("Recebendo requisição");
		
		processarAgentesService.processarAgentes(agentes);
		
		System.out.println("Finalizando requisição");
		
		return ResponseEntity.ok().body("{\"Sucesso\": 200");
	}

}
