package br.com.bytebank.banco.test;

/**
 * Teste Array Literal
 * Veja outra forma de declarar array!
 * 
 * @author Alex
 *
 */
public class TesteArrayLiteral {

	public static void main(String[] args) {
		
		int[] idades = {18, 30, 31, 57, 63, 24};
		
		System.out.println("idades.length=" + idades.length);
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("idades" + '[' + i + "]=" + idades[i]);
		}
		
	}

}
