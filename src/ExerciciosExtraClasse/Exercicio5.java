package ExerciciosExtraClasse;

import javax.swing.JOptionPane;

public class Exercicio5 {
	/*
	 * Desenvolver um programa em Java que leia o nome e o salário de uma quantidade
	 * especificada de funcionários, calcule o novo salário de cada funcionário com
	 * base em faixas de reajuste salarial e exiba o nome e o novo salário de cada
	 * funcionário.
	 */

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de funcionários:"));

		String[] nomes = new String[n];
		double[] salarios = new double[n];
		double[] salariosNovos = new double[n];

		for (int i = 0; i < n; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome do funcionário " + (i + 1) + ":");
			salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Salário do funcionário " + (i + 1) + ":"));
		}
		for (int i = 0; i < n; i++) {
			if (salarios[i] <= 400) {
				salariosNovos[i] = salarios[i] * 1.25;
			} else if (salarios[i] <= 600) {
				salariosNovos[i] = salarios[i] * 1.20;
			} else if (salarios[i] <= 800) {
				salariosNovos[i] = salarios[i] * 1.15;
			} else {
				salariosNovos[i] = salarios[i] * 1.10;
			}
		}
		for (int i = 0; i < n; i++) {
			JOptionPane.showMessageDialog(null,
					"Funcionário: " + nomes[i] + ", Salário novo: R$" + String.format("%.2f", salariosNovos[i]));
		}
	}
}
