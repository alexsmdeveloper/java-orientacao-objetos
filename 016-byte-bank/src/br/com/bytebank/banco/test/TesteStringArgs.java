package br.com.bytebank.banco.test;


/**
 * Essa classe tem o objetivo de demonstrar o funcionamento
 * do parâmetro args, que é um array de String.
 * <br> <br>
 * Verifique na seta ao lado do botão Run, a opção Run Configuration,
 * onde você como o eclipse deve executar cada classe, e os parâmetros
 * que ela recebe na execução.
 * <br><br>
 * Você também pode executar diretamente pela linha de comando:
 * <br>
 * java fullqualifiedclassname parm1 parm2 ... parmN
 * 
 * @author Alex
 *
 */
public class TesteStringArgs {

	public static void main(String[] args) {
		System.out.println("Veja a seguir os parâmetros do String[] args");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
