package com.devarthursilva.testeimportacaoxml.domain.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AgenteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String codigo;
	
	//@JsonFormat(pattern = "dd/MM/yyyy")
	private String data;
	private List<RegiaoDTO> regiao = new ArrayList<>();

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

	public List<RegiaoDTO> getRegiao() {
		return regiao;
	}

	public void setRegiao(List<RegiaoDTO> regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return "AgenteDTO [codigo=" + codigo + ", data=" + data + ", regiao=" + regiao + "]";
	}

}
