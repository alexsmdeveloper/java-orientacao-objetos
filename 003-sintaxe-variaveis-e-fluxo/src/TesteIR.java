
public class TesteIR {

	public static void main(String[] args) {

		double salario = 5000;
		float aliquota = 0.0f;
		double deducaoMaxima = 0.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			aliquota = 7.5f;
			deducaoMaxima = 142;
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			aliquota = 15;
			deducaoMaxima = 350;
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			aliquota = 22.5f;
			deducaoMaxima = 636;
		}

		if (aliquota > 0 && deducaoMaxima > 0)

		{
			System.out.println("Aliquota IR: " + aliquota + "%");
			System.out.println("Dedução de até R$ " + deducaoMaxima);
		} else {
			System.out.println("Você está isento do IR.");
		}

	}

}
