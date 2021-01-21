
public class ContaCorrente extends Conta {
	
	//O construtor da classe mãe não é herdado.
	//Portanto, você deve definí-lo explicitamente!
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //anotação que indica ao compilador que estou sobreescrevendo um método da classe mãe
	public boolean saca(double valor) {
		double valorDeSaqueDaContaCorrente = valor + 0.2;
		return super.saca(valorDeSaqueDaContaCorrente);
	}

}
