//o Editor de Vídeo é um funcionário. Logo, um editor de vídeo herda (extende) a classe funcionário.
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Bonificação Editor de Vídeo");
		return super.getBonificacao() + 150.0;
	}
}
