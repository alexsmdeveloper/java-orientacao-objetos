
public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta contaDoAlex = new Conta();
		Conta contaDaGisely = new Conta();
		System.out.println("contaDoAlex=>" + contaDoAlex.saldo);
		System.out.println("contaDaGisely=>" + contaDaGisely.saldo);
		
		contaDoAlex.deposita(1000.0);
		contaDaGisely.deposita(7000.0);
		System.out.println();
		System.out.println("contaDoAlex=>" + contaDoAlex.saldo);
		System.out.println("contaDaGisely=>" + contaDaGisely.saldo);
		
		contaDoAlex.saca(100.00);
		System.out.println();
		System.out.println("contaDoAlex=>" + contaDoAlex.saldo);
		System.out.println("contaDaGisely=>" + contaDaGisely.saldo);
		
		contaDaGisely.transfere(1000, contaDoAlex);
		System.out.println();
		System.out.println("contaDoAlex=>" + contaDoAlex.saldo);
		System.out.println("contaDaGisely=>" + contaDaGisely.saldo);
		
	}
}
