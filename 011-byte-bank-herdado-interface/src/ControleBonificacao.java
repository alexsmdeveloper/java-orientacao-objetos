
public class ControleBonificacao {
	
	private double soma;
	
	public double getSoma() {
		return soma;
	}
	
	//Exemplo de polimorfismo=> não importa o tipo(gerente, designer, etc.) que será recebido pelo método registra,
	//será utilizado o método da classe concreta (classe filha)
	public void registra(Funcionario f) {
		System.out.println("Funcionário=> " + f.getNome() + ", sua bonificação foi registrada!");
		this.soma+= f.getBonificacao();
	}
	
	

}
