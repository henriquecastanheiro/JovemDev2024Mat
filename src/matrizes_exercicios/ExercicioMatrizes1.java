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
		int opcao = 0;
		int qtddAlunos = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				String msg ="";
				if(qtddAlunos <200) {
					qtddAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
					double[] notas = new double[qtddProvas];
					String[] nomeAlunos = new String[qtddAlunos];
					double[][] tabela = new double [qtddAlunos][qtddProvas];
					for (int i = 0; i < tabela.length; i++) {
						nomeAlunos[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "ª aluno:");
						for (int j = 0; j < tabela[i].length; j++)
							notas[i] = Double.parseDouble(JOptionPane
								.showInputDialog("Digite a " + "ª nota de " + nomeAlunos[i] + ":"));
						msg+="\t"+tabela[i];		
					System.out.println(msg);
				}
					
				}
				break;
			case 2:
				for (int i = 0; i < qtddAlunos; i++);
				

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			default:
				break;
			}
		} while (opcao != 9);

	}
}
