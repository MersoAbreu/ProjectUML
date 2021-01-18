package com.emersonabreu.project.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int codigo;
	private String descriacao;
	
	private EstadoPagamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descriacao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescriacao() {
		return descriacao;
	}
	
	public static EstadoPagamento toEnum(Integer codigo) {
		if(codigo ==null) {
			return null;
		}
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalido "+codigo);
		
	}
}
