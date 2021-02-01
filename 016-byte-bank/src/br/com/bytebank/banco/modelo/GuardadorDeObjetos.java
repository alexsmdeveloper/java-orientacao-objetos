package br.com.bytebank.banco.modelo;

/**
 * 
 * Simular um ArrayList amador!
 * @author Alex
 *
 */
public class GuardadorDeObjetos {
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeObjetos() {
		referencias = new Object[10];
		posicaoLivre = 0;
	}

	public void adiciona(Object referencia) {		
		this.referencias[posicaoLivre] = referencia;
		this.posicaoLivre++;		
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int i) {
		return this.referencias[i];
	}
}
