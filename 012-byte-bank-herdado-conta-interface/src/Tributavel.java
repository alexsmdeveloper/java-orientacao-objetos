//não é necessário declarar que uma interface é abstrata. O compilador já entende
//que se já é uma interface é abstrata
public interface Tributavel {

	//não pode ter atributos;
	
	// você poderia declarar o método assim:
	//public abstract double getValorDoImposto();
	//mas o compilador já entende sem o public abstract
	//pois na interface, todo método é public abstract
	double getValorDoImposto();
	
}
