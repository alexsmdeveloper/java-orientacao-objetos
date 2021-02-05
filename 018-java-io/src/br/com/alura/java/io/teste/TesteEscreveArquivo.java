package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/**
 * Escrevendo em um arquivo! 
 * Análogo a classe TesteLeitura
 * 
 * @author Alex
 *
 */
public class TesteEscreveArquivo {

	public static void main(String[] args) throws IOException {

		//Análogo a classe TesteLeitura
		OutputStream fow = new FileOutputStream("lorem_2.txt");
		Writer osw = new OutputStreamWriter(fow); //escreve dados binários!		
		BufferedWriter bw = new BufferedWriter(osw);	
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		bw.newLine();
		bw.write("Última linha do arquivo!");
		
		bw.close();
		
		
	}
}


