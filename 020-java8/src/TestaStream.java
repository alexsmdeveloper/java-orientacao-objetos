import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Vamos utilizar a API de stream
 * 
 * @author Alex
 *
 */
public class TestaStream {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//ordenando com lambda
		//cursos.sort((c1, c2) -> c1.getAlunos() - c2.getAlunos());
		//cursos.forEach(curso -> System.out.println(curso.getNome()));
		
		//ordenando com method references
		//cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.sort(Comparator.comparingInt(curso -> curso.getAlunos()));
		cursos.sort(Comparator.comparingInt(curso -> curso.getAlunos()));
		cursos.forEach(curso -> System.out.println(curso.getNome()));
		System.out.println();
		/*
		Utilizando a API de Stream, crie um filtro para 
		todos os cursos que tenham mais de 50 alunos.
		Depois disso faça um forEach no resultado. 
		Qual foi a saída do seu código?
		*/
		cursos.stream()
				.filter(curso -> curso.getAlunos() > 50)
				.forEach(curso -> System.out.println(curso.getNome()));
		
		System.out.println();
		
		/**
		 * Como transformar o nosso Stream<Curso> em um 
		 * Stream<String> contendo apenas os nomes dos cursos
		 */		
		cursos.stream()
		.filter(curso -> curso.getAlunos() > 50)
		.map(Curso::getNome)//map(curso -> curso.getNome())
	    .forEach(System.out::println); //forEach(stringCurso -> System.out.println(stringCurso));
		//ou sem o filtro e guardando a referencia em uma stream
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		
		/*Mais um exemplo Total de Alunos*/
		int totalAlunos = cursos.stream()
							.filter(curso -> curso.getAlunos() > 100)
							.mapToInt(Curso::getAlunos).sum();
		
		System.out.println("Total de Alunos: " + totalAlunos);
		
		
		

	}

}
