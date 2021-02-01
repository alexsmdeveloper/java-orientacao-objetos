package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroVida;
import br.com.bytebank.banco.modelo.Tributavel;

/**
 * Essa classe foi criada com o objtivo de demonstrar que uma interface
 * pode ser utilizada como uma referência de um tipo mais genéric para um 
 * tipo mais específico!, permitindo que seja utilizado o conceito de 
 * Polimorfismo.<br><br>
 * 
 * Então você verá por exemplo que {@link ContaCorrente} é {@link Tributavel} e
 * {@link Tributavel} é {@link ContaCorrente}.<br><br>
 * 
 * Você também verá que {@link SeguroVida} é {@link Tributavel} e {@link Tributavel}
 * é {@link SeguroVida}
 * 
 * @author Alex
 *
 */
public class TesteInterface2 {

	public static void main(String[] args) {

		//Tributável é uma interface.
		Tributavel tributavelCC = new ContaCorrente(223, 7894);
		Tributavel tributavelSV = new SeguroVida();		
		
		System.out.println("Tributável é uma Inteface!");
		System.out.println("Conta Corrente é Tributável e Seguro de Vida é Tributável!");
		System.out.println("logo...");
		System.out.println("Tributável é ContaCorrente! e Tributável é Seguro de Vida!");
		System.out.println();
		System.out.println("Uma interface é quem a implementou! e....");
		System.out.println("Quem implementou é uma interface!");
		System.out.println();
		System.out.println("Bem vindo ao Polimorfismo!");
		
		System.out.println("-------------------------------------------------");
		ContaCorrente cc = (ContaCorrente)tributavelCC;
		cc.deposita(100);
		System.out.println("Referência Conta Corrente");
		System.out.println("cc.getValorDoImposto()=" + cc.getValorDoImposto());
		System.out.println();
		System.out.println("Interface");
		System.out.println("tributavelCC.getValorDoImposto()=" + tributavelCC.getValorDoImposto());
	}

}
