package desafios_primeira_semana;

import javax.swing.JOptionPane;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		/*
		 * 1. Faça um programa que seja capaz de resolver uma equação do segundo grau.
		 * Para isso o usuário deverá informar os valores de: a,b e c e o programa
		 * retornar o valor de x.
		 */
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'a': "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'b': "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de 'c': "));
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "Não é uma equação do segundo grau.");
		} else {
			int delta = b * b - 4 * a * c;
			JOptionPane.showMessageDialog(null, "Valor de delta: " + delta);
			if (delta < 0) {
				JOptionPane.showMessageDialog(null, "A equação não possui resultado reais.");
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				JOptionPane.showMessageDialog(null, "Valores escolhidos de:\n a = " + a + "\nb = " + b + "\nc = " + c
						+ "\nO valor de x1 é: " + x1 + "\nO valor de x2 é: " + x2);
			}
		}
	}
}
