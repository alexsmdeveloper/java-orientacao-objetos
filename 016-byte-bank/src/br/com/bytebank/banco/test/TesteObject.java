package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Essa classe tem por objetivo demonstrar a classe raiz do java: a Classe
 * {@link Object}, do pacote java.lang.
 * <br>
 * Aqui é possível perceber também o conceito de Polimorfismo.
 * 
 * @author Alex
 *
 */
public class TesteObject {

	public static void main(String[] args) {
		//java.lang.Object
		Object cc = new ContaCorrente(325, 1956);
		Object cp = new ContaPoupanca(3257, 19567);
		Object cliente = new Cliente();
		
		//java.lang.System
		System.out.println(cc); //= System.out.println(cc.toString());
		System.out.println(cp); //= System.out.println(cp.toString());
		System.out.println(cliente); //= System.out.println(cliente.toString());
		
		

	}

}
