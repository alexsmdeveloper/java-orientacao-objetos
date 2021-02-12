package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Outros métodos de Collections.
 * <br><br>
 * Além do método sort() que vimos neste capítulo, a classe Collections
 * também possui muitos outros métodos interessantes. 
 * Vamos dar uma olhada em alguns:
 * <br><br>
 * Collections.reverse()
 * <br><br>
 * O método reverse() serve para inverter a ordem de uma lista.
 * As vezes precisamos imprimir uma lista de nomes do último para
 * o primeiro, ou uma lista de ids do maior para o menor e é nestas horas que utilizamos o reverse para inverter a ordem natural da lista para nós.
 * <br><br>
 * Collections.shuffle()
 * <br><br>
 * O método shuffle() serve para embaralhar a ordem de uma lista.
 * Por exemplo em um caso de um sistema de sorteio, em que precisamos
 * de uma ordem aleatória na nossa lista, utilizamos o método shuffle
 * para embaralhá-la.
 * <br><br>
 * Collections.singletonList()
 * <br><br>
 * O método singletonList() nos devolve uma lista imutável que contêm 
 * um único elemento especificado. Ele é útil quando precisamos passar
 * um único elemento para uma API que só aceita uma Collections daquele elemento.
 * Collections.nCopies()
 * <br><br>
 * O método nCopies() nos retorna uma lista imutável com a quantidade
 * escolhida de um determinado elemento. Se temos uma lista específica
 * e precisamos obter uma outra lista imutável , contendo diversas cópias
 * de um destes objetos, utilizamos o método nCopies(). O bom deste método
 * é que mesmo que nós solicitemos uma lista com um número grande,
 * como 10000 objetos, ele na verdade se referencia a apenas um, ocupando 
 * assim um pequeno espaço.
 * Este método também é utilizado para inicializar Listas recém criadas com Null, 
 * já que ele pode rapidamente criar diversos objetos, deste modo:
 * <br><br>
 * Estes são apenas alguns exemplos dos diversos métodos da classe Collections.
 * <br><br>
 * A grande lição aqui é que Collections possui vários métodos já implementados. 
 * Muitas vezes coisas que pensamos em codificar na mão já existem prontas, 
 * e implementadas de jeitos muito otimizados. Então é sempre bom utilizar 
 * o velho atalho CTRL + ESPAÇO para verificar se o que queremos já não existe
 * e ficar sempre de olho na documentação para entender o funcionamento de cada 
 * um destes métodos.
 * 
 * 

 * 
 * @author Alex
 *
 */
public class TesteMaisMetodosCollection {

	public static void main(String[] args) {
		
		List<Aula> aulas = new LinkedList<>();
	    aulas.add(new Aula("aula 1", 10));
	    aulas.add(new Aula("aula 2", 20));
	    aulas.add(new Aula("aula 2", 30));
	    System.out.println(aulas);
	    
	    List<Aula> aulasSingle = Collections.singletonList(aulas.get(1));
	    System.out.println(aulasSingle);
	    
	    List<Aula> aulasCopiadas = Collections.nCopies(3, aulas.get(1));
	    System.out.println(aulasCopiadas);
	    
	    
	    
	    

	}

}
