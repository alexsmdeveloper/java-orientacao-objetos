package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
 * 
 * Esta classe foi criada inicialmente para demonstrar que uma classe filha
 * consegue acessar um atributo 'protected' mesmo que a classe mãe (Conta)
 * esteja em outro pacote. Representação de uma Conta Especial. ContaEspecial é 
 * uma extensão de {@link Conta}.
 * 
 * @author Alex
 * @version 1.0.0
 */
public class ContaEspecial extends Conta {
	
	
	
	
	
	
	
	/**
	 * Construtor Conta Especial.
	 * @param agencia Informe o código da Agência
	 * @param numero  Informe o número da Conta
	 */	
	//O construtor da classe mãe não é herdado.
	//Portanto, você deve definí-lo explicitamente!
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		this.saldo+= valor;
		System.out.println("Depósito " + this.saldo + ""
				+ " especial realizado com sucesso!");

	}

}
