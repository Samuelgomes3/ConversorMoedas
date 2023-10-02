package br.com.alura.conversor.modulo;

public class ConverteLibraAReal extends Conversor {
	private double cotacao = 0.16;

	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}


