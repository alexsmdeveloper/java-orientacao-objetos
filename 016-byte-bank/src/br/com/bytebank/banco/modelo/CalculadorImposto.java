package br.com.bytebank.banco.modelo;

/**
 * 
 * Essa classe só serve para fazer o polimorfismo!
 * 
 * Através desta classe eu consigo chamar o método getValorDoImposto()
 * que pertence a interface {@link Tributavel}, permitindo o polimorfismo para
 * as classes assinantes: {@link ContaCorrente} e {@link SeguroVida}.
 * 
 * @author Alex
 *
 */
public class CalculadorImposto {
	
	private double totalImposto;
	
	public void calculaValor(Tributavel t) {
		this.totalImposto+= t.getValorDoImposto();
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
