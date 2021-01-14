
public class TestaConversao {
	
	public static void main (String[] args) {
		
		double salario = 1250.70;
		//int valor = salario; //não compila
		int valor = (int)salario; //casting
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		//resultado 0.30000000000000004, onde o esperado é 0.3
		//O tipo double não é o melhor tipo para isso.
		
		//float pontoFlutuante = 3.14;//não compila, para o java 3.14 é um double. Por padrão números decimais são vistos como double;
		float pontoFlutuante = 3.14f; //'f', outra maneira de fazer o casting;
		System.out.println(pontoFlutuante);
		
		
	}

}
