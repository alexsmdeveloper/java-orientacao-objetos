/*Você pode lançar suas exceções!*/

public class FluxoMinhaExcecaoUnchecked {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecaoUnchecked e) {
			System.out.println("Bomba! Exceção *********> " + e.getMessage());
			e.printStackTrace();// imprime o rastro no console
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
		// lançando propositadamente uma exceção!
		throw new MinhaExcecaoUnchecked("Minha Exceção Unchecked!"); //unchecked!
		// System.out.println("Fim do metodo2");
	}
}