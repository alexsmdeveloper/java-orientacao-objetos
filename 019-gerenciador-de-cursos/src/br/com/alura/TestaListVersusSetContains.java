package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Testando se o equals e hashCode é utilizando somente em Set
 * ou também em List
 * 
 * @author Alex
 *
 */
public class TestaListVersusSetContains {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Rafa Pereira", 485769);
		Aluno a2 = new Aluno("Marta Ramos", 9019384);
		Aluno a3 = new Aluno("Jorge Lucas", 392719);
		Aluno a4 = new Aluno("Sofia Silva", 134719);
		Aluno a5 = new Aluno("Jorge Lucas", 392719);
		Aluno a6 = new Aluno("Jorge Lucas", 392720);
		Aluno a7 = new Aluno("Mirian Lopez", 17892);
		
		//List.contains()
		List<Aluno> alunosList = new ArrayList<>();
		alunosList.add(a1);
		alunosList.add(a2);
		alunosList.add(a3);
		alunosList.add(a4);
		
		System.out.println("Lista contém o aluno: " + a5 + "?= " + alunosList.contains(a5));
		System.out.println("***");
		
		//Set.contais()
		Set<Aluno> alunosSet = new HashSet<>();
		alunosSet.add(a1);
		alunosSet.add(a2);
		alunosSet.add(a3);
		alunosSet.add(a4);
		System.out.println("Set contém o aluno: " + a5 + "?= " + alunosSet.contains(a5));
		
		
		
		

	}

}
