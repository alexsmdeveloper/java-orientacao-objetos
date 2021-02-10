package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Utilização de Map
 * Iteração através do keySet();
 * 
 * @author Alex
 *
 */

public class TestaMap {

	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        Set<Integer> pessoasSet = pessoas.keySet();
        for (Integer idade : pessoasSet) {
        	System.out.println(pessoas.get(idade));
		}
        
        //utilizando o recurso do java 8
        System.out.println();       
        pessoas.keySet().forEach(idade -> {
        	System.out.println(pessoas.get(idade));
        });
        

	}

}
