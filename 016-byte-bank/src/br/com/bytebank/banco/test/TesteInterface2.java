package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroVida;
import br.com.bytebank.banco.modelo.Tributavel;

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
	}

}
