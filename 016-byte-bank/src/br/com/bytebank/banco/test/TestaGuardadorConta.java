package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TestaGuardadorConta {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		ContaCorrente cc1 = new ContaCorrente(324, 4193);
		guardador.adiciona(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(812, 2130);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);
        
        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getAgencia() + "-" + ref.getNumero());
		

	}

}
