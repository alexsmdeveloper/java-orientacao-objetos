package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * Segundo o JavaDoc, um Map também pode ser visto como se fossem de 3 coleções:
 * <br><br>
 * The Map interface provides three collection views, 
 * which allow a map's contents to be viewed as a set of keys, 
 * collection of values, or set of key-value mappings.
 * Ou seja, temos uma coleção de chaves, uma coleção de valores, 
 * e uma coleção das associações. O interessante é que podemos 
 * acessar cada uma das coleções. Vamos tentar?
 * 
 * @author Alex
 *
 */

public class TestaMapChavesValores {

	public static void main(String[] args) {
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        //Acessando as chaves
        System.out.println("**Acessando as chaves **");
        for (String nome : nomesParaIdade.keySet()) {
        	System.out.println(nome);
        }
        
        //Acessando os valores
        System.out.println("**Acessando os valores **");
        for (int valor : nomesParaIdade.values()) {
        	System.out.println(valor);
        }
        
        //Acessando a associação
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String, Integer> associacao : associacoes) {
        	System.out.println("key: " + associacao.getKey() + " - valor: "+ associacao.getValue());
        }

	}

}
