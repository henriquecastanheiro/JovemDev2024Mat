package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep10 {

	public static void main(String[] args) {
		/*
		 * 10) Faça um programa para ler nome e sexo dos N alunos de uma sala de aula.
		 * Após a leitura, mostre na tela quantos alunos são do sexo masculino, e
		 * quantos são do sexo feminino.
		 */
		int qtddAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
		int f = 0;
		int m = 0;
		for (int i = 0; i < qtddAluno; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ": ");
			String sexo = JOptionPane.showInputDialog(nome + " informe o seu sexo: \n\nM = Masculino\nF = Feminino")
					.toUpperCase();
			if (sexo.equals("M")) {
				m += 1;
			} else if (sexo.equals("F")) {
				f += 1;
			} else {
				JOptionPane.showMessageDialog(null,
						"Sexo inválido. Por favor, digite M para Masculino ou F para Feminino.");
				i--;
			}
		}
		JOptionPane.showMessageDialog(null,
				"Número de alunos do sexo masculino: " + m + "\nNúmero de alunos do sexo feminino: " + f);
	}
}
