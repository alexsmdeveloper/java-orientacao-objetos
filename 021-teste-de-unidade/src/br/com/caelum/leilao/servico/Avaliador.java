package br.com.caelum.leilao.servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class Avaliador {
	
	//Double negativo de menor valor possível ( Double.NEGATIVE_INFINITY < -9999999999.0)
	//assim, o primeiro valor já será atribuido
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	
	//Double positivo de maior valor possível ( Double.POSITIVE_INFINITY > 9999999999.0)
	//assim, o primeiro o lance será atribuido
	private double menorDeTodos = Double.POSITIVE_INFINITY;

	private double mediaLances = 0.0;

	private List<Lance> maiores; 
	
	public Avaliador() {
		
		System.out.println("Iniciando Avaliador....");
		System.out.println("maiorDeTodos=" + maiorDeTodos);
		
		if (maiorDeTodos > 0) System.out.println("Maior de Todos maior que zero");
		if (maiorDeTodos < 0) System.out.println("Maior de Todos menor que zero");
		if (maiorDeTodos == 0) System.out.println("Maior de Todos == zero");		
		if (menorDeTodos > 0) System.out.println("Menor de Todos maior que zero");
		if (menorDeTodos < 0) System.out.println("Menor de Todos menor que zero");
		if (menorDeTodos == 0) System.out.println("Menor de Todos == zero");
	
		if (maiorDeTodos < -9999999999.0) System.out.println("Maior de Todos menor que -9999999999.0");
		if (menorDeTodos > 9999999999.0) System.out.println("Menor de Todos maior que 9999999999.0");
			
		System.out.println("menorDeTodos=" + menorDeTodos);
		System.out.println("Avaliador Pronto.");
	}

	public void avalia(Leilao leilao) {
		
		if (leilao.getLances().size() == 0) {
			throw new RuntimeException("Não é possível avaliar Leilão sem lances!");
		}
		
		//vamos percorrer todos os lances desse leilão e procurar pelo maior valor
		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos) {
				maiorDeTodos  = lance.getValor();
			}
			//else  //para causar uma falha no teste  na classe TesteDoAvaliador descomente esse else!!!
			if (lance.getValor() < menorDeTodos ) {
				menorDeTodos = lance.getValor();
			}
		}
		
		//calculando a média com o recurso do java 8
		mediaLances  = leilao.getLances().stream().mapToDouble(Lance::getValor).average().orElse(0.0);
		
		pegaOsMaioresNo(leilao);
		
	}
	
	private void pegaOsMaioresNo(Leilao leilao) {
        maiores = new ArrayList<Lance>(leilao.getLances());
        /* Código legado !!!!!!!!!!!!!!!!!!!
        Collections.sort(maiores, new Comparator<Lance>() {
            public int compare(Lance o1, Lance o2) {
                if(o1.getValor() < o2.getValor()) return 1;
                if(o1.getValor() > o2.getValor()) return -1;
                return 0;
            }
        });
        */
        maiores.sort((l1, l2)-> Double.compare(l1.getValor(), l2.getValor()));// recurso do java 8 >
        Collections.reverse(maiores);
        maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size()); //Pega os 3 maiores, caso haja mais de 3 itens!!!!
    }
	
	public double getMediaLances() {
		return this.mediaLances;		
	}
	
	public double getMaiorLance() {
		return this.maiorDeTodos;
	}
	
	public double getMenorLance() {
		return this.menorDeTodos;
	}
	
	public List<Lance> getTresMaiores() {
		return maiores;
	}

}
