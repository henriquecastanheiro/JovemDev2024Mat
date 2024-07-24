package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep14 {

	public static void main(String[] args) {
		/*
		 * 14) Faça um programa para ler o nome e a média de N alunos. Após a leitura,
		 * mostre na tela o nome e média do aluno com a maior média. Considere que as
		 * médias sejam todas diferentes entre si.
		 */
		int qtddAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
		String alunoMaiorMedia = "";
		double maiorMedia = 0;
		for (int i = 0; i < qtddAlunos; i++) {
			String nomes = JOptionPane.showInputDialog("Digite o nome do aluno" + (i + 1) + ":");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do " + nomes + ":"));
			if (media > maiorMedia) {
				alunoMaiorMedia = nomes;
				maiorMedia = media;
			}
		}
		JOptionPane.showMessageDialog(null, "Aluno :" + alunoMaiorMedia + "\nMaior média:" + maiorMedia);
	}
}
