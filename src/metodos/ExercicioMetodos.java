package metodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExercicioMetodos {

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
			 * notas nas provas. 
			 * Listar Alunos: Exibir uma lista de todos os alunos com seus
			 * nomes, médias das notas e situação (aprovado, reprovado ou em recuperação).
			 * Buscar Aluno por Nome: Permitir a busca de um aluno pelo nome e exibir sua 
			 * média e situação (aprovado, reprovado ou em recuperação). 
			 * Listar Alunos Aprovados: Mostrar os nomes de todos os alunos aprovados. 
			 * Listar Alunos em Recuperação: Mostrar os nomes de todos os alunos que estão em recuperação.
			 * Listar Alunos Reprovados: Mostrar os nomes de todos os alunos reprovados.
			 * 
			 * Considere: 
			 * Aprovado média >=7 
			 * Reprovado média <3 
			 * Recuperação média entre 3 e7
			 */
		int opcao = 0;
			ArrayList<Aluno> alunos = new ArrayList<Aluno>();
			do {
				switch (key) {
				case value: {
					
					yield type;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				}
			}
			
}
		public static int menu() {
			String m = "Menu de Alunos\n\n" 
					+ "1 - Cadastrar Alunos e Notas\n" 
					+ "2 - Listar Alunos\n"
					+ "3 - Buscar Aluno por Nome\n" 
					+ "4 - Listar Alunos Aprovados\n" 
					+ "5 - Listar Alunos em Recuperação\n"
					+ "6 - Listar Alunos Reprovados:\n"
					+ "0 - Sair:\n";
			int op = Integer.parseInt(JOptionPane.showInputDialog(m));
			// Criar uma validação;
			if(op < 0 || op >6)
				return menu();
			return op;
		}
		public static void cadastraAlunos(ArrayList<Aluno> Alunos) {
			Aluno x = new Aluno();
			x.nome = JOptionPane.showInputDialog("Informe o nome do aluno: "  );
			double nota = 0;
		do {
			int cont = 0;
			nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (cont + 1 ) +"ª nota: \nOu -1 - Para sair"));
			if nota
			cont++;
			}while(nota!= -1);
		
		}
	
}

