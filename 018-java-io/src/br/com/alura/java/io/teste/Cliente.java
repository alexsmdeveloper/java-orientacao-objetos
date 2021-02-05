package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente.
 * @author Alex
 * @version 1.0.0
 */
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private String nome;
	private String cpf;
	private String profissao;
	////////////////////////public static String tipoCliente;
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
