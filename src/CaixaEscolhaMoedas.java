import javax.swing.JOptionPane;

public class CaixaEscolhaMoedas {
	
	@SuppressWarnings("unused")
	public void moedas() {
		Object[] possibleValues = { 
				"De Reais a Dólares",
				"De Reais a Euros", 
				"De Reais a Libras", 
				"De Reais a Yenes", 
				"De reais a Won Coreano",
				"De Dólares a Reais",
				"De Euros a Reais",
				"De Libras a Reais"};
		
		Object selectedValue = JOptionPane.showInputDialog(null, 
	             "Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas", 
	             JOptionPane.INFORMATION_MESSAGE, null, 
	             possibleValues, possibleValues[0]);
	}

}
