
public class TestaEnum {
	
	public static void main(String[] args) {
		
		//Forma utilizar o Enum. É necessário apenas utilizar o valor da enumeração
		//que se deseja!
		//Definido referência
		Prioridade meuEnumMin = Prioridade.MIN;
		Prioridade meuEnumNormal = Prioridade.NORMAL;
		Prioridade meuEnumMax = Prioridade.MAX;
		Prioridade meuEnumSuperMax = Prioridade.SUPERMAX;
		
		System.out.println("Acessando a enumração através de referências!");
		System.out.println();
		System.out.println("name()    =>" + meuEnumMin.name());
		System.out.println("ordinal() =>" + meuEnumMin.ordinal());
		System.out.println("getValor()=>" + meuEnumMin.getValor());
		System.out.println();
		
		System.out.println("name()    =>" + meuEnumNormal.name());
		System.out.println("ordinal() =>" + meuEnumNormal.ordinal());
		System.out.println("getValor()=>" + meuEnumNormal.getValor());
		System.out.println();
		
		System.out.println("name()    =>" + meuEnumMax.name());
		System.out.println("ordinal() =>" + meuEnumMax.ordinal());
		System.out.println("getValor()=>" + meuEnumMax.getValor());
		System.out.println();
		
		System.out.println("name()    =>" + meuEnumSuperMax.name());
		System.out.println("ordinal() =>" + meuEnumSuperMax.ordinal());
		System.out.println("getValor()=>" + meuEnumSuperMax.getValor());
		System.out.println();
		
		System.out.println("Acessando a enumração diretamente. (Similar a uma classe estática)");
		System.out.println();
		System.out.println("name()    =>" + Prioridade.MIN.name());
		System.out.println("ordinal() =>" + Prioridade.MIN.ordinal());
		System.out.println("getValor()=>" + Prioridade.MIN.getValor());
		System.out.println();
		
		System.out.println("name()    =>" + Prioridade.NORMAL.name());
		System.out.println("ordinal() =>" + Prioridade.NORMAL.ordinal());
		System.out.println("getValor()=>" + Prioridade.NORMAL.getValor());
		System.out.println();
		
		System.out.println("name()    =>" + Prioridade.MAX.name());
		System.out.println("ordinal() =>" + Prioridade.MAX.ordinal());
		System.out.println("getValor()=>" + Prioridade.MAX.getValor());
		System.out.println();
		
		System.out.println("name()    =>" + Prioridade.SUPERMAX.name());
		System.out.println("ordinal() =>" + Prioridade.SUPERMAX.ordinal());
		System.out.println("getValor()=>" + Prioridade.SUPERMAX.getValor());
		System.out.println();
		
	}
}
