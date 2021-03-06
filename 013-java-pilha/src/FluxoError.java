/*
 * A classe Throwable lança Exceções.
 * A classe Throwable também lança Errors.
 * Exceções são usadas em código da aplicação.
 * Erros são usados exclusivamente pela máquina virtual.
 * Exemplo=> Algo externo ao código. (falta de memória ram por exemplo)
 * Desenvolvedores de aplicação não devem criar erros que herdam de Error!
 * 
 * 
 * O objetivo dessa classe é causar um erro.
 * */

public class FluxoError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Bomba! Exceção *********> " + e.getMessage());
			e.printStackTrace();//imprime o rastro no console
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		metodo2();//forçando o erro!		
		System.out.println("Fim do metodo2");
	}
}