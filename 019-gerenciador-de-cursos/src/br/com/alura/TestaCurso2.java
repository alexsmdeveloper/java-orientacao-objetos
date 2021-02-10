package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Testando curso (que tem N aulas)
 * 
 * Como ordenar uma lista quando ela é unmodifiableList()
 * 
 * @author Alex
 *
 */
public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso cursoJavaColecoes = new Curso("Java Collections: Dominando Listas, Sets e Mapas", "Paulo Siveira");
		
		//má prática. O recomendado é que curso altere os cursos.
		//List<Aula> aulas = cursoJavaColecoes.getAulas();
		//aulas.add(new Aula("xxxxxxx", 432));
		
		//não permitido unmodifiableList()
		//cursoJavaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 20));
		//cursoJavaColecoes.getAulas().add(new Aula("Lista de objetos", 15));
		//cursoJavaColecoes.getAulas().add(new Aula("Relacionamento com coleções", 17));			
		
		cursoJavaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		cursoJavaColecoes.adiciona(new Aula("Lista de objetos", 15));
		cursoJavaColecoes.adiciona(new Aula("Relacionamento com coleções", 17));
		
		System.out.println(cursoJavaColecoes.getAulas());
		
		//Você não pode ordenar a lista desse modo, pois ela é unmodifiable
		List<Aula> aulasImutaveis = cursoJavaColecoes.getAulas();
		//Collections.sort(aulasImutaveis);
		List<Aula> aulasMutaveis = new LinkedList<Aula>(aulasImutaveis);
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		
		//Imprimindo o tempo total do curso
		System.out.println("Tempo Total do Curso " + 
							cursoJavaColecoes.getName() + ": " +
							cursoJavaColecoes.getTempoTotal() + " minutos.");
		System.out.println("Tempo Total do Curso " + 
				cursoJavaColecoes.getName() + ": " +
				cursoJavaColecoes.getTempoTotalJava8() + " minutos.");
		
		
	    System.out.println(cursoJavaColecoes);
	    
	    
	    
		

	}

}
