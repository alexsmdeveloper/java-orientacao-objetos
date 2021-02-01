package br.com.bytebank.banco.test;

import java.util.Arrays;
import java.util.List;

/**
 * Essa classe tem o objetivo de demonstrar o funcionamento do parâmetro args,
 * que é um array de String. <br>
 * <br>
 * Verifique na seta ao lado do botão Run, a opção Run Configuration, onde você
 * como o eclipse deve executar cada classe, e os parâmetros que ela recebe na
 * execução. <br>
 * <br>
 * Você também pode executar diretamente pela linha de comando: <br>
 * java fullqualifiedclassname parm1 parm2 ... parmN
 * 
 * @author Alex
 *
 */
public class TesteStringArgs2 {

	public static void main(String[] args) {

		System.out.println("Veja a seguir os parâmetros do String[] args");

		List<String> listaParametros = Arrays.asList(args); // Convertendo um Array em Lista
		for (String parm : listaParametros) {
			System.out.println(parm);
		}

//		System.out.println("Outra forma de popular o Arrays.asList");
//		String s1 = "string 1";
//		String s2 = "string 2";
//		String s3 = "string 3";
//		List<String> listaString = Arrays.asList(s1, s2, s3); // Convertendo um Array em Lista

	}

}
