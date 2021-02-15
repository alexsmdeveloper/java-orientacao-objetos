package br.com.caelum.leilao.matematica;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/**
 * Testes de unidade referente a classe MatematicaMaluca.
 * 
 * @author Alex
 *
 */

public class MatematicaMaluaTest {

	@Test
	public void DeveEntenderNumeroMaiorQue30() {

		int parametro = 31;
		int valorEsperado = parametro * 4; //regra do método contaMacula
		MatematicaMaluca matematica = new MatematicaMaluca();

		assertEquals(valorEsperado, matematica.contaMaluca(parametro));

	}

	@Test
	public void DeveEntenderNumeroMaiorQue10EMenorQue30() {

		int parametro = 11;
		int valorEsperado = parametro * 3; //regra do método contaMacula
		MatematicaMaluca matematica = new MatematicaMaluca();

		assertEquals(valorEsperado, matematica.contaMaluca(parametro));

	}
	
	@Test
	public void DeveEntenderNumeroMenorQue10() {

		int parametro = 9;
		int valorEsperado = parametro * 2; //regra do método contaMacula
		MatematicaMaluca matematica = new MatematicaMaluca();

		assertEquals(valorEsperado, matematica.contaMaluca(parametro));

	}
	
	@Test
	public void DeveEntenderNumeroZero() {

		int parametro = 0;
		int valorEsperado = parametro * 2; //regra do método contaMacula
		MatematicaMaluca matematica = new MatematicaMaluca();

		assertEquals(valorEsperado, matematica.contaMaluca(parametro));

	}
	
	@Test
	public void DeveEntenderNumeroNegativo() {

		int parametro = -1;
		int valorEsperado = parametro * 2; //regra do método contaMacula
		MatematicaMaluca matematica = new MatematicaMaluca();

		assertEquals(valorEsperado, matematica.contaMaluca(parametro));

	}

}
