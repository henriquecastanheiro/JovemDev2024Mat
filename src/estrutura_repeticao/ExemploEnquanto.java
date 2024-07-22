package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExemploEnquanto {

	public static void main(String[] args) {
		double vlOrcamento = Double.parseDouble(JOptionPane.showInputDialog("Qual valor você tem para gastar?"));
		double vlGasto = 0;
		while (vlGasto <= vlOrcamento) {
			vlGasto += Double.parseDouble(JOptionPane.showInputDialog(null, "Valor que gastou?"));
		}
		JOptionPane.showMessageDialog(null, "Você não pode gastar mais que o valor do orçamento.");
	}
}
