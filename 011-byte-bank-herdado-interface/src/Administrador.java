//o Administrador é um funcionário. Logo, um Administrador herda 
//(extende) a classe funcionário.
// O Administrador tem um contrato com Autenticavel
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return 50.0;
	}
	
	@Override
	public void setSenha(int senha) {
		System.out.println("Administrador.setSenha()");
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		System.out.println("Administrador.autentica()");
		return this.autenticador.autentica(senha);
	}

}
