package com.mario.umlProject.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mario.umlProject.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dateVencimento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date datePagamento;
	
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dateVencimento, Date datePagamento) {
		super(id, estado, pedido);
		this.dateVencimento = dateVencimento;
		this.datePagamento = datePagamento;
	}

	public Date getDateVencimento() {
		return dateVencimento;
	}


	public void setDateVencimento(Date dateVencimento) {
		this.dateVencimento = dateVencimento;
	}


	public Date getDatePagamento() {
		return datePagamento;
	}


	public void setDatePagamento(Date datePagamento) {
		this.datePagamento = datePagamento;
	}
	
	
	
}
