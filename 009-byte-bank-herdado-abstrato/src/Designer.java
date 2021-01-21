//o Editor de Vídeo é um funcionário. Logo, um editor de vídeo herda (extende) a classe funcionário.
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Bonificação Designer");
		return 200.0;
	}
}
