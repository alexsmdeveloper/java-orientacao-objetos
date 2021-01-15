/*Imprima o fatorial de 1 a 10
 * */


public class TestaLacos4Fatorial {
	
	public static void main(String[] args) {
		
		int fatorial = 1;
		for(int i = 1; i <= 10; i++) {
			fatorial *= i;
			System.out.println(i + "! : " + fatorial);
		}
	}
}
