package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Serializando o objeto
		String nome = "Alex Matos";
		                                                    //poderia ser qualquer extensão
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(nome);
		oos.close();
		
		//Desserializando um objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeRecebido = (String)ois.readObject();
		System.out.println(nomeRecebido);
		ois.close();
		
		

	}

}
