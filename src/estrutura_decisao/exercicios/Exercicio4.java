package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Escreva um programa que, dado o comprimento de três segmentos de reta,
		 * determine se eles podem formar um triângulo e, em caso positivo, imprime se o
		 * triângulo é equilátero, isósceles ou escaleno.
		 */

		double reta1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira reta: "));
		double reta2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda reta: "));
		double reta3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira reta: "));

		if ((reta1 + reta2 > reta3) && (reta1 + reta3 > reta2) && (reta3 + reta2 > reta1)) {
			if (reta1 == reta2 && reta2 == reta3) {
				JOptionPane.showMessageDialog(null, "É um Triângulo Equilátero!");
			} else if (reta1 == reta2 || reta1 == reta3 || reta2 == reta3) {
				JOptionPane.showMessageDialog(null, "É um Triângulo Isósceles!");
			} else {
				JOptionPane.showMessageDialog(null, "É um Triângulo Escaleno!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é um Triângulo!");
		}
	}
}
