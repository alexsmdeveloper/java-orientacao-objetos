package br.com.bytebank.banco.modelo;

/**
 * 
 * Esta classe é uma abstração de conta. Serve de base para uma representação
 * de conta para as classes filhas que a utilizarem, por exemplo, ContaCorrente,
 * ContaEspecial, e outras...
 * 
 * @author Alex
 * @version 1.0.0
 */

//classe abstrata. Dessa forma Conta não pode ser instanciada. Com isso, apenas faz sentido instanciar uma ContaCorrente
//ou uma ContaPoupanca!
public abstract class Conta {

	// encapsulando os atributos *private
	protected double saldo;
	private int agencia;
	private int numero;
	// String titular; --Vamos utilizar a classe cliente, mais adequada!
	private Cliente titular;
	// definindo variável estática
	private static int total = 0;

	
	/**
	 * Documentação do Construtor Conta (Super Classe).
	 * Constrói a Conta partir:
	 * @param agencia 
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		// total++; Poderia ser assim ou
		Conta.total++; // já que total é da classe, e não da instância!
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta!");
	}

	// comentando esse método para praticar o conceita de abstração do método!
	// aqui não faz sentido deixar esse método abstrato, pois a lógica que serve
	// para as classes filhas já estava implementada aqui na mãe. O objetivo é
	// apenas
	// praticar o conceito de abstração de método.

	// public void deposita(double valor) {
	// this.saldo += valor;
	// }
	public abstract void deposita(double valor);// método abstrato. Forçando implementação nas filhas!

	/**
	 * Utilize esse mmétodo para sacar dinheiro da conta.
	 * @param valor : Valor a sacar.
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente.:" + this.saldo + 
												". Saque.:" + valor + ".");
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		// return total; //poderia ser assim
		return Conta.total;// total é da classe, e não da instância!
	}
	
	/**
	 * Método sobrescrito na Classe Conta!
	 * 
	 */
	@Override
	public String toString() {
		return "Agência: " + this.getAgencia() +
				" Conta: " + this.getNumero();
	}
	
	/**
	 * Compara se duas contas são iguais!
	 */
	@Override
	public boolean equals(Object ref){

	    Conta outra = (Conta) ref;

	    if(this.agencia != outra.agencia){
	        return false;
	    }

	    if(this.numero != outra.numero){
	        return false;
	    }

	    return true;
	}

}
