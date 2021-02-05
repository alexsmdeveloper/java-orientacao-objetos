package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Alex");
		cliente.setProfissao("Desenvolvedor Java");
		cliente.setCpf("12345678");			
		//Serializando o objeto		                       //poderia ser qualquer extensão
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		//Desserializando um objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteRecebido = (Cliente)ois.readObject();
		System.out.println(clienteRecebido.getNome() + "-" + clienteRecebido.getProfissao());
		ois.close();
		
		

	}
	

}
