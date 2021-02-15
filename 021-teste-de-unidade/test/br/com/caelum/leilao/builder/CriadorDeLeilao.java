package br.com.caelum.leilao.builder;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

/**
 * O objetivo das classes Buildes é criar cenários!
 * <br><br>
 * Será criado um leilão, com vários lances, e depois será retornado o leilão instanciado.
 * @author Alex
 *
 */
public class CriadorDeLeilao {

	private Leilao leilao;

	public CriadorDeLeilao para(String descricao) {
		this.leilao = new Leilao(descricao);
		return this;// retorne o tipo desta classe!
	}
	
	public CriadorDeLeilao lance(Usuario usuario, double valor) {
		this.leilao.propoe(new Lance(usuario, valor));
		return this; //retorne o tipo desta classe!
	}
	
	public Leilao constroi() {
		return this.leilao;
	}
	
	
}
