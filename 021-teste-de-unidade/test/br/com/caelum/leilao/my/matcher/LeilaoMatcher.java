package br.com.caelum.leilao.my.matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

/**
 * Criando meu próprio Matcher.
 * 
 * @author Alex
 */
public class LeilaoMatcher extends TypeSafeMatcher<Leilao> {
	
	private final Lance lance;
	
	public LeilaoMatcher(Lance lance) {
		this.lance = lance;
	}
	
	/**
	 * Método de validação
	 */
	@Override
	protected boolean matchesSafely(Leilao leilao) {
		return leilao.getLances().contains(this.lance);
	}

	/**
	 * Descrição do Matcher
	 */
	@Override
	public void describeTo(Description description) {
		description.appendText("leilao com lance " + lance.getValor());
	}

	/**
	 * Método que instanciará o meu Matcher
	 * @param lanceAVerificar
	 * @return
	 */
	public static LeilaoMatcher temOLance(Lance lanceAVerificar) {
		return new LeilaoMatcher(lanceAVerificar);
	}

}
