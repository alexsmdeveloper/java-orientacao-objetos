package br.com.alura;

/**
 * Representação de uma aula.
 * Método toString foi sobreescrito.
 * @author Alex
 *
 */
public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		//super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getTempo() {
		return this.tempo;
	}

	@Override
	public String toString() {
		return "Aula [titulo=" + this.titulo + ", tempo=" + this.tempo + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	
	
	
	
}
