package br.com.dextra.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Parcela {

	private Date dataVencimento;
	
	private BigDecimal valor;

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
