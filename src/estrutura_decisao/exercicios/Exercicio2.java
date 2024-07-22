package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		// 2. Escreva um programa que lê três números inteiros e os mostre em ordem
		// crescente.
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int menor, maior, meio;
		// Define o número maior:
		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			maior = n2;
		} else {
			maior = n3;
		}
		// Define o número menor:
		if (n1 <= n2 && n1 <= n3) {
			menor = n1;
		} else if (n2 <= n1 && n2 <= n3) {
			menor = n2;
		} else {
			menor = n3;
		}
		// Define o número do meio:
		if (n1 >= menor && n1 <= maior) {
			meio = n1;
		} else if (n2 >= menor && n2 <= maior) {
			meio = n2;
		} else {
			meio = n3;
		}
		JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + "\n" + menor + ", " + meio + ", " + maior);
		JOptionPane.showMessageDialog(null, "Obrigado por utilizar este código!");
	}
}
