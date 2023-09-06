package com.devarthursilva.testeimportacaoxml.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devarthursilva.testeimportacaoxml.domain.dtos.AgenteDTO;

@Service
public class ProcessarAgentesService {

	/**
	 * Método que realiza o processamento dos agentes submetidos ao serviço
	 *  
	 * @author Arthur Silva
	 * */
	public void processarAgentes(List<AgenteDTO> agentes) {
		agentes.forEach(a -> {
			if (a.getCodigo() != null) {
				System.out.println("Agente código: " + a.getCodigo());
			}
		});
	}
}
