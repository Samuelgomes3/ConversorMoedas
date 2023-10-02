package br.com.alura.conversor.modulo;

public class ConverteRealADolar extends Conversor {
	private double cotacao = 5.04;
	
	public double converte(String input) {

		return (super.converte(input))/cotacao;
	}
}

