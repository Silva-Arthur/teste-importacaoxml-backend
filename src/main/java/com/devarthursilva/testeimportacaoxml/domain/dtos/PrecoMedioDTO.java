package com.devarthursilva.testeimportacaoxml.domain.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PrecoMedioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long regiao;
	private List<BigDecimal> valor = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRegiao() {
		return regiao;
	}

	public void setRegiao(Long regiao) {
		this.regiao = regiao;
	}

	public List<BigDecimal> getValor() {
		return valor;
	}

	public void setValor(List<BigDecimal> valor) {
		this.valor = valor;
	}

}
