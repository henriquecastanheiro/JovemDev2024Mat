package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep6 {

	public static void main(String[] args) {
		/*
		 * 6) Faça um programa para fazer a leitura de N nomes e idades de pessoas, e
		 * após, mostrar: a) O somatório de todas as idades. b) A média das idades.
		 */
		// Lê a quantidade de nomes
		int qtddPessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas: "));
		double somaIdades = 0;
		// Loop para ler os nomes e idades de cada pessoa
		for (int i = 0; i < qtddPessoas; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ": ");
			double idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade de " + nome + ": "));
			// Adiciona a idade à soma total das idades
			somaIdades += idade;
		}
		double mediaIdades = somaIdades / qtddPessoas;
		// Exibe o somatório e a média das idades
		JOptionPane.showMessageDialog(null, "O somatório das idades é: " + somaIdades + "\nA média das idades é: " + mediaIdades);
	}
}
