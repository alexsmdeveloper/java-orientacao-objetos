package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

	private String descricao;
	private List<Lance> lances;

	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}

	/**
	 * Adiciona uma nova lance no leilão.
	 * 
	 * @param lance
	 */
	public void propoe(Lance lance) {

		if (lances.isEmpty() || podeDarLance(lance.getUsuario())) {
			lances.add(lance);
		}
	}

	/**
	 * Um usuário não pode dar dois lances seguidos. Um usuário pode no máximo dar 5
	 * lances.
	 * 
	 * @param lance
	 */
	private boolean podeDarLance(Usuario usuario) {
		return !ultimoLanceDado().getUsuario().equals(usuario) && quantidadeDeLancesDo(usuario) < 5;
	}

	private int quantidadeDeLancesDo(Usuario usuario) {
		int quantidadeLancesDoUsuario = 0;

		for (Lance l : this.lances) {
			if (l.getUsuario().equals(usuario)) {
				quantidadeLancesDoUsuario += 1;
			}
		}
		return quantidadeLancesDoUsuario;
	}

	private Lance ultimoLanceDado() {
		return lances.get(lances.size() - 1);
	}

	/**
	 * Dobra o último lance do usuario
	 */
	public void dobraLanceDo(Usuario usuario) {
		if (quantidadeDeLancesDo(usuario) > 0 && podeDarLance(usuario)) {
			double valorUltimoLance = valorUltimoLanceDo(usuario);
			propoe(new Lance(usuario, (valorUltimoLance * 2)));
		}
	}

	public Lance ultimoLanceDo(Usuario usuario) {
		Lance ultimoLance = null;
		for (Lance lance : lances) {
			if (lance.getUsuario().equals(usuario)) {
				ultimoLance = lance;
			}
		}
		return ultimoLance;
	}

	public double valorUltimoLanceDo(Usuario usuario) {
		Lance ultimoLance = ultimoLanceDo(usuario);
		return (ultimoLance != null ? ultimoLance.getValor() : 0.0);

	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

}
