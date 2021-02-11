/**
 *
 * @author Alex
 *
 */
public class TestaThreadComLamba {

	public static void main(String[] args) {

		// Considere o seguinte código que executa um Runnable em uma Thread:

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executando um Runnable com classe anônima");
			}

		}).start();
		
		
		//Resposta
		//Observe que como o método run não pede argumentos, 
		//apenas foi inserido os parâmetros () !
		new Thread( () -> System.out.println("Executando um Runnable com Lambda")).start();;

	}

}
