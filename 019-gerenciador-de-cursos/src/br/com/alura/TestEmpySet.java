package br.com.alura;

import java.util.Collections;
import java.util.Set;

/**
 * 
 * No código abaixo usamos mais um método da classe Collections.
 * Nesse caso criamos um conjunto vazio.
 * Será que podemos adicionar um elemento nesse conjunto?
 * Execute o código a seguir para ter certeza!
 * <br><br>
 * Também não podemos! Recebemos a mesma exceção: UnsupportedOperationException
 * Um conjunto destinado a ser vazio não pode ter um elemento, certo?
 * Então faz sentido receber essa exceção. Mas para que um conjunto vazio 
 * poderia ser útil?
 * <br><br>
 * Por exemplo, imagina que você precisa representar um curso que foi
 * cancelado pois não teve matriculas. Nesse caso faria todo sentido devolver
 * um Collections.emptySet()
 * 
 * @author Alex
 *
 */

public class TestEmpySet {

	public static void main(String[] args) {
		
		Set<String> nomes = Collections.emptySet();
		nomes.add("Alex");
		
	}

}
