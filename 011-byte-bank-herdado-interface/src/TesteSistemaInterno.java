
public class TesteSistemaInterno {

	public static void main(String[] args) {
	
		System.out.println("teste 1 polimorfismo! *****************");
		
		Autenticavel referencia1 = new Gerente();//Polimorfismo
		Autenticavel referencia2 = new Administrador(); //Polimorfismo
		Autenticavel referencia3 = new Cliente(); //Polimorfismo
		
		System.out.println();
		System.out.println("teste 2 polimorfismo! *****************");
		
		Gerente g1 = new Gerente();
		Autenticavel a1 = g1;
		g1.setSenha(1234);
		System.out.println("g1.getSenha() " + g1.getSenha());
		a1.setSenha(4321);
		System.out.println("g1.getSenha() " + g1.getSenha());
		
		
		System.out.println();
		System.out.println("teste 3 polimorfismo! *****************");
		
		Gerente g0 = new Gerente();
		g0.setSenha(2222);
		
		Administrador a0 = new Administrador();
		a0.setSenha(1111);
		
		Cliente c0 = new Cliente();
		c0.setSenha(2222);
		
		//Essa classe está sendo instanciada para aproveitar o conteito de
		//polimorfismo!
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g0);
		si.autentica(a0);
		si.autentica(c0);
		
	}
	
}
