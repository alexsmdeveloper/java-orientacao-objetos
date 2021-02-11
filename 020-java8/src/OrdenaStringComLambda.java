import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Utilizando recursos do java 8! <br>
 * Consumer com Lambda <br>
 * Comparator com Lambda<br><br>
 * 
 * Atenção!<br><br>
 * A ideia por de trás da lambda é que o código seja suscinto.<br>
 * Se a lambda tiver muitas linhas de código, é recomendado 
 * utilizar uma classe anônima ou uma outra classe.
 * 
 * @author Alex
 *
 */
public class OrdenaStringComLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.sort((s1, s2) -> s1.length() - s2.length());
		//ou
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));		
		palavras.forEach(palavra -> System.out.println(palavra)	);
		//ou
		//Consumer<String> consumidorReferencia = palavra -> System.out.println(palavra);
		//palavras.forEach(consumidorReferencia);
		
		
		
		//ATENÇÃO!!!!
		/*O código não funciona porque Object não é uma interface funcional.
		Lembre-se que para trabalhar com lambda, uma interface funcional precisa estar envolvida.
		O erro de compilação é bem intuitivo:
		*/
		//Object o = s -> System.out.println(s);

	}

}

