
public class TestePolimorfismo {
	
	public static void main(String[] args) {
		
		//testando o polimorfismo
		
		ControleBonificacao registra = new ControleBonificacao();
		
		Gerente g1 = new Gerente();
		g1.setNome("Alex");
		g1.setSalario(30000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Walter Casagrande");
		ev.setSalario(8000.0);
		
		Designer d = new Designer();
		d.setNome("Lopes");
		d.setSalario(5200.0);
		
		registra.registra(g1);
		registra.registra(ev);
		registra.registra(d);
		
		System.out.println();
		System.out.println("Bonificação Gerente      ........>" + g1.getBonificacao());
		System.out.println("Bonificação Editor Video ........>" + ev.getBonificacao());
		System.out.println("Bonificação Designer     ........>" + d.getBonificacao());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Total de Bonificaçãoes   ........>" + registra.getSoma());		
		
		System.out.println();
		System.out.println("Testando polimorfismo");
		
		Funcionario funcionarioGenerico1 = g1; //ok compila!
		Funcionario funcionarioGenerico2 = new Gerente(); //ok compila;
		Funcionario funcionarioGenerico3 = new EditorVideo(); //ok compila;
		//EditorVideo editorVideoPolimorfico = g1; //não compilou. Gerente é um tipo específico, assim como EditorVideo.
		//EditorVideo editorVideoPolimorfico2 = new Gerente(); //não compilou. Gerente é um tipo específico, assim como EditorVideo.
		
		
	}
}
