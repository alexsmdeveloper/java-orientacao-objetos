
public class Conta {
	
	private int tipoCartaoSolicitado;

	void deposita() throws MinhaExcecaoChecked{
	}
	
	void Acessa() {
		System.out.println("Acesso a conta bem sucedido!");
	}

	//Alertando que esse método é perigoso e que quem form implementá-lo deve tratá-lo.
	//A exceção não é lancada aqui! Este é apenas uma alerta para quem for utilizar
	//o método!
	void emprestimoAlemDoLimite() throws MinhaExcecaoChecked {
	}
	
	//Devo adicionar throws na assinatura do método por ser uma exceção Checked.
	void liberaCartaoCredito() throws MinhaExcecaoChecked {
		switch (this.tipoCartaoSolicitado) {
		case 1:
			System.out.println("1:Liberado Cartão Silver!");
			break;
		case 2:
			System.out.println("2:Liberado Cartão Gold!");
			break;
		default:
			//Aqui a exceção é lançada sobre a pilha!
			throw new MinhaExcecaoChecked("Cartão de Crédito não liberado!");
		}
	}

	public int getTipoCartaoSolicitado() {
		return this.tipoCartaoSolicitado;
	}

	public void setTipoCartaoSolicitado(int tipoCartaoSolicitado) {
		this.tipoCartaoSolicitado = tipoCartaoSolicitado;
	}
	
	

}
