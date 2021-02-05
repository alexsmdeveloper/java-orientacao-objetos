package br.com.bytebank.banco.test;


/**
 * Essa classe tem por objetivo demonstrar o polimorfismo entre o tipo
 * {@link CharSequence} (Interface) e {@link String} (um tipo mais específico!)
 * 
 * @author Alex
 *
 */
public class TesteCharSequence {

	public static void main(String[] args) {
		
		
		System.out.println("***********************************************");
		System.out.println("Polimorfismo através da Interface CharSequence!");
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("String é uma Sequencia de Caracteres!");
		System.out.println("StringBuilder é uma Sequencia de Caracteres!");
		System.out.println("Todas as classes que implementam CharSequence, SÃO uma sequência de caracteres!");
		
		System.out.println();
		
		String texto = "A variável";
		texto = texto.concat(" 'texto' do tipo String");
		texto = texto.concat(" é");
		texto = texto.concat(" imutável,");
		texto = texto.concat(" logo,");
		texto = texto.concat(" muitos objetos");
		texto = texto.concat(" em memória");
		texto = texto.concat(" foram ");
		texto = texto.concat(" instanciados!");
		System.out.println(texto); 
		
		StringBuilder builder = new StringBuilder("A variável");
		builder = builder.append(" 'builder' do tipo StringBuilder");
		builder = builder.append(" é");
		builder = builder.append(" imutável,");
		builder = builder.append(" MAS,");
		builder = builder.append(" permite concatenação de forma mais eficiente,");
		builder = builder.append(" mantendo somente o");
		builder = builder.append(" mesmo objeto");
		builder = builder.append(" instanciado!");
		System.out.println(builder);
		
		System.out.println();
		System.out.println("Aproveitando o Polimorfimso a partir de CharSequence");
		System.out.println();
		String nome = "ALURA";
		CharSequence cs = new StringBuilder("ur");
		
		System.out.println(nome.substring(2, 3));

		nome = nome.replace("UR", cs);
		System.out.println(nome);

	}

}
