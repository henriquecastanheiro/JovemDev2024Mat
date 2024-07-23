package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep9 {

	public static void main(String[] args) {
		/*
		 * 9) Faça um programa onde o usuário deverá digitar o nome e a média de N
		 * alunos. Durante a leitura, verifique se o aluno foi “aprovado”, “reprovado”,
		 * ou em “recuperação”. Mostre na tela, uma mensagem apropriada, dependendo da
		 * situação do aluno. Considere que as situações possíveis para os alunos são:
		 * Aprovado (média >= 7.0); Recuperação (2.0 <= média < 7.0); Reprovado (média <
		 * 2.0).
		 */
		int qtddAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
		double somaMedias = 0;
		for (int i = 0; i < qtddAluno; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ": ");
			for (int n = 0; n < 1; n++) {
				double mediaAluno = Double
						.parseDouble(JOptionPane.showInputDialog("Digite a media de " + nome + ": "));
				somaMedias += mediaAluno;
				String situacao;
				if (mediaAluno >= 7.0) {
					situacao = "Aprovado";
				} else if (mediaAluno >= 2.0) {
					situacao = "em Recuperação";
				} else {
					situacao = "infelizmente Reprovado";
				}
				JOptionPane.showMessageDialog(null,
						"O aluno " + nome + " está " + situacao + " com média " + mediaAluno);
			}
		}
	}
}
