/*Tratando exceções com Try Catch*/

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		//} catch (ArithmeticException | NullPointerException | MinhaExcecaoChecked  e) {
		} catch (Exception  e) { //Usando do Polimorfismo!
			System.out.println("Bomba! Exceção *********> " + e.getMessage());
			e.printStackTrace();//imprime o rastro no console
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecaoChecked{
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecaoChecked{
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			
			System.out.println(i);
			
			//int resultado = i /0; //causando uma exceção
			
			//Conta c = null; //causando uma exceção
			
			Conta c = new Conta();
			
			c.deposita();
		}
		System.out.println("Fim do metodo2");
	}
}