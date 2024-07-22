package desafios;

import javax.swing.JOptionPane;

public class QuartoDesafio {

	public static void main(String[] args) {
		double valorLitroGasolina = Double
				.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro da gasolina: "));
		double valorLitroAlcool = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do alcool:"));

		if (valorLitroAlcool <= (valorLitroGasolina - (valorLitroGasolina * 0.3))) {
			JOptionPane.showMessageDialog(null,
					"O valor do litro do alcool está 30% a menos doque o valor do litro da gasolina.");
		} else if (valorLitroAlcool == valorLitroGasolina) {
			JOptionPane.showMessageDialog(null, "O valor do litro do alcool é o mesmo ao valor do litro da gasolina.");
		} else {
			JOptionPane.showMessageDialog(null,
					"O valor do litro da gasolina comparado ao valor do litro do alcool estão quase o mesmo.");
		}
	}
}
