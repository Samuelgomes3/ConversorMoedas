package br.com.alura.conversor.modulo;

public abstract class Conversor {
	
	public double converte(String input) {
		double valor = Double.parseDouble(input);
		return valor;
	}
}
