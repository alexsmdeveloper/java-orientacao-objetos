
public class TesteConexao {

	public static void main(String[] args) {

		System.out.println("inicio main...");
		System.out.println();
		System.out.println("Try with resources");
		System.out.println();
		
		//Para esse recurso é necessário implementar na classe Conexao
		//a interface AutoCloseable
		//a conexão automaticamente sem o bloco finally! (try with resources ;) )
		try (Conexao c = new Conexao()){
			c.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Erro de conexao>" + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Abaixo código legado!");
		System.out.println();
				
		
		Conexao con = null;

		try {
			con = new Conexao();
			con.leDados();
			con.close();
		} catch (IllegalStateException e) {
			System.out.println("Erro de conexao>" + e.getMessage());
			e.printStackTrace();
		} finally {
			con.close();
		}

		System.out.println("fim main.");
	}

}
