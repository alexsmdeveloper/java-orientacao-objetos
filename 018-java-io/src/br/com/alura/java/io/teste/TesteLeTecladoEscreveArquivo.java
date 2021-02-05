package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeTecladoEscreveArquivo {

	public static void main(String[] args) throws IOException {

		// fluxo de entrada
		InputStream fis = System.in;//teclado
		Reader ris = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(ris);

		// fluxo de saída
		OutputStream fos = new FileOutputStream("EntradaPeloTeclado.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			linha = br.readLine();
			if (linha != null) {
				bw.newLine();
			}
		}

		br.close();
		bw.close();

	}

}
