
package br.com.bytebank.banco.modelo;

/**
 * 
 * SaldoInsuficienteException é uma exceção para identificar que não 
 * há dinheiro suficiente para efetuar o saque.
 * 
 * @author alex
 * @version 1.0.0
 */
public class SaldoInsuficienteException extends Exception{ //checked

    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}