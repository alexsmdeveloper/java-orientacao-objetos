package br.com.alura;

/**
 * 
 * Representação de um Aluno
 * 
 * É uma boa prática - pra não dizer que é quase obrigatório - 
 * sempre que reescrevemos o método equals também reescrevermos o método hashCode, 
 * já que mesmo que no nosso código não utilize nenhum Set , 
 * existem diversos códigos que o utilizam, 
 * e caso não sobrescrevemos este método podemos esbarrar em bugs não esperados.
 * 
 * @author Alex
 *
 */
public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {
		//não faze sentido um aluno sem nome - Programando defensivamente!
		if (nome == null) { 
			throw new NullPointerException("Nome do aluno não pode ser Nulo!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return this.nome;
	}

	public int getNumeroMatricula() {
		return this.numeroMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + this.nome + ", numeroMatricula=" + this.numeroMatricula + "]";		
	}

	/**
	 * Sobreescrevendo equals... Utilizando o generate code do Eclipse!
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("Aluno.equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}
	
	/**
	 * É uma boa prática sobrescrever esse méto a sobrescrever o método hashCode
	 */
	@Override
	public int hashCode() {
		System.out.println("Aluno.hashCode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMatricula;
		return result;
	}

	
	
	
	
	
	

}
