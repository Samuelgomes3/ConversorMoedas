package br.com.alura.conversor.modulo;

public class ConverteRealAEuro extends Conversor {
	private double cotacao = 5.33;

	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}
