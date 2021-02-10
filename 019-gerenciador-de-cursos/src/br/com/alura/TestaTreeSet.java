package br.com.alura;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


/**
 * 
 * Classe Criada a fim de testar o Funcionamento do TreeSet que exige que a classe
 * seja Comparável
 * <br><br>
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
public class TestaTreeSet {

	public static void main(String[] args) {
		
		Recibo r1 = new Recibo();
		Recibo r2 = new Recibo();
		Recibo r3 = new Recibo();
		Recibo r4 = new Recibo();
		
		Set<Recibo> recibos = new TreeSet<>();
		recibos.add(r1);

	}

}
