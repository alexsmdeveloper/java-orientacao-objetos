package br.com.alura.java.io.teste;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * Scanner é a classe de mais alto nível para ler o conteúdo de arquivos!
 * 
 * @author Alex
 *
 */
public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception {

		//Scanner scanner = new Scanner(new File("contas.csv"));
		//Scanner scanner = new Scanner(new File("contas.csv"), "windows-1252");
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

		while (scanner.hasNextLine()) {

			String linha = scanner.nextLine();			
			
			//Criando um novo scanner para separar os valores, que receberá a
			//própria linha lida
			Scanner linhaScanner = new Scanner(linha); 
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);//para que o scanner saiba que o separador 
											  //decimal utiliza ponto
			String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();
            
            String linhaFormatada = String.format( new Locale("pt", "BR"), //Definindo o separador decimal brasileiro!
            										"Tipo:%s >> %03d-%05d Tit.:%-15s R$%8.2f", 
            										tipoConta, agencia, numero, titular, saldo);
            
			System.out.println(linhaFormatada);
			linhaScanner.close();
		}
		
		scanner.close();

	}

}
