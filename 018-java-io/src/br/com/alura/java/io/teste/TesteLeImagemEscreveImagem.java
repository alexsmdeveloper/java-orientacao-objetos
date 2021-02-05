package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TesteLeImagemEscreveImagem {

	public static void main(String[] args) throws IOException {
		
		long timeStart = System.currentTimeMillis();
		System.out.println("inicio...");

		// fluxo de entrada
		InputStream fis = new FileInputStream("imagem.png");

		// fluxo de saída
		OutputStream fos = new FileOutputStream("imagem-clonada.png");

		int nextByte = fis.read();
		while (nextByte != -1) {
			fos.write(nextByte);
			nextByte = fis.read();
			}
		
		fis.close();
		fos.close();
		
		System.out.println("fim");
		long timeEnd = System.currentTimeMillis();
		long miliSeconds = timeEnd - timeStart;
		double seconds = (miliSeconds / 1000.0);
		double minutes = (seconds / 60.0);
		System.out.println("Processo finalizado em " + miliSeconds + " milisegundos." );
		System.out.println("Processo finalizado em " + seconds + " segundos." );
		System.out.println("Processo finalizado em " + minutes + " minutos." );

	}

}
