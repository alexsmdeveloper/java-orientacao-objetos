package br.com.caelum.leilao.servico;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

/**
 * 
 * O pacote correto é o org.junit, e devemos sempre utilizá-lo. <br>
 * <br>
 * O pacote junit.framework é o pacote da versão mais antiga do JUnit, e deve
 * ser evitado.
 * 
 * É recomendado fazer o import estáticos durante os testes!
 * 
 * @author Alex
 *
 */
public class AvaliadorTest {

	@Test // notação necessária para indicar ao JUnit que quero testar esse método
	// public static void main(String[] args) { //o método não pode ser static nem
	// receber argumentos!
	
	/**
	 * Verifica o maior e menor lance
	 */
	public void deveEntenderLancesEmOrdemCrescente() {

		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		leilao.propoe(new Lance(joao, 250.0));
		leilao.propoe(new Lance(jose, 300.0));
		leilao.propoe(new Lance(maria, 400.0));

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		// comparando a saída com o esperado
		double menorEsperado = 250.0;
		double maiorEsperado = 400.0;

		// saída
		// Você utilizou o prinln quando fez o teste manual
		// System.out.println(leiloeiro.getMaiorLance());
		// System.out.println(leiloeiro.getMenorLance());
		// Agora com o Junit, utilize as classes devidas.

		// Efetuando o teste por comparação com o valor esperado!

		/*
		 * A ordem é sempre (esperado, calculado). Apesar de não fazer diferença nenhuma
		 * (afinal, esperamos que os dois números sejam iguais), é importante manter
		 * essa ordem. Quando o teste falha, o JUnit usa esses valores para exibir uma
		 * mensagem de erro amigável. Por exemplo, expected 10, but was 20. Ou seja,
		 * esperava 10, mas veio 20. Se invertêssemos os valores, a mensagem ficaria
		 * errada!
		 * 
		 */

		/*
		 * Como double tem limites de precisão, a versão mais nova do JUnit pede para
		 * você passar o "tamanho da precisão aceitável". No caso, estamos passando
		 * 0.00001. Ou seja, a diferença entre o esperado e o calculado pode ser de até
		 * 0.00001, que o JUnit entenderá como valor dentro da precisão aceitável.
		 * 
		 * Números de ponto flutuante (float e double), ao contrário de números
		 * inteiros, raramente representam números exatos, mas sim números dentro de um
		 * determinado limite de precisão.
		 * 
		 * Além disso, alguns números de ponto flutuante são representados como dízimas
		 * periódicas quando convertidos para binário. Por isso, pode ocorrer ainda
		 * algum arredondamento no dígito menos significativo.
		 */
		// Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance()); !!ERRADO!!
		// Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance()); !!ERRADO!!

		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);

	}

	/**
	 * Atestar a media dos lances
	 */
	@Test
	public void deveCalcularAMedia() {

		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		leilao.propoe(new Lance(joao, 250.0));
		leilao.propoe(new Lance(jose, 300.0));
		leilao.propoe(new Lance(maria, 400.0));

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		// Calcular a Media
		double mediaEsperada = (250 + 300 + 400) / 3.0;
		assertEquals(mediaEsperada, leiloeiro.getMediaLances(), 0.000001);
	}

	/**
	 * Atestar a media com zero lances no leilão.
	 */
	@Test
	public void deveEntenderAMediaComZeroLance() {

		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		// Avaliar a saida
		double mediaEsperada = 0.0;
		assertEquals(mediaEsperada, leiloeiro.getMediaLances(), 0.000001);
	}

	/**
	 * Atestar o maior lance e menor lance de um leilão que contenha apenas
	 * um único lance. O maior valor e o menor valor devem ser o mesmo.
	 */
	@Test
	public void deveEntenderLeilaoComApenasUmLance() {

		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");

		Leilao leilao = new Leilao("Play Station 3 novo");

		leilao.propoe(new Lance(joao, 1000.0));

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		//verificar a saida
		double valorEsperada = 1000.0;
		assertEquals(valorEsperada, leiloeiro.getMenorLance(), 0.000001);
		assertEquals(valorEsperada, leiloeiro.getMaiorLance(), 0.000001);
	}

	/**
	 * Atestar que em um leilão com vários lances em ordem randomica
	 * seja exibido o maior e menor lance corretamente
	 */
	@Test
	public void deveEntenderLeilaoComLancesEmOrdemRandomica() {

		// cenário 3 lances em ordem crescente
		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		leilao.propoe(new Lance(joao, 200.0));
		leilao.propoe(new Lance(maria, 450.0));
		leilao.propoe(new Lance(jose, 120.0));
		leilao.propoe(new Lance(joao, 700.0));
		leilao.propoe(new Lance(maria, 630.0));
		leilao.propoe(new Lance(jose, 330.0));

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		// Testar a média //valores informados no lance
		double menorEsperado = 120.0;
		double maiorEsperado = 700.0;
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
	}
	
	
	/**
	 * Atestar que em um leilão com lances lançados em ordem
	 * decrescente seja exibido o valor de maior lance e menor lance
	 * corretamente
	 */
	@Test
	public void deveEntenderLeilaoComLancesEmOrdemDecrescente() {

		// cenário 3 lances em ordem crescente
		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(maria, 300.0));
		leilao.propoe(new Lance(jose, 200.0));
		leilao.propoe(new Lance(joao, 100.0));		

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);

		// Testar a média //valores informados no lance
		double menorEsperado = 100.0;
		double maiorEsperado = 400.0;
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
	}
	
	/**
	 * Verificar se o método getTresMaior retorna os 3 maiores lances
	 * em um leilão com 5 lances
	 */
	@Test
	public void deveEncontrarOsTresMaioresLances() {

		// cenário 3 lances em ordem crescente
		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		leilao.propoe(new Lance(jose, 200.0));
		leilao.propoe(new Lance(joao, 400.0));
		leilao.propoe(new Lance(maria, 300.0));		
		leilao.propoe(new Lance(joao, 100.0));	
		leilao.propoe(new Lance(jose, 500.0));

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		List<Lance> tresMaiores = leiloeiro.getTresMaiores();

		// Averiguar Teste
		double primeiroMaiorEsperado = 500.0;
		double segundoMaiorEsperado = 400.0;
		double terceiroMaiorEsperado = 300.0;
		int quantidadeItensEsperado = 3;
		
		assertEquals(primeiroMaiorEsperado, tresMaiores.get(0).getValor(), 0.00001);
		assertEquals(segundoMaiorEsperado, tresMaiores.get(1).getValor(), 0.00001);
		assertEquals(terceiroMaiorEsperado, tresMaiores.get(2).getValor(), 0.00001);
		assertEquals(quantidadeItensEsperado, tresMaiores.size());
	}
	
	/**
	 * Verificar se o método getTresMaior retorna os 3 maiores lances
	 * em um leilão com 2 lances.
	 * O método getTresMaior deve devolver somente os dois lances que encontrou.
	 */
	@Test
	public void deveDevolverTodosLancesCasoNaoHajaNoMinimo3() {

		// cenário 3 lances em ordem crescente
		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		leilao.propoe(new Lance(jose, 200.0));
		leilao.propoe(new Lance(joao, 400.0));

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		List<Lance> tresMaiores = leiloeiro.getTresMaiores();

		// Averiguar Teste
		double primeiroMaiorEsperado = 400.0;
		double segundoMaiorEsperado = 200.0;
		int quantidadeItensEsperado = 2;
		
		assertEquals(primeiroMaiorEsperado, tresMaiores.get(0).getValor(), 0.00001);
		assertEquals(segundoMaiorEsperado, tresMaiores.get(1).getValor(), 0.00001);
		assertEquals(quantidadeItensEsperado, tresMaiores.size());

	}
	
	/**
	 * Um leilão sem nenhum lance, devolve lista vazia
	 */
	@Test
	public void deveDevolverListaVaziaCasoNaoHajaLances() {

		// cenário 3 lances em ordem crescente
		// cenário 3 lances em ordem crescente
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Usuario jose = new Usuario("José");

		Leilao leilao = new Leilao("Play Station 3 novo");

		// ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		List<Lance> tresMaiores = leiloeiro.getTresMaiores();

		// Averiguar Teste

		int quantidadeItensEsperado = 0;
		
		assertEquals(quantidadeItensEsperado, tresMaiores.size());

	}

}
