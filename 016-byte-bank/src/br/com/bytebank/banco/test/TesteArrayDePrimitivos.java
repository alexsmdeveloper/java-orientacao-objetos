package br.com.bytebank.banco.test;

/**
 * Essa classe tem o objetivo de utilizar um array primitivo e
 * verificar sua sintaxe básica.
 * 
 * @author Alex
 *
 */
public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int idade1 = 19;
		int idade2 = 29;
		int idade3 = 39;
		int idade4 = 49;
		int idade5 = 59;
		
		//mas e se você tivesse 100 idades? iria declarar 100 variáveis?
		
		int[] idades0 = {103, 100, 201, 304, 407, 509};//posso
		System.out.println(idades0[4]);
				        
		//referência    //objeto em memória, com o valor padrão do tipo!             
		int[] idades1 = new int[5];
		
		idades1[0] = 101;
		idades1[2] = 201;
		idades1[3] = 301;
		idades1[4] = 401;
		
		for (int i = 0; i < idades1.length; i++) {
			System.out.println("[" + i + "]=" + idades1[i]);
		}
		
				
		

	}

}
