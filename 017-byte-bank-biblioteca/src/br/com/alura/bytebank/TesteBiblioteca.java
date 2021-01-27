package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Essa classe tem o objetivo de demonstrar a utilização
 * de uma biblioteca exportada por mim mesmo, no projeto
 * 016-byte-bank.
 * 
 * 
 * @author alex
 *
 */

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(201, 45823);
		
		c.deposita(5050);
		
		System.out.println(c.getSaldo());
		

	}

}
