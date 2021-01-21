//Essa classe só serve para fazer o polimorfismo
//Através desta classe eu consigo chamar o método autentica
//que pertence a uma interface. Entretando sua implementação está nas classes
//'assinantes'

public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel a) {
		boolean autenticou = a.autentica(this.senha);
		if(autenticou){
            System.out.println("Sistema Interno Liberado!");
        } else {
            System.out.println("Sistema Interno Inascessível!");
        }
	}
	
}
