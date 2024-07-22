package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExemploRepita {

	public static void main(String[] args) {
		double vlOrcamento = Double.parseDouble(JOptionPane.showInputDialog("Qual valor você tem para gastar?"));
		double vlGasto = 200;
		do {
			vlGasto += Double.parseDouble(JOptionPane.showInputDialog(null, "Valor que gastou?"));
		} while (vlGasto <= vlOrcamento);
		JOptionPane.showMessageDialog(null, "Você não pode gastar mais que o valor do orçamento.");
	}
}
