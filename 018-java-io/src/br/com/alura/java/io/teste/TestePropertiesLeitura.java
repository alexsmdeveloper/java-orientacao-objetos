package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.util.Properties;

/**
 * 
 * Lê o arquivo conf.properties gerado por {@link TestePropertiesLeitura}.
 * 
 * @author Alex
 *
 */
public class TestePropertiesLeitura {

	public static void main(String[] args) throws Exception {		
		
		
		Properties properties = new Properties();
		properties.load(new FileReader("conf.properties"));
		
		String login = properties.getProperty("login");
		String senha = properties.getProperty("senha");
		String endereco = properties.getProperty("endereco");
		
		String propriedades = String.format("login: %s %nsenha: %s %nendereco: %s",
											login, senha, endereco);
		
		System.out.println(propriedades);
		
		

	}

}
