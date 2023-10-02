package br.com.alura.conversor.modulo;

public class ConverteRealAYenes extends Conversor {
	private double cotacao = 0.034;

	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}

