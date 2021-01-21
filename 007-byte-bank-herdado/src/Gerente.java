//o gerente é um funcionário. Logo, um gerente herda (extende) a classe funcionário.
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação Gerente");
		return super.getBonificacao() + super.getSalario();
	}
}
