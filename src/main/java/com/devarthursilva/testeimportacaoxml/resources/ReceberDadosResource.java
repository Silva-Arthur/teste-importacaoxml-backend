package com.devarthursilva.testeimportacaoxml.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devarthursilva.testeimportacaoxml.domain.dtos.AgenteDTO;
import com.devarthursilva.testeimportacaoxml.domain.dtos.ReceptorDTO;

@RestController
@RequestMapping
public class ReceberDadosResource {
	
	@PostMapping
	public ResponseEntity<String> receberDados(@RequestBody List<ReceptorDTO> agente) {
		System.out.println( agente);
		
		return ResponseEntity.ok().body("Sucesso!");
	}

}
