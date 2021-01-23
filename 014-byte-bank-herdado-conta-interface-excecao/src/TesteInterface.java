
public class TesteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);
		
		SeguroVida sv = new SeguroVida();
		
		//Definindo objeto que permite executar o polimorfismo
		CalculadorImposto calculador = new CalculadorImposto();
		calculador.calculaValor(cc);
		calculador.calculaValor(sv);
		System.out.println(calculador.getTotalImposto());
		
		//mas isso não te impede de utilizar diretamente o método da classe assinante
		//do contrato Tributável
		System.out.println("CC Valor do Imposto...........: " + cc.getValorDoImposto());
		System.out.println("Seguro Vida Valor do Imposto .: " + sv.getValorDoImposto());
		

	}

}
