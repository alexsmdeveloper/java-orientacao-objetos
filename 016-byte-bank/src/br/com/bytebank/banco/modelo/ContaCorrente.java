package br.com.bytebank.banco.modelo;



/**
 * 
 * Representação de uma Conta Corrente. Conta Corrente é uma extensão de {@link Conta}.
 * 
 * @author alex
 * @version 1.0.0
 */
public class ContaCorrente extends Conta implements Tributavel {

	
	
	
	/**
	 * Construtor Conta Corrente.
	 * @param agencia Informe o código da Agência
	 * @param numero  Informe o número da Conta
	 */	
	//O construtor da classe mãe não é herdado.
	//Portanto, você deve definí-lo explicitamente!
	public ContaCorrente(int agencia, int numero) {		
		super(agencia, numero);
	}	
	
	
	
	/**
	 * Utilize esse mmétodo para sacar dinheiro da conta.
	 * Atenção! Por ser conta corrente tem uma regra especial.
	 * @param valor : Valor a sacar.
	 */
	@Override //anotação que indica ao compilador que estou sobreescrevendo um método da classe mãe
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorDeSaqueDaContaCorrente = valor + 0.2;
		super.saca(valorDeSaqueDaContaCorrente);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}


	@Override
	public double getValorDoImposto() {
		System.out.println("ContaCorrente.getValorDoImposto");
		return this.getSaldo() * 0.1;
	}
	
	/**
	 * Especiliazação na Conta Corrente.
	 */
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}
	


}
