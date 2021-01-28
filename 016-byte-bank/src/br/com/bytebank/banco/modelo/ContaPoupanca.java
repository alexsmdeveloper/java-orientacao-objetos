package br.com.bytebank.banco.modelo;




/**
 * 
 * Representação de uma Conta Poupança. Conta Poupança é uma extensão de {@link Conta}.
 * 
 * @author Alex
 * @version 1.0.0
 */
public class ContaPoupanca extends Conta {

	
	
	
	
	
	/**
	 * Construtor Conta Poupança.
	 * @param agencia Informe o código da Agência
	 * @param numero  Informe o número da Conta
	 */	
	//O construtor da classe mãe não é herdado.
	//Portanto, você deve definí-lo explicitamente!
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	/**
	 * Especialização na ContaPoupança!
	 */
	@Override
	public String toString() {
		return "Conta Poupança: " + super.toString();
	}
}
