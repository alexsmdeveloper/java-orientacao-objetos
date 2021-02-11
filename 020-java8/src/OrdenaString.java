import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


/**
 * Utilizando recursos do java 8!
 * <br>
 * Consumer
 * <br>
 * Comparator
 * 
 * @author Alex
 *
 */
public class OrdenaString {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		//ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		palavras.sort(comparador);
		
		Consumer<String> consumidor = new ImprimeNaLinha();		
		//ImprimeNaLinha consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
		
		

	}

}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String str) {
		System.out.println(str);
		
	}
	
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}
