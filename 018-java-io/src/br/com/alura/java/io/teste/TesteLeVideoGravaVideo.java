package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TesteLeVideoGravaVideo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("inicio...");

		// fluxo de entrada
		InputStream fis = new FileInputStream("video.mp4");

		// fluxo de saída
		OutputStream fos = new FileOutputStream("video-clonado.mp4");

		int nextByte = fis.read();
		while (nextByte != -1) {
			fos.write(nextByte);
			nextByte = fis.read();
			}
		
		fis.close();
		fos.close();
		
		System.out.println("fim");

	}

}
