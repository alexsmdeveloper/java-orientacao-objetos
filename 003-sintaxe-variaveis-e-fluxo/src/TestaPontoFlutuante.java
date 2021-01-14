
public class TestaPontoFlutuante {

	public static void main (String[] args) {
		
		double salario = 1250.70;
		
		System.out.println("meu salario é " +salario);
		
		//O java não permite que você atribua um valor flutuant a uma variável tipada como int;
		//int valor = 12.5; //Não compila
		//int valor = 0.0; //Não compila, o java não abre exceção, ponto flututante é ponto flutuante;
		//double teste = 125.50; //Compila
		//int valor = teste; //Não compila;
		
		
		int divisao = 5 / 2;
		/*Nesse ponto, você sabe que o resultado é 2.5. Entretanto, o java, não exibira o valor 2.5,
		 pois, a variável divisao é do tipo int. Mas por que ele permite a conta de um resultado será 
		 ponto flutuante? Por que os valores envolvidos são do tipo correto, ou seja do tipo int.*/
		System.out.println(divisao);
		
		double divisaoDouble = 5 / 2;
		/*Nesse ponto, você sabe que o resultado é 2.5. Entretanto, o java começa a conta pela direita.
		 * O java 'vê' dois elementeos inteiros, e logo presume que o resultado será inteiro. Quando o
		 * compilador vê que a variável é do tipo double, ele já tem o resultado truncado para o inteiro,
		 * e não para o tipo ponto flutuante, ainda que, a variável que armazena o valor seja do tipo que
		 * comporte armazenar ponto flutuante.*/
		System.out.println(divisaoDouble);
		
		/*Para resolver o problema acima, basta que um dos elementos seja do tipo flutuante,
		 * pois, o java entende que o resultado será o mesmo do elemente com maior range ou 
		 * abrangẽncia. No caso, podemos dizer que double tem uma maior abrangêncio do que o tipo int.*/
		double divisaoDoubleNovo = 5.0 / 2;
		System.out.println(divisaoDoubleNovo);
		
		
	}
	
}
