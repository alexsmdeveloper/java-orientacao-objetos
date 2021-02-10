package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Para adicionarmos um objeto em um TreeSet ele precisa implementar 
 * a interface Comparable. Mas o que fazer se estamos trabalhando com
 * uma instância de uma classe que não temos acesso ou não podemos
 * modificar para implementar Comparable? Nesse caso, o construtor do
 * TreeSet recebe como parâmetro um objeto que implementa Comparator.
 * Dessa forma, o critério de comparação pode ser criado em separado da
 * classe na qual opera
 * 
 * @author Alex
 *
 */
public class TestaTreeSet2 {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
		

	}

}
