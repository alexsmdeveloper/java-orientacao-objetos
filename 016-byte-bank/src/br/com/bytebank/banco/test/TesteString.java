package br.com.bytebank.banco.test;

/**
 * Esse classe tem o objetivo demonstrar as particularidades do tipo
 * {@link String}, que é uma classe do pacote java.lang. Também é visto a
 * utilização de alguns métodos da Classe {@link String}.
 * 
 * 
 * @author Alex
 *
 */
public class TesteString {

	public static void main(String[] args) {
		
		System.out.println();
		String nome = "Alex da Silva Matos";	//object literal ou valor literal, análogo a declarção de um tipo primitivo!
		String curso = new String("Alura Cursos"); // má prática!
		System.out.println("nome=" + nome);
		System.out.println("curso=" + curso);
		
		nome.replace('A', 'a'); //O valor de uma String é imutável! //aqui foi criada uma nova string e devolvida, a gente só n guardou em nenhum lugar
		System.out.println("nome [imutável]=" + nome);
		String outroNome = nome.replace('A', 'a');   // aqui foi criada uma nova string e guardamos dentro da variavel nome. 
													 //	A antiga referência que existia dentro dessa variavel será limpada
													 // pelo garbage colector
		System.out.println("outroNome=" + outroNome);
		
		System.out.println();
		System.out.println("nome.toUpperCase()=" + nome.toUpperCase());
		System.out.println("nome.toLowerCase()=" + nome.toLowerCase());
		System.out.println("nome.charAt()=" + nome.charAt(3));
		System.out.println("nome.indexOf()=" + nome.indexOf(" "));
		System.out.println("nome.toUpperCase()=" + nome.substring(8, 13));
		
		char c = ' ';
		
		for(int i = 0; i < curso.length(); i++) {
			c = curso.charAt(i);
			System.out.println(c);
		}
		
		String nomeVazio = "";
		String nomeEspaco = " ";
		
		System.out.println();
		System.out.println("nomeVazio.isEmpty()=" + nomeVazio.isEmpty());
		System.out.println("nomeVazio.isBlank()=" + nomeVazio.isBlank());
		System.out.println("nomeEspaco.isEmpty()=" + nomeEspaco.isEmpty());
		System.out.println("nomeEspaco.isBlank()=" + nomeEspaco.isBlank());
		
		System.out.println();
		String nomeComTrim = "                       meio da String : )                 ";
		System.out.println("nomeComTrim.length()=" + nomeComTrim.trim().length() + " nomeComTrim.trim()=" + nomeComTrim.trim());
		System.out.println("nomeComTrim.length()=" + nomeComTrim.strip().length() + " nomeComTrim.strip()=" + nomeComTrim.strip());
		
		System.out.println();
		String conteudo = "Silvas";
		System.out.println("nome.contains(conteudo))=" + nome.contains(conteudo));
		
		System.out.println();
		String regex = "[a]";
		String[] vetorRegex;
		vetorRegex =  nome.split(regex);
		for (int i = 0; i < vetorRegex.length; i++) {
			System.out.println("nome.split(regex))=" + vetorRegex[i]);
		}
		
		System.out.println();
		CharSequence meuCharSequence = "CharSequence é do tipo String ?"; //compilou
		System.out.println("meuCharSequence=" + meuCharSequence);
		String comparacao = "CharSequence é do tipo String ?";
		System.out.println(comparacao == meuCharSequence);
		
		
	}

}
