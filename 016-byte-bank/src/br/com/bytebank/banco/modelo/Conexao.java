package br.com.bytebank.banco.modelo;
//AutoCloseAble - Contrato que permite a classe
//Fechar o recurso (objeto aberto) no try with resources!

public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }
// comentado, utilizado o close do contrato Autocloseable!
//    public void fecha() {
//        System.out.println("Fechando conexao");
//    }

	@Override
	//public void close() throws Exception { //assinatura original da interface
	public void close() { //você pode tirar o throws da assinatura de um método da interface sem problemas!
		System.out.println("Fechando conexao");
		
	}
}