package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Realizada a ordenação de lista, mas ao invés de definir as 
 * classes de comparação dentro do mesmo arquivo, utilizou-se
 * Classes Anônimas 
 * 
 * @author Alex
 *
 */
public class TesteOrdenacaoClasseAnonima {

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
		
		System.out.println();
		System.out.println("*** Sem ordenção!");
		for (Conta c : lista) {
			System.out.println(c);
		}		
		
		//A partir do java 1.8 java.util.Comparator<Conta>
		System.out.println();
		System.out.println("*** Ordenando pelo número da Conta");
					//Classe anônima!
		lista.sort(new Comparator<Conta>() {
					@Override
					public int compare(Conta c1, Conta c2) {		
						return Integer.compare(c1.getNumero(), c2.getNumero());
					}
				}				
				);		
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		
		//Classe anônima
		Comparator<Conta> comparatorContaTitular = new Comparator<Conta>() {
			@Override
			public int compare(Conta c1, Conta c2) {
				String nome1 = c1.getTitular().getNome();;
				String nome2 = c2.getTitular().getNome();
				return nome1.compareTo(nome2);
			}			
		};
		
		System.out.println();
		System.out.println("*** Ordenando pelo nome");
		lista.sort(comparatorContaTitular);		
		for (Conta c : lista) {
			System.out.println(c + ", Titular: " + c.getTitular().getNome());
		}
		

	}

}



