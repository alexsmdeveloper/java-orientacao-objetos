
public class Cliente implements Autenticavel {
 
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		System.out.println("Cliente.setSenha()");
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Cliente.autentica()");
		return this.autenticador.autentica(senha);
	}

}
