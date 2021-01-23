/*
 * O Enum é uma classe com algumas caracteres especiais!!
 * */

public enum Prioridade {
	
	//Definição dos valores da Enumeração
	MIN(1), NORMAL(3), MAX(5), SUPERMAX(7);
	
	int valor;
	
	//o construtor do Enum é privado!
	Prioridade(int valor) {
		this.valor = valor;
	}
	
	//criar meus próprios métodos
	public int getValor() {
		return this.valor;
	}
	

}
