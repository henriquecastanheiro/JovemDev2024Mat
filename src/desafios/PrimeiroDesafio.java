package desafios;

import javax.swing.JOptionPane;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: "));

		JOptionPane.showMessageDialog(null,
				"O valor de a=" + a + ", de b=" + c + ", de c=" + c + "\nO resultado desta equação é: \nr1= "
						+ (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c / 2 * a)) + "" + "\nr2="
						+ (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c / 2 * a)));
	}
}
