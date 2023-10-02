package br.com.alura.conversor.modulo;

import javax.swing.JOptionPane;

public class Gui {

	public String guiEscolhaMoeda() {
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opcao", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"De Reais a Dolar", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes", "De Reais a Won Coreano", "De Dolares a Reais", "De Euros a Reais", "De Libras a Reais"}, "Escolha").toString();
		return opcoes;
	}
	
	public String guiEscolhaValor() {
		String input = JOptionPane.showInputDialog("Insira um valor:");
		return input;
	}

	public void guiValorConvertido(double valor, String moeda) {
		double valorArrendondado = (double) Math.round(valor * 100d) / 100;
    	JOptionPane.showMessageDialog(null, "Você tem $ " + valorArrendondado + moeda);
	}

	public int comecarNovamente() {
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Menu", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(opcao);
		return opcao;
	}
	
	public void mostraFinalizado() {
		JOptionPane.showMessageDialog(null, "Programa finalizado"); 
	}
	public void mostraConcluido() {
		JOptionPane.showMessageDialog(null, "Programa concluido"); 		
	}

	public void erro() {
    	JOptionPane.showMessageDialog(null, "Digite apenas numeros");
	}


}
