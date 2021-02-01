package br.com.bytebank.banco.modelo;

/**
 * 
 * Simular um "ArrayList" amador!
 * @author Alex
 *
 */
public class GuardadorDeContas {
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		referencias = new Conta[10];
		posicaoLivre = 0;
	}

	public void adiciona(Conta referencia) {		
		this.referencias[posicaoLivre] = referencia;
		this.posicaoLivre++;		
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int i) {
		return this.referencias[i];
	}
}
