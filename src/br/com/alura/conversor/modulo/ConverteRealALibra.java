package br.com.alura.conversor.modulo;

public class ConverteRealALibra extends Conversor {
	private double cotacao = 6.15;

	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}

