package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep19 {

	public static void main(String[] args) {
		/*
		 * 19) Faça um programa para ler o nome de (N) alunos. Considere que cada aluno
		 * fez uma quantidade (X) de provas, onde cada aluno poderá ter feito um número
		 * diferente de provas, isto é, o valor (X) pode ser diferente entre os alunos.
		 * Mostre para cada aluno a sua média.
		 */
		int qtddAlunos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de alunos?"));
		for (int i = 1; i <= qtddAlunos; i++) {
			String nome = JOptionPane.showInputDialog("Qual é o nome do aluno?");
			int qtddProvas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas " + nome + " fez?"));
			double somaNotas = 0;
			for (int j = 1; j <= qtddProvas; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova " + j + ":"));
				somaNotas += nota;
			}
			double media = somaNotas / qtddProvas;
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nMédia: " + media);
		}
	}
}
