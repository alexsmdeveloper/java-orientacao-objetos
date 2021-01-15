
public class TestaMes {

	public static void main(String[] args) {

		int mes = 12;

		switch (mes) {
		case 1:
			System.out.println("Janeiro");			
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			System.out.println("Comemora-se o Natal de JESUS!");
			break;
		default:
			System.out.println("Mês inválido!");
			break;//opcional
		}
		
		System.out.println();
		System.out.println("Testando o switch case com variável do tipo String");
		String testaString = "teste1";
		
		switch (testaString) {
		case "teste1":
			System.out.println("case teste 1");
			break;
		case "teste2":
			System.out.println("case teste 2");
			break;
		case "teste3":
			System.out.println("case teste 3");
			break;
		default:
			System.out.println("Opção inválida para o teste!");
			//break;//opcional!!!!
		}

	}

}
