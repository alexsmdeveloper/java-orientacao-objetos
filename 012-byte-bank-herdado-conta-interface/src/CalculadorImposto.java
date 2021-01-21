//Essa classe só serve para fazer o polimorfismo
//Através desta classe eu consigo chamar o método getValorDoImposto
//que pertence a uma interface. Entretando sua implementação está nas classes
//'assinantes'

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void calculaValor(Tributavel t) {
		this.totalImposto+= t.getValorDoImposto();
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
