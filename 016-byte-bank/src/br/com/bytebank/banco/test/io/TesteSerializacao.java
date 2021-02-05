package br.com.bytebank.banco.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

/**
 * 
 * Teste de serialização com classes que tem herança
 * 
 * @author Alex
 *
 */
public class TesteSerializacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Nico");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("234113131");
//
//		ContaCorrente cc = new ContaCorrente(222, 333);
//		cc.setTitular(cliente);
//		cc.deposita(222.3);
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
//		oos.writeObject(cc);
//		oos.close();

//		
		Cliente cliente = new Cliente();
		cliente.setNome("Alex");
		cliente.setProfissao("Desenvolvedor Java");
		cliente.setCpf("12345678");
		
		ContaCorrente cc = new ContaCorrente(401, 9217);
		cc.setTitular(cliente);
		cc.deposita(819.23);		
		
		//Serializando o objeto		                       //poderia ser qualquer extensão
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();


	}

}
