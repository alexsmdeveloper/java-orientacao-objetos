package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * Trabalhando com listas de Aulas
 * 
 * @author Alex
 *
 */
public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        
        System.out.println(aulas);
        
        //utilizando a ordem natural
        Collections.sort(aulas);        
        System.out.println(aulas);
        
        //ordenando pelo tempo (Recurso do java 8)
        //Esse não é o foco do curso, é só pra ir se acostumando com a sintaxe!
        //Esse tema será melhor abordado no java 8
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        
        
		
	}

}
