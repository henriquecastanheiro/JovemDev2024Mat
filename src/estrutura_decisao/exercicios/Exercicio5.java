package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 5. Dada uma letra, mostre se essa letra é ou não uma vogal (pode considerar
		 * apenas letras minúsculas).
		 */
		char letra = JOptionPane.showInputDialog("Digite uma letra: ").toLowerCase().charAt(0);
		if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
			JOptionPane.showInternalMessageDialog(null, "A letra " + letra + " é uma vogal.");
		} else {
			JOptionPane.showInternalMessageDialog(null, "A letra " + letra + " não é uma vogal.");
		}
	}
}
