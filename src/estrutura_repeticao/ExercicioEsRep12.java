package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep12 {

	public static void main(String[] args) {

		/*
		 * 12) Uma sala de aula possui N alunos, dos quais é conhecido: Nome, cidade
		 * onde mora e idade. Faça um programa que imprima: a) A quantidade de alunos
		 * que residem em TUBARÃO b) A quantidade de alunos que residem em JAGUARUNA
		 */
		int qtddAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
		int alunosJaguaruna = 0;
		int alunosTubarao = 0;
		int idadeMenor17 = 0;
		for (int i = 0; i < qtddAlunos; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ":");
			String cidade = JOptionPane.showInputDialog("Digite a cidade onde o " + nome + " mora:").toUpperCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Dgite a idade de " + nome + ":"));
			if (cidade.equals("JAGUARUNA")) {
				alunosJaguaruna++;
			} else if (cidade.equals("TUBARAO")) {
				alunosTubarao++;
			}
			if (idade <= 17 ) {
				idadeMenor17++;
			}
		}
		JOptionPane.showMessageDialog(null, "         Lista de Alunos\n\n" + "a) Alunos de Tubarão: "
				+ alunosTubarao + "\nb) Alunos de Jaguaruna: " + alunosJaguaruna + "\nc) Alunos com idade inferior à 17: " + idadeMenor17);
	}
}
