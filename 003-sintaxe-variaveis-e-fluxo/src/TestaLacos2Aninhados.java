
public class TestaLacos2Aninhados {
	
	public static void main(String[] args) {
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("melhorando o código, a cláusula do break vai para o for...");
		System.out.println();
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
