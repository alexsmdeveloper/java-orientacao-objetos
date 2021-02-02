package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
		System.out.println();
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("A partir do java 1.8 Comparator do Objeto");
		System.out.println();
		System.out.println("*** Sem ordenção!");
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}		
		
		//A partir do java 1.8 java.util.Comparator<Conta>
		System.out.println();
		System.out.println("*** Ordenando pelo número da Conta");
		lista.sort(new NumeroDaContaComparator());		
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println();
		System.out.println("*** Ordenando pelo nome");
		lista.sort(new NomeDoTitularComparator());		
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println();
		System.out.println("*** Ordenando natural");
		lista.sort(null);		
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		
		
		//Antes do java 1.8, utilizava-se o Collections
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Antes do java 1.8, Collections!");
		System.out.println();
		System.out.println("*** Ordenando pelo número da Conta");
		Collections.sort(lista, new NumeroDaContaComparator());
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println();
		System.out.println("*** Revertendo a ordem");
		Collections.reverse(lista);
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println();
		System.out.println("*** Ordenando pelo nome");
		Collections.sort(lista, new NomeDoTitularComparator());
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println();
		System.out.println("*** Ordem Natural");
		Collections.sort(lista);
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println();
		System.out.println("*** Embaralhar");
		Collections.shuffle(lista);
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		System.out.println();
		System.out.println("*** Rotacionar");
		Collections.rotate(lista, 1);
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
	}

}


/**
 * 
 * Criando um comparador do número da conta através da interface 
 * java.util.Comparator
 * 
 * @author Alex
 *
 */
class NumeroDaContaComparator implements Comparator<Conta> {
	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
		//**********************************************************************
		//return c1.getNumero() - c2.getNumero();
		//**********************************************************************
		//if (c1.getNumero() > c2.getNumero()) {
		//	return 1;
		//}
		//if (c1.getNumero() < c2.getNumero()) {
		//	return -1;
		//}
		//return 0;
	}
}

/**
 * 
 * Criando um comparador do nome do Titular através da interface
 * java.util.Comparator
 * 
 * @author Alex
 * 
 *  */
class NomeDoTitularComparator implements Comparator<Conta> {
	@Override
	public int compare(Conta c1, Conta c2) {
		String nome1 = c1.getTitular().getNome();;
		String nome2 = c2.getTitular().getNome();
		return nome1.compareTo(nome2);
	}	
}



