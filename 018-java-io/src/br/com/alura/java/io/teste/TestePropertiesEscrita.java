package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * O arquivo Properties é um arquivo utilizado para
 * guardar informações relevantes para o seu projeto
 * onde ao invés de ficar no código (o que exige recompilação
 * em caso de mudança) é um arquivo separado do código
 * fonte. <br><br>
 * Existe uma classe no mundo java que cria esse arquivo.
 * 
 * @author Alex
 *
 */
public class TestePropertiesEscrita {

	public static void main(String[] args) throws Exception {
		
		Properties properties = new Properties();
		properties.setProperty("login", "alura");
		properties.setProperty("senha", "alurapass");
		properties.setProperty("endereco", "www.alura.com.br");
		
		properties.store(new FileWriter("conf.properties"), "Arquivo de configuracao de login");
		
		

	}

}
