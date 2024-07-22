package estrutura_decisao;

import javax.swing.JOptionPane;

public class ExercicioTresNumerosInt {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
		
		if (n1 > n2 && n1 > n3) {
			JOptionPane.showMessageDialog(null, "O maior é: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			JOptionPane.showMessageDialog(null, "O maior é: " + n2);
		} else if (n3 > n1 && n3 > n2) {
			JOptionPane.showMessageDialog(null, "O maior é: " + n3);
		} else if (n1 == n2 && n1 == n3){
			JOptionPane.showMessageDialog(null, "Os numeros são iguais " + n1 + "," + n2 + "," + n3 + ".");
		}
		JOptionPane.showMessageDialog(null, "Adeus!");
	}
}
