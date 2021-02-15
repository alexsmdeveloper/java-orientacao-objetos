package br.com.caelum.leilao.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnoBissextoTest {

	@Test
	public void deveEntenderAnoBissexto() {
		AnoBissexto ano = new AnoBissexto();
		assertEquals(true, ano.ehBissexto(0));
		assertEquals(true, ano.ehBissexto(400));
		assertEquals(true, ano.ehBissexto(2020));		
	}
	
	@Test
	public void naoDeveEntenderAnoBissexto() {
		AnoBissexto ano = new AnoBissexto();
		assertEquals(false, ano.ehBissexto(100));
		assertEquals(false, ano.ehBissexto(399));
		assertEquals(false, ano.ehBissexto(2019));
		
	}

}
