
public class TestePolimorfismo {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(110, 23298);
		cc.deposita(500);
		
		ContaPoupanca cp = new ContaPoupanca(110, 23298-9);
		cp.deposita(25000);
		
		cc.transfere(300, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
