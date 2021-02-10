package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Trabalhando com uma lista de Strings.
 * 
 * @author Alex
 *
 */

public class TestandoListas {

	public static void main(String[] args) {
		
		//Instanciando objetos
		String curso1 = "Java introdução";
		String curso2 = "Java básico";
		String curso3 = "Java avançado";
		
		ArrayList<String> listaCursos = new ArrayList<>();
		//Adicionando referências!
		listaCursos.add(curso1);
		listaCursos.add(curso2);
		listaCursos.add(curso3);

		listaCursos.remove(curso2);
		
		listaCursos.forEach(curso -> {
			System.out.println(curso);
		});
		
		System.out.println("O primeiro curso da lista é: " + listaCursos.get(0));
		
		//causando uma exceção java.lang.IndexOutOfBoundsException:
		//for (int i = 0; i <= listaCursos.size(); i++) {
		//	System.out.println("indice-" + i + ": " + listaCursos.get(i));
		//}
		
		Collections.sort(listaCursos);
		System.out.println();
		System.out.println(listaCursos);
		
		

	}

}
