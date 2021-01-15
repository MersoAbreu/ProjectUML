package com.emersonabreu.project.domain.enums;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa física"),
	PESSOAJURIDICA(2, "Pessoa jurídica");
	
	private int codigo;
	private String descriacao;
	
	private TipoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descriacao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescriacao() {
		return descriacao;
	}
	
	public static TipoCliente toEnum(Integer codigo) {
		if(codigo ==null) {
			return null;
		}
		for(TipoCliente x : TipoCliente.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido "+codigo);
		
	}
	
}
