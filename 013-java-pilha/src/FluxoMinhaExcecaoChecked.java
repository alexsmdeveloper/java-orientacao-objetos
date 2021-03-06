/*Você pode lançar suas exceções!*/

public class FluxoMinhaExcecaoChecked {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecaoChecked e) {
			System.out.println("Bomba! Exceção *********> " + e.getMessage());
			e.printStackTrace();// imprime o rastro no console
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecaoChecked {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecaoChecked {
		System.out.println("Ini do metodo2");
		// lançando propositadamente uma exceção!
		throw new MinhaExcecaoChecked("Minha Exceção Checked!"); // checked!
		// System.out.println("Fim do metodo2");
	}
}