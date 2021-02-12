package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * Representa um curso e terá uma lista de aulas. <br><br>
 * 
 * List<Aula> aulas = new ArrayList<>();
 * Em vez de declararmos a referência a uma ArrayList<Aula> (ou LinkedList<Aula>),
 * o ideal é deixarmos mais genérico, utilizando a interface List. 
 * Por quê? Pelo motivo que já vimos ao estudar orientação a objetos aqui no Alura:
 * não temos motivo para ser super específico na instância que iremos usar. 
 * Se declararmos apenas como List, poderemos mudar de implementação, como para uma 
 * LinkedList, sem problema algum de compilação, por não termos nos comprometido 
 * com uma implementação em específico.
 * 
 * 
 * @author Alex
 *
 */
public class Curso {
	
	private String name;
	private String instrutor;
	//mais genérico                //mais específico
	private List<Aula> aulas = new LinkedList<>();
	//mais genérico                //mais específico
	private Set<Aluno> alunos = new HashSet<>();
	//mais genérico                //mais específico
	Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
	public Curso(String name, String instrutor) {
		this.name = name;
		this.instrutor = instrutor;
	}


	public String getName() {
		return this.name;
	}


	public String getInstrutor() {
		return this.instrutor;
	}

	/**
	 * 
	 * O método getAulas da classe Curso retorna um 
	 * Collections.unmodifiableList(aulas), para que não seja 
	 * mais possível alterar o valor dessa lista por fora da própria classe Curso
	 * 
	 * @return
	 */
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		System.out.println("Curso:matricula()");		
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	/**
	 * Busca no mapa se já existe a mátricula. Aqui a busca é por um atributo da classe.
	 * @param matricula
	 * @return Aluno
	 */
	public Aluno buscaMatriculado(int matricula) {
		if (matricula <= 0) {
			throw new NoSuchElementException("Matrícula não informada!");
		}
		return this.matriculaParaAluno.get(matricula);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	/**
	 * Verifica no conjunto se existe alguém com o mesmo hashcodé, já que alunos é um Set..
	 * @param aluno
	 * @return boolean, onde true está matriculado e false não está matriculado.
	 */
	public boolean estaMatriculado(Aluno aluno) {
		System.out.println("Classe Curso:estaMatriculado()");
		return this.alunos.contains(aluno);
	}
	
	
	/**
	 * Soma o tempo de todas as aulas
	 * @return
	 */
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : this.aulas) {
			tempoTotal+= aula.getTempo();
		}
		return tempoTotal;
	}

	/**
	 * Este método efetua o mesmo processamento do método getTempoTotal,
	 * só que ao invés disso utiliza o recurso do java 8.
	 * @return
	 */
	public int getTempoTotalJava8() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}


	@Override
	public String toString() {
		return "[Curso: " + this.name + ", tempo total: " + 
				this.getTempoTotal() + ", aulas: [" + this.aulas + "] ]";
	}
	
	
	
	
	
	
	

}
