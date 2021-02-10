package br.com.alura;

import java.util.Comparator;
/**
 * Implementa a interface Comparator
 *  usando como critério de comparação a idade de funcionários
 * 
 * @author Alex
 *
 */
public class OrdenaPorIdade implements Comparator<Funcionario>{

	@Override
	public int compare(Funcionario f1, Funcionario f2) {		
		return Integer.compare(f1.getIdade(), f2.getIdade());
	}

}
