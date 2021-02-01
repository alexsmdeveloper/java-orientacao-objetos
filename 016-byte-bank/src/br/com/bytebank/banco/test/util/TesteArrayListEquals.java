package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Meu primeiro teste com o ArrayList
 * 
 * Utlização do equals, que foi sobrescrito na classe conta.
 * 
 * @author Alex
 *
 */
public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(121, 1241);
		Conta cc2 = new ContaCorrente(121, 1241);
		
		lista.add(cc);
		
		System.out.println("lista.contains(cc2)=" + lista.contains(cc2));
		
		System.out.println("lista.equals(cc2)=" + lista.equals(cc2)); 

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		
		

	}

}
