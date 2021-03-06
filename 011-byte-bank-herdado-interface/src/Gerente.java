//o gerente é um funcionário. Logo, um gerente herda (extende) a classe funcionário.
//O gerente tem um contrato com Autenticável!
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		System.out.println("Gerente.setSenha()");
		this.senha = senha;
		this.autenticador.setSenha(senha);
	}
	@Override
	public boolean autentica(int senha) {
		System.out.println("Gerente.autentica()");
		return this.autenticador.autentica(senha);
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação Gerente");
		//return super.getBonificacao() + super.getSalario(); // não é possível invocar um método abstrato!
		return super.getSalario(); //alteração na regra de negócio
	}
	
	public int getSenha() {
		return this.senha;
	}
}
