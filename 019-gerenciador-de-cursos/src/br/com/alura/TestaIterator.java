package br.com.alura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Veja a seguir formas de percorrer uma coleção
 * <br><br>
 * No entanto, voltando ao passo mais longínquo, 
 * mais propriamente antes do Java 5, essa estrutura
 * não existia. Se não existia, como era possível iterar 
 * em um conjunto (Set) se ele não possui acesso indexado
 * como uma lista que possui o método get? Percorríamos 
 * uma lista através de um Iterator!
 * <br><br>
 * É um objeto que todas as coleções nos dão acesso 
 * e serve para iterar entre os objetos dentro da coleção. 
 * A ordem na qual os elementos são devolvidos pelo Iterator
 * depende da implementação da Collection utilizada.
 * 
 * @author Alex
 *
 */
public class TestaIterator {

	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<>();
		conjunto.add("A");
		conjunto.add("A"); // não adiciona, já existe
		conjunto.add("B");
		conjunto.add("C");
		
		//A partir do java 8		
		System.out.println("");
		conjunto.forEach(itemConjunto -> {
			System.out.println(itemConjunto);
		});
		
		
		//Antes do java 8
		System.out.println("");
		for (String itemConjunto : conjunto) {
			System.out.println(itemConjunto);
		}
		
		//Antes do java5
		System.out.println("");
		Set<Aluno> alunos = new HashSet<>();
		Aluno a1 = new Aluno("Rafa Pereira", 485769);
		Aluno a2 = new Aluno("Marta Ramos", 9019384);
		Aluno a3 = new Aluno("Jorge Lucas", 392719);
		Aluno a4 = new Aluno("Sofia Silva", 134719);
		Aluno a5 = new Aluno("Jorge Lucas", 392719);
		Aluno a6 = new Aluno("Jorge Lucas", 392720);
		Aluno a7 = new Aluno("Mirian Lopez", 17892);
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		alunos.add(a6); //não adiciona (hashCode() Aluno implementado!)
		alunos.add(a7);
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		

	}

}
