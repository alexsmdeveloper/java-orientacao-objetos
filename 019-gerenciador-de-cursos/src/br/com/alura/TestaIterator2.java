package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Veja a seguir formas de percorrer uma coleção
 * <br><br>
 * Veja que podemos obter um Iterator de listas e conjuntos,
 * porque todos implementam a interface Collection.
 * 
 * @author Alex
 *
 */
public class TestaIterator2 {

	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		//A partir do java 8
		letras.forEach(letra -> {
		    System.out.println(letra);
		});
		
		//Antes do java5
		System.out.println();
		Iterator<String> iterador = letras.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
