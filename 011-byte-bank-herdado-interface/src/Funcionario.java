
//classe abstrata=> a ideia é que seja uma classe mais conceitual.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; //dessa forma essa classe e as filhas teriam acesso a esse atributo!
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
//  comentando a implementação anterior, agora esse método será abstrato, ou seja, sua implementação se dará nas
//  classes filhas! Por exemplo, a regra cada funcionário (gerente, editor de vídeo, designer, etc) tem regras específicas
//  no método getBonificacao.	
//	public double getBonificacao() {
//		System.out.println("Bonificação Padrão Funcionário");
//		return this.salario * 0.1;
//	}
	public abstract double getBonificacao(); //repare que um método abstrato não tem corpo, ou seja sem chaves {}
}
