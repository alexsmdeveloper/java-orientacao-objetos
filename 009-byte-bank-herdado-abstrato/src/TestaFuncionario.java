
public class TestaFuncionario {

	public static void main(String[] args) {
		
		//Funcionario f1 = new Funcionario(); //não é possível atualizar, classe abstrata!
		Gerente f1 = new Gerente();
		f1.setNome("Alex Matos");
		f1.setCpf("1234567890");
		f1.setSalario(10000);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());

	}

}
