package com.emersonabreu.project.domain;

import javax.persistence.Entity;

import com.emersonabreu.project.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private int numeroParcelas;



	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public PagamentoComCartao(int id, EstadoPagamento estado, Pedido pedido, int numeroParcelas) {
		super(id, estado, pedido);
		this.numeroParcelas = numeroParcelas;
	}

	public PagamentoComCartao() {
	
	}
	

}
