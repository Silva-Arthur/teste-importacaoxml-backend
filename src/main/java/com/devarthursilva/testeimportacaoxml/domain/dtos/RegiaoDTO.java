package com.devarthursilva.testeimportacaoxml.domain.dtos;

import java.io.Serializable;

import com.devarthursilva.testeimportacaoxml.domain.Agente;

public class RegiaoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private GeracaoDTO geracao;
	private CompraDTO compra;
	private PrecoMedioDTO precoMedio;
	private Agente agente;
	private String sigla;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GeracaoDTO getGeracao() {
		return geracao;
	}

	public void setGeracao(GeracaoDTO geracao) {
		this.geracao = geracao;
	}

	public CompraDTO getCompra() {
		return compra;
	}

	public void setCompra(CompraDTO compra) {
		this.compra = compra;
	}

	public PrecoMedioDTO getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(PrecoMedioDTO precoMedio) {
		this.precoMedio = precoMedio;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "RegiaoDTO [geracao=" + geracao + ", compra=" + compra + ", precoMedio=" + precoMedio + ", sigla="
				+ sigla + "]";
	}
	
}
