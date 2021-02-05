package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TesteUnicodeEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s + " codePoint=" + s.codePointAt(0));
		String novaString = "";
		
		//Guardando o CharSet padrão do sistema e imprimindo o nome
		Charset charset = Charset.defaultCharset();
		System.out.println("CharSet padrão do Sistema=" + charset.displayName());
		System.out.println("*****************************************************");
		
		//UTF-8, padrão Linux
		byte[] bytes = s.getBytes();
		System.out.println(Arrays.toString(bytes) + ", " + bytes.length + " bytes, charSet " + "UTF-8");
		novaString = new String(bytes);
		System.out.println("novaString=" + novaString);
		System.out.println("*****************************************************");
		
		bytes = s.getBytes("windows-1252");
		System.out.println(Arrays.toString(bytes) + ", " + bytes.length + " bytes, charSet " + "windows-1252");
		novaString = new String(bytes, "windows-1252");
		System.out.println("novaString=" + novaString);
		System.out.println("*****************************************************");
		
		bytes = s.getBytes("UTF-16");
		System.out.println(Arrays.toString(bytes) + ", " + bytes.length + " bytes, charSet " + "UTF-16");
		novaString = new String(bytes, "windows-1252");
		System.out.println("novaString=" + novaString);
		novaString = new String(bytes, "UTF-16");
		System.out.println("novaString=" + novaString);
		System.out.println("*****************************************************");
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(Arrays.toString(bytes) + ", " + bytes.length + " bytes, charSet " + "US_ASCII");
		novaString = new String(bytes, "windows-1252");
		System.out.println("novaString=" + novaString);
		novaString = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println("novaString=" + novaString);
		novaString = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("novaString=" + novaString);
		System.out.println("*****************************************************");
		
		
		
		
		
		
		
		
		
		
		
	}

}
