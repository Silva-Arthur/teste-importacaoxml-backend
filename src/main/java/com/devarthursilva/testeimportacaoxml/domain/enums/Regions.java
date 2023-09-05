package com.devarthursilva.testeimportacaoxml.domain.enums;

public enum Regions {

	SE(1), S(2), NE(3), N(4);
	
	private Integer codigo;

	Regions(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public static Regions toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		
		for (Regions r : Regions.values()) {
			if (r.getCodigo().equals(codigo)) {
				return r;
			}
		}
		
		throw new IllegalArgumentException("Regions inválida");
	}
	
}
