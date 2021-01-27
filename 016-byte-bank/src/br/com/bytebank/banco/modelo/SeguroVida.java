package br.com.bytebank.banco.modelo;

public class SeguroVida implements Tributavel{
	
	public SeguroVida() {
		System.out.println("Criando um seguro de Vida!");
	}

	@Override
	public double getValorDoImposto() {
		System.out.println("SeguroVida.getValorDoImposto");
		return 42;
	}
	
	
}
