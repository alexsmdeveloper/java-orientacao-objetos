package br.com.alura;

import java.util.Set;

/**
 * Testando curso (que tem N aulas)
 * Associando Alunos ao curso
 * 
 * 
 * 
 * 
 * @author Alex
 *
 */
public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso cursoJavaColecoes = new Curso("Java Collections: Dominando Listas, Sets e Mapas", "Paulo Siveira");	
		
		cursoJavaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		cursoJavaColecoes.adiciona(new Aula("Lista de objetos", 15));
		cursoJavaColecoes.adiciona(new Aula("Relacionamento com coleções", 17));
		
		Aluno a1 = new Aluno("Rafa Pereira", 485769);
		Aluno a2 = new Aluno("Marta Ramos", 9019384);
		Aluno a3 = new Aluno("Jorge Lucas", 392719);
		Aluno a4 = new Aluno("Sofia Silva", 134719);
		Aluno a5 = new Aluno("Jorge Lucas", 392719);
		Aluno a6 = new Aluno("Jorge Lucas", 392720);
		Aluno a7 = new Aluno("Mirian Lopez", 17892);
		
		cursoJavaColecoes.matricula(a1);
		cursoJavaColecoes.matricula(a2);
		cursoJavaColecoes.matricula(a3);
		cursoJavaColecoes.matricula(a4);
		//cursoJavaColecoes.matricula(a5); //não permite adicionar (hashCode)
		
		System.out.println(cursoJavaColecoes.getAulas());
		System.out.println(cursoJavaColecoes.getAlunos().size());
		
		cursoJavaColecoes.getAlunos().forEach(
				aluno -> {System.out.println("Aluno: " + aluno.getNome() +
											  " Matricula: " + aluno.getNumeroMatricula());});
		
		//não permitido!
		//Set<Aluno> alunos = cursoJavaColecoes.getAlunos();
		//alunos.add(a4);
		
		//Set
		System.out.println(cursoJavaColecoes.getAlunos().size());
		
		cursoJavaColecoes.getAlunos().forEach(
				aluno -> {System.out.println("Aluno: " + aluno.getNome() +
											  " Matricula: " + aluno.getNumeroMatricula());});
		
		
		//Verificando se já contém no nosso set de alunos do Curso o Aluno a6
		System.out.println("Existe o aluno Jorge Lucas ?=" +
							cursoJavaColecoes.getAlunos().contains(a5));
		System.out.println("Existe o aluno Jorge Lucas ?=" +
				cursoJavaColecoes.getAlunos().contains(a6));
		
		
		
		
		
		

	}

}

