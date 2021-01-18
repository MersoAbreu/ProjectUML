package com.emersonabreu.project.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.emersonabreu.project.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	private Date dataVencimento;
	private Date dataPgamento;


	

	public PagamentoComBoleto(int id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPgamento) {
		super(id, estado, pedido);
		this.dataPgamento = dataPgamento;
		this.dataVencimento = dataVencimento;
	}


	public PagamentoComBoleto() {

	}


	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPgamento() {
		return dataPgamento;
	}

	public void setDataPgamento(Date dataPgamento) {
		this.dataPgamento = dataPgamento;
	}

}
