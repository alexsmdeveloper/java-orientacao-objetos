import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
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
		System.out.println("-------------------------------------------");
		/*
		Utilizando a API de Stream, crie um filtro para 
		todos os cursos que tenham mais de 50 alunos.
		Depois disso faça um forEach no resultado. 
		Qual foi a saída do seu código?
		*/
		cursos.stream()
				.filter(curso -> curso.getAlunos() > 50)
				.forEach(curso -> System.out.println(curso.getNome()));
		
		System.out.println("-------------------------------------------");
		
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
		int totalAlunos = cursos.stream() //me dá o stream do curso
							.filter(curso -> curso.getAlunos() > 100) //filtre o cursos
							.mapToInt(Curso::getAlunos).sum(); //mapeie para inteiro e some!
		
		System.out.println("Total de Alunos: " + totalAlunos);
		
		
		
		//Como podemos fazer pra pegar o primeiro elemento desse Stream filtrado?
		System.out.println("-------------------------------------------");
		cursos.stream()  //me dá o stream de curso
				.filter(curso -> curso.getAlunos() > 50) //filtra esse stream
				.findFirst() // encontre o primeiro
				.ifPresent(primeiroCursoEncontrado -> System.out.println(primeiroCursoEncontrado.getNome())); //se encontrou faça alguma coisa, se não não faça nada		
		/*Ao utilizar o método findFirst()
		 *temos como retorno um Optional<Curso>. Por quê?
		 *Qual a vantagem de retornar um Optional no lugar de 
		 *retornar um curso diretamente?
		 * */		
		/*
		 * RESPOSTA: A interface Optional é similar a uma referência opcional, ou seja,
		 * caso essa referência seja nula, a execução do programa não será encerrada.
		 * 
		 * Ganhamos muito com essa nova introdução. Assim não precisamos escrever
		 *  aqueles diversos ifs garantindo que o objeto não é nulo, temos uma 
		 *  forma muito mais interessante de representar nossas intenções. 
		 *  A classe Optional nos oferece uma variedade imensa de novos métodos 
		 *  que nos permite trabalhar de forma funcional com nossos valores,
		 *   tirando maior proveito dos novos recursos de default methods, 
		 *   lambdas e method reference. Você pode ler mais sobre essa API em 
		 *   sua documentação:http://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
		 * */		

		
		
		/***********************************************************************/
		/***********************************************************************/
		
		/*Calcule a quantidade média de alunos de todos os seus cursos utilizando a API de Stream.*/
		cursos.stream()//me devolva um stream de curso
		      .mapToInt(Curso::getAlunos) //mapeie para inteiros a quantidade de alunos de cada curso
		      .average() //Calcule a média
		      .ifPresent(System.out::println); //se tem valor, faça a impressão na tela
		
		
		/***********************************************************************/
		/***********************************************************************/
		/*
		 * Coletando o resultado do stream em uma List
		 * */
		
		Stream<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50);
		
		/*Como podemos transformar esse Stream<Curso> filtrado em uma List<Curso>?*/
		List<Curso> cursosFiltrados = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		
		
		
		
		//*********************************************************************
		//Obtendo um curso a partir de um Stream
		System.out.println("-------------------------------------------");
		Optional<Curso> OpcionalDeCurso = cursos.stream()
			  .filter(curso -> curso.getAlunos() > 50) //ponha 1000 para causar uma exceção
			  .findAny();
		//Curso cursoQualquer = OpcionalDeCurso.get();//poderia, mas se não houvesse curso, a exceção aconteceira aqui
		Curso cursoQualquer = OpcionalDeCurso.orElse(null);//faz a função do get, entretanto se não houver curso, retorne o valor inserido no método! 
		System.out.println("Curso qualquer: " + cursoQualquer.getNome()); //se não existir a referencia, haverá uma exceção
		//Veja abaixo uma alternativa para evitar a exceção caso não haja um curso selecionado no filtro.
		OpcionalDeCurso.ifPresent(curso -> System.out.println("Curso qualquer: " + cursoQualquer.getNome()));
		
		//*********************************************************************
		//Obtendo um mapa a partir de um stream
		System.out.println("-------------------------------------------");
		Map<String, Integer> mapaCursos = cursos.stream()
			  .filter(curso -> curso.getAlunos() >= 50)
			  .collect(Collectors.toMap(curso -> curso.getNome(), curso -> curso.getAlunos()));
		//Reproduzindo o código acima sem atribuir o mapa, ou seja, o foreach parte diretamente do stream, ao invés da referencia mapaCursos!
		cursos.stream()
			  .filter(curso -> curso.getAlunos() >= 50)
			  .collect(Collectors.toMap(curso -> curso.getNome(), curso -> curso.getAlunos()))
			  .forEach((nome, qtdeAlunos) -> System.out.println("Curso: " + nome + " nº alunos: " + qtdeAlunos));//O foreach de um map recebe um biconsumer
		
		
		
		
	}

}
