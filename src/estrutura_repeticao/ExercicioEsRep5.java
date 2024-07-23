package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep5 {

	public static void main(String[] args) {
		/*
		 * 5) Faça um programa para somar e mostrar na tela o resultado da seguinte
		 * expressão 1-2+3-4+5-6+7-8+9-10+...100.
		 */
		int resultado = 0;
		for (int i = 1; i <= 100; i++) {
			// Se par:
			if (i % 2 == 0) {
				resultado -= i;
			// Se ímpar:
			} else { 
				resultado += i;
			} System.out.println(resultado + " ");
		} JOptionPane.showMessageDialog(null, "O resultado da expressão é: " + resultado);
	}
}
