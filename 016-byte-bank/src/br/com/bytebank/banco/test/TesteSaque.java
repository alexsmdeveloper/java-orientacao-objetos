package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

/**
 * Essa classe tem  por objetivo demonstrar a utilização da minha própria Exception
 * {@link SaldoInsuficienteException}, lançada através do método saca() da super
 * Classe {@link Conta} e também do método saca() sobrescrito na classe filha {@link ContaCorrente}.
 * 
 * @author Alex
 *
 */
public class TesteSaque {

	//java.lang.String
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
        //java.lang.System
        System.out.println(conta.getSaldo());
       
	}

}
