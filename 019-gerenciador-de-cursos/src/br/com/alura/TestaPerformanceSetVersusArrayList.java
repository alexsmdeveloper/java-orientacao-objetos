package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 
 * Teste de perfomance entre arraylist e Set!
 * 
 * No caso do ArrayList, a inserção é bem rápida e a busca muito lenta!
 * <br><br>
 * No caso do HashSet, a inserção ainda é rápida, embora um pouco mais lenta do que a das listas.
 * Mas a busca é muito rápida!
 * 
 * @author Alex
 *
 */
public class TestaPerformanceSetVersusArrayList {

    public static void main(String[] args) {

    	System.out.println("Verifique a performance do ArrayList");
        Collection<Integer> numeros = new ArrayList<Integer>();
        
        long inicio = 0L;
        long fim = 0L;
        long tempoDeExecucao = 0L;
        int quantidadeDeItens = 100000;

        inicio = System.currentTimeMillis();
        for (int i = 1; i <= quantidadeDeItens; i++) {
            numeros.add(i);
        }
        fim = System.currentTimeMillis();
        tempoDeExecucao = fim - inicio;
        System.out.println("Tempo Inserção : " + tempoDeExecucao);

        inicio = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        fim = System.currentTimeMillis();
        tempoDeExecucao = fim - inicio;
        System.out.println("Tempo Pesquisa : " + tempoDeExecucao);


                
        
        //******************************************************
        
        
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("Verifique a performance do Set");
        numeros = new HashSet<>();
        
        inicio = System.currentTimeMillis();
        for (int i = 1; i <= quantidadeDeItens; i++) {
            numeros.add(i);
        }
        fim = System.currentTimeMillis();
        tempoDeExecucao = fim - inicio;
        System.out.println("Tempo Inserção : " + tempoDeExecucao);

        inicio = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        fim = System.currentTimeMillis();
        tempoDeExecucao = fim - inicio;
        System.out.println("Tempo Pesquisa : " + tempoDeExecucao);       
        		
        

    }

}