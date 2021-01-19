
public class TestaEncapsulamento {
	
	public static void main(String[] args) {
		
		Conta contaDoAlex = new Conta(120, 19485);
		contaDoAlex.deposita(1000);
		System.out.println("Saldo=>" + contaDoAlex.getSaldo());
		
		Cliente clienteAlex = new Cliente();
		clienteAlex.setNome("Alex Matos");
		contaDoAlex.setTitular(clienteAlex); //setter por referência
		
		System.out.println("Acesso pelo cliente=>" + clienteAlex.getNome());
		System.out.println("Acesso pela conta=>" + contaDoAlex.getTitular().getNome());
		
		//modificando através da conta		
		contaDoAlex.getTitular().setProfissao("Dev Java");
		
		System.out.println("Acesso pelo cliente=>" + clienteAlex.getProfissao());
		System.out.println("Acesso pela conta=>" + contaDoAlex.getTitular().getProfissao());
		
		//testando referência
		Cliente novaVariavelCliente = contaDoAlex.getTitular();
		System.out.println("Nova variável=>" + novaVariavelCliente.getProfissao());
		
		System.out.println();
		System.out.println(clienteAlex);
		System.out.println(contaDoAlex.getTitular());
		System.out.println(novaVariavelCliente);
		
		
	}
	
}
