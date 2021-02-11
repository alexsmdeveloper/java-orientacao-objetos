import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * Utilizando recursos do java 8! <br>
 * Utilizando Methods Reference
 * 
 * @author Alex
 *
 */
public class OrdenaStringMethodReference {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("Caelum");

		//***************************************************************
		//***************************************************************
		//Dada uma String 's', compare o seu length
		palavras.sort(Comparator.comparing(s -> s.length()));		
		//outra forma de escrever a linha acima!
		Function<String, Integer> funcaoLength = s -> s.length();
		palavras.sort(Comparator.comparing(funcaoLength));
		//outra forma de escrever o mesmo código
		Function<String, Integer> funcaoLength2 = s -> s.length();
		Comparator<String> comparadorPalavras = Comparator.comparing(funcaoLength2);
		palavras.sort(comparadorPalavras);
		System.out.println("");
		palavras.forEach(palavra -> System.out.println(palavra));
		//***************************************************************
		//***************************************************************
		
		
		
		
		
		
		//***************************************************************
		//***************************************************************
		//Utilizando method reference
		//isto
		palavras.sort(Comparator.comparing(s -> s.length())); //lambda		
		//é igual daqui a 4 linhas! 
		//*Quem bater o olho no seu código deveria ser capaz de
		//saber na hora que o método que está sendo usado para ordenar
		//a coleção é o lengh() da classe String!
		palavras.sort(Comparator.comparing(String::length)); //method reference
		//ou ainda utilizando o import static
		palavras.sort(comparing(String::length)); //method reference com o import statico

		System.out.println("");
		palavras.forEach(palavra -> System.out.println(palavra));
		
		//alterando a ordem
		palavras.sort(null); 
		System.out.println("");
		palavras.forEach(palavra -> System.out.println(palavra));
		//alterando a ordem
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("");
		palavras.forEach(System.out::println); //= palavras.forEach(palavra -> System.out.println(palavra)); //method reference System.out::println
		//***************************************************************
		//***************************************************************
		
		


	}

}

