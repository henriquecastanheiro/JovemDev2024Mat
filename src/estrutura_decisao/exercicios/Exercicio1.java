package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		// 1. Escreva um programa que lê três números inteiros e mostre o maior deles
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));

		if (n1 == n2 && n1 == n3) {
			JOptionPane.showMessageDialog(null, "Todos os números são iguais: " + n1);
		} else if (n1 == n2 && n1 > n3) {
			JOptionPane.showMessageDialog(null, "O primeiro e o segundo números são os maiores: " + n1);
		} else if (n1 == n3 && n1 > n2) {
			JOptionPane.showMessageDialog(null, "O primeiro e o terceiro números são os maiores: " + n1);
		} else if (n2 == n3 && n2 > n1) {
			JOptionPane.showMessageDialog(null, "O segundo e o terceiro números são os maiores: " + n2);
		} else if (n1 >= n2 && n1 >= n3) {
			JOptionPane.showMessageDialog(null, "O primeiro número é o maior: " + n1);
		} else if (n2 >= n1 && n2 >= n3) {
			JOptionPane.showMessageDialog(null, "O segundo número é o maior: " + n2);
		} else if (n3 >= n1 && n3 >= n2) {
			JOptionPane.showMessageDialog(null, "O terceiro número é o maior: " + n3);
		}
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar este código!");
	}
}
