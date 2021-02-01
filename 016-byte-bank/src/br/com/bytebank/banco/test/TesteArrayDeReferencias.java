package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Essa classe tem por objetivo demonstrar o conceito de array de referência,
 * que é uma array que guarda a referência a um determinado objeto.
 * <br><br>
 * Veja também o uso de polimorfismo até mesmo em array, onde um array do tipo {@link Conta}
 * pode guardar referencia das classes mais específicas (classes filhas) 
 * {@link ContaPoupanca} e {@link ContaCorrente}. 
 * 
 * @author Alex
 *
 */

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		
		Conta[] referencias = new Conta[5];//array de referência!
		
		ContaCorrente cc1 = new ContaCorrente(110, 98984);
		referencias[0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(220, 73542);
		referencias[1] = cp1;
		
		for (int i = 0; i < referencias.length; i++) {
			try {
			System.out.println( "i=" + i + " >> " +
								referencias[i].getAgencia() + '.' +
								referencias[i].getNumero());
			} catch (NullPointerException e) {
				System.out.println("i=" + i + " >> " + "não iniciada!");
			}
		}
		
		

	}

}
