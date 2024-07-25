package matrizes_exercicios;

import javax.swing.JOptionPane;

public class ExercicioMatrizes1 {

	public static void main(String[] args) {
		/*
		 * Uma turma com N alunos realizou X provas. Faça um programa que cadastre os
		 * alunos e as notas obtidas em cada prova, armazenando essas informações em
		 * matrizes e vetores conforme a melhor arquitetura. Apenas os nomes dos alunos
		 * e as notas de cada prova devem ser armazenados durante o cadastro, sem
		 * acumular outras informações.
		 * 
		 * O programa deve permitir as seguintes funcionalidades:
		 * 
		 * Cadastrar Alunos e Notas: Permitir o cadastro de alunos e suas respectivas
		 * notas nas provas. Listar Alunos: Exibir uma lista de todos os alunos com seus
		 * nomes, médias das notas e situação (aprovado, reprovado ou em recuperação).
		 * Buscar Aluno por Nome: Permitir a busca de um aluno pelo nome e exibir sua
		 * média e situação (aprovado, reprovado ou em recuperação). Listar Alunos
		 * Aprovados: Mostrar os nomes de todos os alunos aprovados. Listar Alunos em
		 * Recuperação: Mostrar os nomes de todos os alunos que estão em recuperação.
		 * Listar Alunos Reprovados: Mostrar os nomes de todos os alunos reprovados.
		 * 
		 * Considere: Aprovado média >=7 Reprovado média <3 Recuperação média entre 3 e
		 * 7
		 */
		String menu = "Menu de Alunos\n\n" 
				+ "1 - Cadastrar Alunos e Notas\n" 
				+ "2 - Listar Alunos\n"
				+ "3 - Buscar Aluno por Nome\n" 
				+ "4 - Listar Alunos Aprovados\n" 
				+ "5 - Listar Alunos em Recuperação\n"
				+ "6 - Listar Alunos Reprovados:\n"
				+ "9 - Sair:\n";

		int qtddProvas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de provas neste semestre"));
		int qtddAlunos = 0;
		int opcao = 0;

		String[] nomeAlunos = new String[100];
		double[][] notas = new double[100][qtddProvas];

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				if (qtddAlunos < 100) {
					qtddAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
					for (int i = 0; i < qtddAlunos; i++) {
						nomeAlunos[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "ª aluno:")
								.toUpperCase();
						for (int j = 0; j < qtddProvas; j++)
							notas[i][j] = Double.parseDouble(JOptionPane
									.showInputDialog("Digite a " + (j + 1) + "ª nota de " + nomeAlunos[i] + ":"));
					}
				}
				break;
			case 2:

				String listaAlunos = "Lista de Alunos:\n";
				for (int i = 0; i < qtddAlunos; i++) {
					double somaNotas = 0;
					for (int j = 0; j < qtddProvas; j++) {
						somaNotas += notas[i][j];
					}
					double media = somaNotas / qtddProvas;
					String situacao;
					if (media >= 7) {
						situacao = "aprovado";
					} else if (media < 3) {
						situacao = "reprovado";
					} else {
						situacao = "recuperacao";
					}
					listaAlunos += nomeAlunos[i] + " - Média: " + media + " - Situação: " + situacao + "\n";
				}
				JOptionPane.showMessageDialog(null, listaAlunos);
				break;
			case 3:
				String buscarNome = JOptionPane.showInputDialog("Digite o nome do aluno que deseja encontrar: ")
						.toUpperCase();
				for (int i = 0; i < qtddAlunos; i++)
					if (nomeAlunos[i].equals(buscarNome)) {
						double somaNotas = 0;
						for (int j = 0; j < qtddProvas; j++) {
							somaNotas += notas[i][j];
						}
						double media = somaNotas / qtddProvas;
						String situacao;
						if (media >= 7) {
							situacao = "aprovado";
						} else if (media < 3) {
							situacao = "reprovado";
						} else {
							situacao = "em recuperacao";
						}
						JOptionPane.showMessageDialog(null,
								nomeAlunos[i] + " - Média: " + media + " - Situação: " + situacao);
						break;
					} else {
						JOptionPane.showMessageDialog(null, " Aluno não encontrado!");
					}
				break;
			case 4:
				String alunosAprovados = "";
				for (int i = 0; i < qtddAlunos; i++) {
					double somaNotas = 0;
					for (int j = 0; j < qtddProvas; j++) {
						somaNotas += notas[i][j];
					}
					double media = somaNotas / qtddProvas;
					if (media >= 7) {
						alunosAprovados += nomeAlunos[i] + " - Média: " + media + "\n";
					}
				}
				if (alunosAprovados.equals("Alunos Aprovados:\n")) {
					JOptionPane.showMessageDialog(null, "Nenhum aluno aprovado.");
				}
				JOptionPane.showMessageDialog(null, alunosAprovados);
				break;
			case 5:
				String alunosRecuperacao = "Alunos em Recuperação:\n";
				for (int i = 0; i < qtddAlunos; i++) {
					double somaNotas = 0;
					for (int j = 0; j < qtddProvas; j++) {
						somaNotas += notas[i][j];
					}
					double media = somaNotas / qtddProvas;
					if (media >= 3 && media < 7) {
						alunosRecuperacao += nomeAlunos[i] + " - Média: " + media + "\n";
					}
				}
				if (alunosRecuperacao.equals("Alunos em Recuperação:\n")) {
					alunosRecuperacao = "Nenhum aluno em recuperação.";
				}
				JOptionPane.showMessageDialog(null, alunosRecuperacao);
				break;
			case 6:
				String alunosReprovados = "";
				for (int i = 0; i < qtddAlunos; i++) {
					double somaNotas = 0;
					for (int j = 0; j < qtddProvas; j++) {
						somaNotas += notas[i][j];
					}
					double media = somaNotas / qtddProvas;
					if (media < 3) {
						alunosReprovados += nomeAlunos[i] + " - Média: " + media + "\n";
					}
				}
				if (alunosReprovados.equals("Alunos Reprovados: \n")) {
					alunosReprovados = "Nenhum aluno reprovado.";
				}
				JOptionPane.showMessageDialog(null, alunosReprovados);
				break;
			default:
				break;
			}
		} while (opcao != 9);

	}
}
