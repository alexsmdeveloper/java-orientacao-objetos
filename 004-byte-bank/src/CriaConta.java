
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo primeira Conta=>" + primeiraConta.saldo);
		
		primeiraConta.saldo+= 100;
		System.out.println("Saldo primeira Conta=>" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //Criando uma nova referência para o mesmo objeto instanciado!
		segundaConta.saldo = 50;
		System.out.println("Saldo segunda Conta=>" + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesmíssima conta!");
		}
		
		//Moral: 
		//primeiraConta e segundaConta são referências que apontam para o objeto instanciado.
		//O objeto foi criado quando feito o new Conta(). 
		
		
	}
	
}
