
public class ContaPoupanca extends Conta {

	//O construtor da classe mãe não é herdado.
	//Portanto, você deve definí-lo explicitamente!
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
