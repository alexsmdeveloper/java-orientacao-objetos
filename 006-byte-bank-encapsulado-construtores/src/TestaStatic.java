
public class TestaStatic {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(120, 80462);
		System.out.println(Conta.getTotal());
		Conta conta2 = new Conta(120, 80371);
		System.out.println(Conta.getTotal());
		Conta conta3 = new Conta(762, 91463);
		System.out.println(Conta.getTotal());
	}

}
