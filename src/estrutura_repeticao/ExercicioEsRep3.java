package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep3 {

	public static void main(String[] args) {
		int a, b;
		do {
			a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
			if (a <= 0) {
				JOptionPane.showMessageDialog(null, "O valor de A precisa ser positivo.");
			}
		} while (a <= 0);
		do {
			b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
			if (b <= 0) {
				JOptionPane.showMessageDialog(null, "O valor de B precisa ser positivo.");
			}
		} while (b <= 0);
		int resultado = 1;
		for (int i = 1; i <= b; i++) {
			resultado *= a;
		}
		JOptionPane.showMessageDialog(null, "O resultado de " + a + " elevado a " + b + " é: " + resultado);
	}
}
