package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("lorem_filewriter.txt");
		BufferedWriter bw = new BufferedWriter(fw); //para ter acesso ao new Line();
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//fw.write(System.lineSeparator());
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");		
		bw.close();
		
		
	}

}
