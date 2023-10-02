package br.com.alura.conversor.modulo;

public class ConverteRealAWon extends Conversor {
	private double cotacao = 0.0037;

	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}

