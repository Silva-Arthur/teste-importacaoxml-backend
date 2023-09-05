package com.devarthursilva.testeimportacaoxml.domain;

import java.io.Serializable;

import com.devarthursilva.testeimportacaoxml.domain.enums.Regions;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Regiao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "geracao_id")
	private Geracao geracao;

	@OneToOne
	@JoinColumn(name = "compra_id")
	private Compra compra;

	@OneToOne
	@JoinColumn(name = "preco_medio_id")
	private PrecoMedio precoMedio;

	@ManyToOne
	@JoinColumn(name = "agente_id")
	private Agente agente;
	
	private Regions sigla;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Geracao getGeracao() {
		return geracao;
	}

	public void setGeracao(Geracao geracao) {
		this.geracao = geracao;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public PrecoMedio getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(PrecoMedio precoMedio) {
		this.precoMedio = precoMedio;
	}

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regiao other = (Regiao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Regions getSigla() {
		return sigla;
	}

	public void setSigla(Regions sigla) {
		this.sigla = sigla;
	}

}
