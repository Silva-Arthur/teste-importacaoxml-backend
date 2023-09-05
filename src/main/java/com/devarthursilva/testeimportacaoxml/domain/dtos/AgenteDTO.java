package com.devarthursilva.testeimportacaoxml.domain.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.devarthursilva.testeimportacaoxml.domain.Regiao;

public class AgenteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String codigo;
	
	//@JsonFormat(pattern = "dd/MM/yyyy")
	private String data;
	private List<Regiao> regiao = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Regiao> getRegiao() {
		return regiao;
	}

	public void setRegiao(List<Regiao> regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "AgenteDTO [id=" + id + ", codigo=" + codigo + ", data=" + data + ", regiao=" + regiao + "]";
	}
	
}
