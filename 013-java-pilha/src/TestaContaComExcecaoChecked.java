/*Você pode lançar suas exceções!*/

public class TestaContaComExcecaoChecked {

	public static void main(String[] args){
		
		System.out.println("Ini do main");
		Conta c = new Conta();
		c.setTipoCartaoSolicitado(2);

		try {
			metodo1(c);
		} catch (MinhaExcecaoChecked e) {
			System.out.println("Fluxo interrompido!" + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void metodo1(Conta c) throws MinhaExcecaoChecked {
		System.out.println("Ini do metodo1");
		c.Acessa();
		metodo2(c);
		System.out.println("Solicitacao Emprestimo......");
		c.emprestimoAlemDoLimite();
		System.out.println("Solicitacao Emprestimo......Fim");
		System.out.println("Fim do metodo1");
	}

	private static void metodo2(Conta c) throws MinhaExcecaoChecked {
		System.out.println("Ini do metodo2");
		c.liberaCartaoCredito();// tem corpo, mas throws MinhaExcecaoChecked
		System.out.println("Fim do metodo2");
	}
}