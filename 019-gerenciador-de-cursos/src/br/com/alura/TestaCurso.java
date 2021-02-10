package br.com.alura;

/**
 * Testando curso (que tem N aulas)
 * 
 * 
 * 
 * @author Alex
 *
 */
public class TestaCurso {

	public static void main(String[] args) {
		
		Curso cursoJavaColecoes = new Curso("Java Collections: Dominando Listas, Sets e Mapas", "Paulo Siveira");
		
		//má prática. O recomendado é que curso altere os cursos.
		//List<Aula> aulas = cursoJavaColecoes.getAulas();
		//aulas.add(new Aula("xxxxxxx", 432));
		
		//não permitido unmodifiableList()
		//cursoJavaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 20));
		//cursoJavaColecoes.getAulas().add(new Aula("Lista de objetos", 15));
		//cursoJavaColecoes.getAulas().add(new Aula("Relacionamento com coleções", 17));			
		
		cursoJavaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		cursoJavaColecoes.adiciona(new Aula("Lista de objetos", 15));
		cursoJavaColecoes.adiciona(new Aula("Relacionamento com coleções", 17));
		
		
		
		System.out.println(cursoJavaColecoes.getAulas());
		
		
		

	}

}
