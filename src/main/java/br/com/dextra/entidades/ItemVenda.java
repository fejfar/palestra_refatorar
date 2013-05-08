package br.com.dextra.entidades;

import java.math.BigDecimal;

public class ItemVenda {

	private String produto;
	
	private BigDecimal valor;

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
