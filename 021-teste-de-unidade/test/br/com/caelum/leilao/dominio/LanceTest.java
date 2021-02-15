package br.com.caelum.leilao.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class LanceTest {
	
	private Usuario jony;
	
	@Before
	public void setUp() {
		jony = new Usuario("Jony");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarLanceIgualZero() {
		//cenário		
		Lance lanceZero = new Lance(jony, 0.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void naoDeveAceitarLanceMenorQueZero() {
		//cenário
		Lance lanceNegativo = new Lance(jony, -10.0);
	}
	
	@Test()
	public void deveAceitarLanceMaiorQueZero() {
		//cenário
		Lance lanceAceitavel = new Lance(jony, 10.0);
		assertEquals(10, lanceAceitavel.getValor(), 0.000001);
	}

}
