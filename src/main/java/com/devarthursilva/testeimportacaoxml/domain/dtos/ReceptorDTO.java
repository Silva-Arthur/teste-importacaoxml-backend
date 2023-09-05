package com.devarthursilva.testeimportacaoxml.domain.dtos;

import java.io.Serializable;
import java.util.List;

public class ReceptorDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<AgenteDTO> agente;
	
	public void setAgente(List<AgenteDTO> agente) {
		this.agente = agente;
	}
	
	public List<AgenteDTO> getAgente() {
		return agente;
	}
}
