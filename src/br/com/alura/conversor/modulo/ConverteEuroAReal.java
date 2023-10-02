package br.com.alura.conversor.modulo;

public class ConverteEuroAReal extends Conversor {
	private double cotacao = 0.19;

	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}

