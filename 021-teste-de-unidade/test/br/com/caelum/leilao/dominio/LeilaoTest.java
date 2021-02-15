package br.com.caelum.leilao.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeilaoTest {

	@Test
	public void deveReceberUmLance() {

		Leilao leilao = new Leilao("Macbook Pro 15");

		// Atestando leilão com 0 lances
		assertEquals(0, leilao.getLances().size());

		leilao.propoe(new Lance(new Usuario("Steve Jobs"), 2000));

		// Atestando que o leilão tem apenas 1 lance
		assertEquals(1, leilao.getLances().size());
		// Atestando o valor correto do lance
		assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0.000001);
	}

	@Test
	public void deveReceberVariosLances() {

		Leilao leilao = new Leilao("Macbook Pro 15");
		leilao.propoe(new Lance(new Usuario("Steve Jobs"), 2000));
		leilao.propoe(new Lance(new Usuario("Steve Wozniak"), 3000));

		// Atestando que o leilão tem 2 lances
		assertEquals(2, leilao.getLances().size());
		// Atestando o conteúdo

		assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0.000001);
		assertEquals(3000.0, leilao.getLances().get(1).getValor(), 0.000001);
	}

	@Test
	public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {

		Leilao leilao = new Leilao("Macbook Pro 15");
		Usuario steveJobs = new Usuario("Steve Jobs");

		// 2 lances seguidos do mesmo usuário
		leilao.propoe(new Lance(steveJobs, 2000.0));
		leilao.propoe(new Lance(steveJobs, 3000.0)); // Pela regra esse último lance deve ser ignorado

		// quantidade de itens
		assertEquals(1, leilao.getLances().size());
		// conteudo
		assertEquals(2000, leilao.getLances().get(0).getValor(), 00000.1);

	}

	@Test
	public void naoDeveAceitarMaisDoQue5LancesDoMesmoUsuario() {

		// cenário
		Leilao leilao = new Leilao("Macbook Pro 15");
		Usuario steveJobs = new Usuario("Steve Jobs");
		Usuario billGates = new Usuario("Bill Gates");

		leilao.propoe(new Lance(steveJobs, 2000.0));
		leilao.propoe(new Lance(billGates, 3000.0));

		leilao.propoe(new Lance(steveJobs, 4000.0));
		leilao.propoe(new Lance(billGates, 5000.0));

		leilao.propoe(new Lance(steveJobs, 6000.0));
		leilao.propoe(new Lance(billGates, 7000.0));

		leilao.propoe(new Lance(steveJobs, 8000.0));
		leilao.propoe(new Lance(billGates, 9000.0));

		leilao.propoe(new Lance(steveJobs, 10000.0));
		leilao.propoe(new Lance(billGates, 11000.0));

		// deve ser ignorado
		leilao.propoe(new Lance(steveJobs, 12000.0));

		// Verificação da quantidade
		assertEquals(10, leilao.getLances().size());
		// Verificação do último lance válido
		assertEquals(11000, leilao.getLances().get(leilao.getLances().size() - 1).getValor(), 0.000001);

	}
	
	/**
	 * Deve dobrar o lance do último usuário
	 */
	@Test
	public void deveEntenderUltimoLanceDoUsuario() {

		// cenário
		Leilao leilao = new Leilao("Notebook Asus Top Star Five");
		Usuario robert = new Usuario("Robert");
		Usuario flavia = new Usuario("Flávia");
		Usuario rodrigo = new Usuario("Rodrigo");

		leilao.propoe(new Lance(flavia, 1000));
		leilao.propoe(new Lance(robert, 1100));
		leilao.propoe(new Lance(flavia, 2000));
		leilao.propoe(new Lance(robert, 2100));
		leilao.propoe(new Lance(flavia, 3000));


		//saída
		//quantidade de itens
		assertEquals(5, leilao.getLances().size()); // quantidade
		// saída - verifica lance do Rodrigo		
		assertEquals(0, leilao.valorUltimoLanceDo(rodrigo), 0.00001); // conteudo
		// saída - verifica lance da Flávia
		assertEquals(3000, leilao.valorUltimoLanceDo(flavia), 0.00001); // conteudo
	}

	/**
	 * Deve dobrar o lance do último usuário
	 */
	@Test
	public void deveDobrarOLanceAnterior() {

		// cenário
		Leilao leilao = new Leilao("Notebook Asus Top Star Five");
		Usuario robert = new Usuario("Robert");
		Usuario flavia = new Usuario("Flávia");

		leilao.propoe(new Lance(flavia, 1000));
		leilao.propoe(new Lance(robert, 1100));
		leilao.propoe(new Lance(flavia, 2000));
		leilao.propoe(new Lance(robert, 2100));
		leilao.propoe(new Lance(flavia, 3000));

		// ação - dobrar o lance da Robert
		leilao.dobraLanceDo(robert);

		// saída - verifica lance do Robert
		assertEquals(6, leilao.getLances().size()); // quantidade
		assertEquals(4200, leilao.ultimoLanceDo(robert).getValor(), 0.00001); // conteudo

	}

	/**
	 * Tentativa de dobrar um lance do usuário que não deu lance ainda
	 */
	@Test
	public void naoDeveDobrarOLanceAnteriorUsuarioZeroLances() {

		// cenário
		Leilao leilao = new Leilao("Notebook Asus Top Star Five");
		
		Usuario robert = new Usuario("Robert");
		Usuario flavia = new Usuario("Flávia");
		Usuario ana = new Usuario("Ana");

		leilao.propoe(new Lance(flavia, 1000));		
		leilao.propoe(new Lance(ana, 2000));		
		

		// ação - dobrar o lance da Robert
		leilao.dobraLanceDo(robert);

		// saída - verifica lance do Robert
		assertEquals(2, leilao.getLances().size()); // quantidade
		assertEquals(0, leilao.valorUltimoLanceDo(robert), 0.00001); // conteudo

	}
	
	/**
	 * Tentativa de dobrar um lance do usuário que excedeu o limite do lance
	 */
	@Test
	public void naoDeveDobrarOLanceAnteriorUsuarioCom5Lances() {

		// cenário
		Leilao leilao = new Leilao("Notebook Asus Top Star Five");
		
		Usuario robert = new Usuario("Robert");
		Usuario flavia = new Usuario("Flávia");
		Usuario ana = new Usuario("Ana");

		leilao.propoe(new Lance(flavia, 1000));		
		leilao.propoe(new Lance(ana, 2000));
		leilao.propoe(new Lance(flavia, 3000));		
		leilao.propoe(new Lance(ana, 4000));
		leilao.propoe(new Lance(flavia, 5000));		
		leilao.propoe(new Lance(ana, 6000));
		leilao.propoe(new Lance(flavia, 7000));		
		leilao.propoe(new Lance(ana, 8000));
		leilao.propoe(new Lance(flavia, 9000));		
		leilao.propoe(new Lance(ana, 10000));		

		// ação - dobrar o lance da Robert
		leilao.dobraLanceDo(flavia);

		// saída - verifica lance do Robert
		assertEquals(10, leilao.getLances().size()); // quantidade
		assertEquals(9000, leilao.ultimoLanceDo(flavia).getValor(), 0.00001); // conteudo

	}

}
