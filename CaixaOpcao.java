import java.util.prefs.BackingStoreException;

import javax.swing.JOptionPane;

public class CaixaOpcao {
	
		public static void main(String[] args) {
		
		CaixaFinalizado cancelaprograma = new CaixaFinalizado();
		CaixaContinuar continuacao = new CaixaContinuar();
		
		double valorDolar = 4.84;
		double valorEuro = 5.27;
		double valorLibras = 6.15;
		double valorIene = 0.034;
		double valorWon = 0.0037;
		int resposta = 0;
		
		
		Object[] inicioPrograma = { "Conversor de Moeda", "Conversor de Temperatura", "Conversor de KM por Litro"};

		Object selecionarPrograma = JOptionPane.showInputDialog(null, 
				"Escolha uma opção", "Menu", 
				JOptionPane.INFORMATION_MESSAGE, null, 
				inicioPrograma, inicioPrograma[0]);
		
		if(selecionarPrograma == "Conversor de Moeda") {
			
			}else{
			cancelaprograma.finalizado();
			return;
			}	
		
			String inserindoValores = JOptionPane.showInputDialog("Insira um valor");
			if(inserindoValores == null) {
				JOptionPane jOptionPane = new JOptionPane();
				jOptionPane.setMessage("Valor indefinido, tentar novamente");
				double valor = Double.parseDouble(inserindoValores);
				return;
			} else {
				
			}
			
								
			Object[] escolhamoedas = { 
					"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes", "De Reais a Won Coreano", 
					"De Dólares a Reais", "De Euros a Reais", "De Libras a Reais"};
			
			Object giromoedas = JOptionPane.showInputDialog(null, 
		             "Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas", 
		             JOptionPane.INFORMATION_MESSAGE, null, 
		             escolhamoedas, escolhamoedas[0]);
					
			
			if(giromoedas == "De Reais a Dólares") {
				JOptionPane.showMessageDialog(null, "O valor convertido é $ " + valor / valorDolar);	
			} else if(giromoedas == "De Reais a Euros") {
				JOptionPane.showMessageDialog(null, "O valor convertido é € " + valor / valorEuro);
				
			} else if(giromoedas == "De Reais a Libras") {
				JOptionPane.showMessageDialog(null, "O valor convertido é £ " + valor / valorLibras);
				
			} else if(giromoedas == "De Reais a Yenes") {
				JOptionPane.showMessageDialog(null, "O valor convertido é ¥ " + valor / valorIene);
				
			} else if(giromoedas == "De Reais a Won Coreano"){
				JOptionPane.showMessageDialog(null, "O valor convertido é ₩ " + valor / valorWon);
				
			} else if(giromoedas == "De Dólares a Reais") {
				JOptionPane.showMessageDialog(null, "O valor convertido é R$ " + valor * valorDolar);
				
			} else if(giromoedas == "De Euros a Reais") {
				JOptionPane.showMessageDialog(null, "O valor convertido é R$ " + valor * valorEuro);
				
			} else if(giromoedas == "De Libras a Reais") {
				JOptionPane.showMessageDialog(null, "O valor convertido é R$ " + valor * valorLibras);
				
			} else {
				cancelaprograma.finalizado();
			}
		
			resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta ao Usuário", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(resposta == JOptionPane.YES_OPTION) {
				
			}
			else if(resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CANCEL_OPTION) {
				cancelaprograma.finalizado();
				System.exit(0);
			}
		
		}	
			
}
		 
		
