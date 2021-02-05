package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/**
 * 
 * 
 * @author Alex
 *
 */
public class TesteLeArquivo {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com arquivo (obtém os bytes)
				//FileInputStream fis = new FileInputStream("lorem.txt"); //throws FileNotFoundException, que extends IOException
				InputStream fis = new FileInputStream("lorem.txt"); //throws FileNotFoundException, que extends IOException

//				int v0 = fis.read();
//				System.out.println(v0);
//				char c0 = (char)v0;
//				System.out.println(c0);
//				while (v0 != -1) {
//					System.out.print(c0);
//					v0 = fis.read();
//					c0 = (char)v0;
//				}
				
				//Quem sabe ler o fluxo de Entrada (consegue converter os bytes lidos em Characteres)
				//InputStreamReader isr = new InputStreamReader(fis);
				//Reader isr = new InputStreamReader(fis, "windows-1252");
				Reader isr = new InputStreamReader(fis, "UTF-8");
				
				
//				System.out.println("lendo a partir do InputStreamReader");
//				System.out.println("********");
//				int v = isr.read();		
//				char c = (char)v;
//				while (v != -1) {
//					System.out.print(c);
//					v = isr.read();
//					c = (char)v;
//				}
//				System.out.println();
//				System.out.println("********");
//				System.out.println("lendo a partir do InputStreamReader");
				
					
				System.out.println();
				
				
				System.out.println("lendo a partir do BufferedReader");
				System.out.println("********");
				//Utilizando um leitor de buffer para acessar o conteúdo lido do Leitor do Fluxo de Entrada
				BufferedReader br = new BufferedReader(isr);	
				//finalmente o método que lê a linha!
				
				String linha = br.readLine(); //throws IOException
				while (linha != null) {
					System.out.println(linha);
					linha = br.readLine(); //throws IOException
				}		
				br.close();
				System.out.println("********");
				System.out.println("lendo a partir do BufferedReader");

		
		

	}
}


