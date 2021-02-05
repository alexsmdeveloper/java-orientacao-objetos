package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class TesteDeserializacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		//Desserializando um objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente ccRecebido = (ContaCorrente)ois.readObject();
		System.out.println(ccRecebido + "-" 
							+ ccRecebido.getTitular().getNome() + " "
							+ ccRecebido.getTitular().getCpf() + " " //atributo transient
							+ ccRecebido.getTitular().getProfissao() 
							);
		ois.close();

	}

}
