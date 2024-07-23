package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep25 {

	public static void main(String[] args) {
		int qtddAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
		double somaMedias = 0;
		// Loop para verficar quantidade de aluno
		for (int i = 0; i < qtddAluno; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ": ");
			int qtddProvas = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a quantidade de provas que " + nome + " fez: "));
			// Loop para somar as notas do aluno
			double somaNotas = 0;
			for (int n = 0; n < qtddProvas; n++) {
				double nota = Double.parseDouble(
						JOptionPane.showInputDialog("Digite a nota da prova " + (n + 1) + " de " + nome + ": "));
				// Adiciona a nota à soma das notas
				somaNotas += nota;
			}
			// Calcula a média do aluno
			double mediaAluno = somaNotas / qtddProvas;
			somaMedias += mediaAluno;
		}
		// Calcula a média geral da turma
		double mediaGeral = somaMedias / qtddAluno;
		JOptionPane.showMessageDialog(null, "A média geral da turma é: " + mediaGeral);
	}
}
