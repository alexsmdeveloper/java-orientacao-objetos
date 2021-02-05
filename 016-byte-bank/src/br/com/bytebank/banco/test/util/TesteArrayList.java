package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * Meu primeiro teste com o ArrayList
 * 
 * @author Alex
 *
 */
public class TesteArrayList {

	public static void main(String[] args) {
				
		
		//ArrayList lista = new ArrayList() !!! NÃO RECOMENTADO !!!!
		// ArrayList<Conta> lista = new ArrayList<Conta>();
		//ArrayList<Conta> lista = new ArrayList<>(); //Boa!
		//Os métodos de uma lista estão na interface Lista!
		//List<Conta> lista = new ArrayList<>(); //Boa!
		//List<Conta> lista = new LinkedList<>(); //Boa!
		List<Conta> lista = new Vector<>();//Boa!
		//Collection<Conta> lista = new Vector<>();//Collection é mãe de List e não tem os 
									//métodos específicos de uma lista, como por exemplo .get,
									//.remove, pois uma Collection funciona sem índice!!
		
		Cliente cliente = new Cliente();
		// lista.add(cliente);não compila!

		Conta cc = new ContaCorrente(121, 1241);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(212, 5252);
		lista.add(cc2);

		System.out.println("Tamanho (Posicoes Ocupadas): " + lista.size());

		//Conta ref = (Conta) lista.get(0); //não é mais necessário o cast, pois o ArrayList não é mais generic!!!
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);
		System.out.println("Tamanho (Posicoes Ocupadas): " + lista.size());

		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		System.out.println("Tamanho (Posicoes Ocupadas): " + lista.size());

		// forma legada
		for (int i = 0; i < lista.size(); i++) {
			Conta conta = lista.get(i);
			System.out.println(conta);
		}

		System.out.println("----------");

		// forma mais elegante/adequada --enhanced for
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//outras formas de inicialização do ArrayList************************************************************************
		ArrayList<Cliente> top10Clientes = new ArrayList<>(10); //se você souber quantas posições precisa! UF, por exemplo!
																//começa com 10, mas se precisar, ele aumenta dinamicamente!
		
		ArrayList novalista = new ArrayList(top10Clientes);
		System.out.println(novalista.size());
		

	}

}
