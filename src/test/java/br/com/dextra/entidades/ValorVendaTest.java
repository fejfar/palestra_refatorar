package br.com.dextra.entidades;

import org.junit.Test;

public class ValorVendaTest {

	@Test
	public void totalVendaAVista() {
		Venda venda = new Venda("111.111.111-11", TipoVenda.A_VISTA);
		venda.addItem(new ItemVenda());
	}
}
