
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65; //Compila
		System.out.println(valor);
		
		//valor = valor + 1; /*Não compila, java entende o 1 como inteiro(int), que é de maior tipo (maior que char)
		//     				  *já que se está fazendo uma operação matemática*/
		
		valor = (char) (valor + 1); //Assim compila!
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia"; //Atenção! String inicia com a letra maiúscula
		System.out.println(palavra);
		
		palavra = palavra + " " + 2020; //Atenção! No caso, não precisa converter 2020, a classe especial String resolve isso!
		System.out.println(palavra);
		
		
	}
}
