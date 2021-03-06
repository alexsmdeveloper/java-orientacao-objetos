
public class Conta {
	
	//encapsulando os atributos *private
	private double saldo;
	private int agencia;
	private int numero;
	//String titular; --Vamos utilizar a classe cliente, mais adequada!
	private Cliente titular;
	//definindo variável estática
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		//total++; Poderia ser assim ou
		Conta.total++; //já que total é da classe, e não da instância!
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta!");
	}

	public void deposita(double valor) {
			this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo-= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
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
		//return total; //poderia ser assim
		return Conta.total;//total é da classe, e não da instância!
	}

}
