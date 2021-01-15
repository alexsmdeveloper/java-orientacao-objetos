
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando condicionais...");

		int idade = 20;
		int quantidadePessoas = 3;

		// boolean acompanhado = true;

		// Se a variável acompanhado boolean estivesse declarada somente nesse bloco de
		// if
		// o código não compilaria a linha if (idade >= 18 || acompanhado) {
		// if (quantidadePessoas >= 2) {
		// boolean acompanhado = true;
		// } else {
		// boolean acompanhado = false;
		// }

		boolean acompanhado = true;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {

			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}

	}
}
