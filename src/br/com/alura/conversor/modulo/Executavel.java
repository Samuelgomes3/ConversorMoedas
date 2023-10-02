package br.com.alura.conversor.modulo;

public class Executavel {
	
	public void rodando() {
		
		boolean continua = true;
		while(continua) {
			Gui gui = new Gui();
			String opcoes = gui.guiEscolhaMoeda();
			boolean validacao = true;
			
			while(validacao) {
				String input = gui.guiEscolhaValor();
				
				try {
					if(opcoes == "De Reais a Dolar") {
						Conversor dolar = new ConverteRealADolar();
						gui.guiValorConvertido(dolar.converte(input), " Dolares");
						validacao = false;
					}
					if(opcoes == "De Reais a Euros") {
						Conversor euro = new ConverteRealAEuro();
						gui.guiValorConvertido(euro.converte(input)," Euros");
						validacao = false;
					}									
					if(opcoes == "De Reais a Libras") {
						Conversor libra = new ConverteRealALibra();
						gui.guiValorConvertido(libra.converte(input)," Libras");
						validacao = false;
					}	
				
					if(opcoes == "De Reais a Yenes") {
						Conversor yene = new ConverteRealAYenes();
						gui.guiValorConvertido(yene.converte(input), " Yenes");
						validacao = false;
					}
					if(opcoes == "De Reais a Won Coreano") {						
						Conversor won = new ConverteRealAWon();
						gui.guiValorConvertido(won.converte(input), " Wons");
						validacao = false;
					}
					if(opcoes == "De Dolares a Reais") {
						Conversor real = new ConverteDolarAReal();
						gui.guiValorConvertido(real.converte(input)," Reais");
						validacao = false;
					}					
					if(opcoes == "De Euros a Reais") {
						Conversor real = new ConverteEuroAReal();
						gui.guiValorConvertido(real.converte(input)," Reais");
						validacao = false;
					}					
					if(opcoes == "De Libras a Reais") {
						Conversor real = new ConverteLibraAReal();
						gui.guiValorConvertido(real.converte(input)," Reais");
						validacao = false;
					}
						
				} catch (NumberFormatException e) {
					gui.erro();
				}
			}
	
			int continuarEncerrar = gui.comecarNovamente();
			if(continuarEncerrar == 1) {
				gui.mostraFinalizado();
				continua = false;
			} if(continuarEncerrar == 2) {
				gui.mostraConcluido();
				continua = false;
			}
		}
	}
}

