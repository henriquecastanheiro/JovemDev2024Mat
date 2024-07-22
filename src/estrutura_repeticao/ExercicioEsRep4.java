package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep4 {

	public static void main(String[] args) {
		/*
		 * 4) Peça para o usuário digitar um número inteiro positivo qualquer, digamos
		 * N. Após calcule N!(Fatorial).
		 */
		int n;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
			if (n <= 0) {
				JOptionPane.showMessageDialog(null, "O valor de N precisa ser positivo");
			}
		} while (n <= 0);
		int fatorial = 1;
		for (int i = 1; i < n + 1; i++) {
			fatorial *= i;
		}
		JOptionPane.showMessageDialog(null, fatorial);
	}
}
