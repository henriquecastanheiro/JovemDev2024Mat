package desafios_primeira_semana;

import javax.swing.JOptionPane;

public class Abastecimento {

	public static void main(String[] args) {
		/*
		 * 4. Construa um programa para determinar se é mais vantajoso abastecer com
		 * álcool ou gasolina. O usuário irá informar o valor do litro do álcool e o
		 * valor do litro da gasolina. Para ser vantajoso abastecer com álcool, o valor
		 * deve ser 30% inferior ao da gasolina.
		 */
		double valorGasolina = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro da gasolina: "));
		double valorAlcool = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do álcool: "));
		if (valorAlcool <= (valorGasolina * 0.7)) {
			JOptionPane.showMessageDialog(null, "É mais vantajoso abastecer com álcool.");
		} else if (valorAlcool == valorGasolina) {
			JOptionPane.showMessageDialog(null, "O valores são iguais!");
		} else {
			JOptionPane.showMessageDialog(null,
					"É mais vantajoso abastacer com gasolina.");
		}
	}
}
