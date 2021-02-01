package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Essa classe tem por objetivo demonstrar o conceito de array de referência,
 * que é uma array que guarda a referência a um determinado objeto.
 * <br><br>
 * Veja a utilização do cast para superar o compilador na interpretação dos tipos
 * dos arrays de referências mais genéricos guardando referências mais específias.
 * 
 * @author Alex
 *
 */

public class TesteArrayDeReferencias2 {

	public static void main(String[] args) {
		
		String divisor = "-------------------------";
		
		System.out.println("inicio");
		System.out.println(divisor);
		
		Conta[] contas = new Conta[5];//array de referência!
		
		ContaCorrente cc1 = new ContaCorrente(110, 98984);
		contas[0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(220, 73542);
		contas[1] = cp1;
		
		System.out.println(divisor);
		for (int i = 0; i < contas.length; i++) {
			try {
			System.out.println( "i=" + i + " >> " +
								contas[i].getAgencia() + '.' +
								contas[i].getNumero());
			} catch (NullPointerException e) {
				System.out.println("i=" + i + " >> " + "não iniciada!");
			}
		}
		
		
		System.out.println(divisor);
		//utilização do cast		
		//ContaPoupanca cp2 = contas[1]; //não compila		
		ContaPoupanca cp2 = (ContaPoupanca)contas[1];//compilador, eu sei o que estou fazendo. A referência contida no índice 1
													 //do array contas aponta para uma ContaPoupança
		System.out.println("(Cast)cp2 conseguiu buscar a referência"
				+ " de uma ContaPoupanca em um array do tipo Conta: "
				+ cp2.getAgencia() + "." + cp2.getNumero());
		
		
		
		System.out.println(divisor);
		//causando um erro de cast
		ContaCorrente cc2 = null;
		try {
			cc2 = (ContaCorrente)contas[1];
		}catch (Exception e) {
			e.printStackTrace();
		}
		
				
		System.out.println(divisor);
		//array super genérico
		Object[] referencias = new Object[5];
		referencias[0] = cp1;
		referencias[1] = cp2;
		referencias[2] = cc1;
		referencias[3] = cc2;		
		System.out.println(referencias[1]);
		Object obj1 = new ContaCorrente(310, 4853);
		referencias[4] = obj1;
		System.out.println(referencias[4]);
		ContaCorrente cc4 = (ContaCorrente)referencias[4];
		cc4.deposita(588.84);
		System.out.println("cc4.getSaldo()= " + cc4.getSaldo());
		
		
		//fim
		System.out.println(divisor);
		System.out.println("fim");

	}

}
