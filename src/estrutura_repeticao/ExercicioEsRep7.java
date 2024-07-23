package estrutura_repeticao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioEsRep7 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para calcular e mostrar na tela o resultado da seguinte
		 * fórmula: Considere que o valor 'N' será digitado pelo usuário.
		 */
		int n;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
			if (n <= 0) {
				JOptionPane.showMessageDialog(null, "O valor de N precisa ser positivo");
			}
		} while (n <= 0); {
			double fracao = 0.0;
			double valorTotal = 0.0;
			for (int i = 1; i <= n; i++) {
				fracao += 1.0 / i;
				valorTotal += fracao ;
				JOptionPane.showMessageDialog(null, String.format("O resultado da fração é: %.2f", fracao));
			}
			JOptionPane.showMessageDialog(null, String.format("O valor total da fração é: %.2f", valorTotal));
		}
	}
}

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Digite o valor de N: ");
//		int n = scanner.nextInt();
//		double fracao = 0.0;
//		for (int i = 1; i <= n; i++) {
//			fracao += 1.0 / i;
//			System.out.printf("O resultado da fração é: %.2f\n", fracao);
//		}
//		System.out.printf("O valor total da fração é: %.2f\n", fracao);
