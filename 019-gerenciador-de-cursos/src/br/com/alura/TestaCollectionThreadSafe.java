package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Testando o Collection.SinchronizedSet
 * 
 * Uma das características mais interessantes de JVM 
 * é que ela sabe trabalhar em paralelo. Internamente isso
 * é feito por meio de Threads que funcionam como pequenos processos dentro da JVM.
 * <br><br>
 * O problema é que as coleções que estamos usando até agora 
 * não foram feitas para serem manipuladas em paralelo. 
 * No entanto, nada impede que usemos um método da classe 
 * Collections para transformar uma coleção comum em uma coleção 
 * para threads. É justamente isso que o método faz, retorna um
 * nova coleção que pode ser compartilhada entre threads sem perigos.
 * <br><br> 
 *  O tópico de Threads é importante pois elas são muito utilizadas 
 *  dentro das bibliotecas que rodam no mundo Java. 
 *  Na Alura, temos dois treinamentos dedicados a threads:
 *  <br><br>
 *  https://cursos.alura.com.br/course/threads-java-1
 *  https://cursos.alura.com.br/course/threads-java-2
 * 
 * 
 * @author Alex
 *
 */
public class TestaCollectionThreadSafe {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Rafa Pereira", 485769);
		Aluno a2 = new Aluno("Marta Ramos", 9019384);
		Aluno a3 = new Aluno("Jorge Lucas", 392719);
		Aluno a4 = new Aluno("Sofia Silva", 134719);
						
		Set<Aluno> alunos = new HashSet<>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		System.out.println(alunos);
		
		
		Set<Aluno> alunoSincronizados = Collections.synchronizedSet(alunos);		
		System.out.println(alunoSincronizados);
		
		Set<Aluno> alunoNaoSincronizados = alunos;
		System.out.println(alunoNaoSincronizados);

		

	}

}
