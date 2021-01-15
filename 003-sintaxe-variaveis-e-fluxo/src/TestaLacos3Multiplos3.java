
/*
 * Exercício
 * Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
 * */

public class TestaLacos3Multiplos3 {
	
	public static void main(String[] args) {
		
		System.out.println("Maneira 1");
		System.out.println("*********");
		for(int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Maneira 2");
		System.out.println("*********");
		for(int i = 0; i <= 100; i+=3) {
			System.out.print(i  + " ");
		}
		
	}
}
