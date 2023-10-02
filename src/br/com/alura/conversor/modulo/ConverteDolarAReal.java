package br.com.alura.conversor.modulo;

public class ConverteDolarAReal extends Conversor {
	private double cotacao = 0.2;

	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}

