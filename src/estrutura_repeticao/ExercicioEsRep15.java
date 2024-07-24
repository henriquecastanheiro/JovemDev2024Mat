package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep15 {

	public static void main(String[] args) {

		/*
		 * 15) Faça um programa para ler o nome e a média de N alunos. Após a leitura,
		 * mostre na tela o nome e média do aluno com a menor média. Considere que as
		 * médias sejam todas diferentes entre si.
		 */
		int qtddAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de alunos: "));
		String alunoMenorMedia = "";
		double menorMedia = 10;
		for (int i = 0; i < qtddAlunos; i++) {
			String nomes = JOptionPane.showInputDialog("Digite o nome do aluno" + (i + 1) + ":");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media de " + nomes + ":"));
			if (media < menorMedia) {
				alunoMenorMedia = nomes;
				menorMedia = media;
			}
		}
		JOptionPane.showMessageDialog(null, "Aluno: " + alunoMenorMedia + "\nMenor média: " + menorMedia);
	}
}
