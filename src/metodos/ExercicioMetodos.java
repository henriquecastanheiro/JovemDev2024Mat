package metodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExercicioMetodos {
	/*
	 * Uma turma com N alunos realizou X provas. 
	 * Faça um programa que cadastre os alunos e as notas obtidas em cada prova, 
	 * armazenando essas informações em matrizes e vetores conforme a melhor arquitetura. 
	 * Apenas os nomes dos alunos e as notas de cada prova devem ser armazenados durante o cadastro, 
	 * sem acumular outras informações.
	 * 
	 * O programa deve permitir as seguintes funcionalidades:
	 * 
	 * Cadastrar Alunos e Notas: Permitir o cadastro de alunos e suas respectivas
	 * notas nas provas. 
	 * Listar Alunos: Exibir uma lista de todos os alunos com seus nomes, médias das notas e 
	 * situação (aprovado, reprovado ou em recuperação).
	 * Buscar Aluno por Nome: Permitir a busca de um aluno pelo nome e exibir sua
	 * média e situação (aprovado, reprovado ou em recuperação). 
	 * Listar Alunos Aprovados: Mostrar os nomes de todos os alunos aprovados. 
	 * Listar Alunos em Recuperação: Mostrar os nomes de todos os alunos que estão em recuperação.
	 * Listar Alunos Reprovados: Mostrar os nomes de todos os alunos reprovados.
	 * 
	 * Considere: 
	 * Aprovado média >=7 
	 * Reprovado média <3 
	 * Recuperação média entre 3 e 7
	 */
	static ArrayList<Aluno> alunos = new ArrayList<>();
	static int qtddProvas;

<<<<<<< HEAD
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
=======
	public static void main(String[] args) {
		String menu = "Menu de Alunos\n\n" + "1 - Cadastrar Alunos e Notas\n" + "2 - Listar Alunos\n"
				+ "3 - Buscar Aluno por Nome\n" + "4 - Listar Alunos Aprovados\n" + "5 - Listar Alunos em Recuperação\n"
				+ "6 - Listar Alunos Reprovados\n" + "9 - Sair\n";

		qtddProvas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de provas do semestre: "));

		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				cadastroAlunos(alunos);
				break;
			case 2:
				listarAlunos(alunos);
				break;
			case 3:
				buscarAlunoPorNome(alunos);
				break;
			case 4:
				listarAlunosPorSituacao(alunos, "APROVADO(A)");
				break;
			case 5:
				listarAlunosPorSituacao(alunos, "EM RECUPERAÇÃO");
				break;
			case 6:
				listarAlunosPorSituacao(alunos, "REPROVADO(A)");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Saindo do Program...");
				break;
			default:
			}
		} while (opcao != 9);
	}
	
//================================= CADASTRO DE ALUNOS ===================================================\\
	
	public static void cadastroAlunos(ArrayList<Aluno> alunos) {
		Aluno aluno = new Aluno();
		aluno.nome = JOptionPane.showInputDialog("Nome: ");

		for (int i = 0; i < qtddProvas; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova " + (i + 1) + ": "));
			aluno.notas.add(nota);
		}
		alunos.add(aluno);
	}
	
//==================================== CALCULAR A MÉDIA =========================================================\\
	
	public static double calcularMedia(ArrayList<Double> notas) {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.size();
	}
	
//===================================== DETERMINAR SITUAÇÃO ========================================================\\
	
	public static String determinarSituacao(double media) {
		if (media >= 7) {
			return "APROVADO(A)";
		} else if (media < 3) {
			return "REPROVADO(A)";
		} else {
			return "EM RECUPERAÇÃO";
		}
	}
	
//================================ LISTA DE ALUNOS =============================================================\\
	
	public static void listarAlunos(ArrayList<Aluno> alunos) {
		String resultado = "";
		for (Aluno aluno : alunos) {
			String nome = aluno.nome;
			double media = calcularMedia(aluno.notas);
			String situacao = determinarSituacao(media);
			resultado += "Nome: " + nome + ", Média: " + media + ", Situação: " + situacao + "\n";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
	
//================================= BUSCAR ALUNO POR NOME ============================================================\\
	
	public static void buscarAlunoPorNome(ArrayList<Aluno> alunos) {
		String nomeBusca = JOptionPane.showInputDialog("Digite o nome do aluno para busca: ");
		for (Aluno aluno : alunos) {
			if (aluno.nome.equalsIgnoreCase(nomeBusca)) {
				double media = calcularMedia(aluno.notas);
				String situacao = determinarSituacao(media);
				JOptionPane.showMessageDialog(null,
						"Nome: " + aluno.nome + ", Média: " + media + ", Situação: " + situacao);
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
	}
	
//================================= BUSCAR ALUNO POR SITUAÇÃO ===========================================================\\	
>>>>>>> 6489ef8e24fd6377e7c6dc61ab2c9bc7bf48bcfb

	public static void listarAlunosPorSituacao(ArrayList<Aluno> alunos, String situacaoDesejada) {
		String resultado = "";
		for (Aluno aluno : alunos) {
			double media = calcularMedia(aluno.notas);
			String situacao = determinarSituacao(media);
			if (situacao.equalsIgnoreCase(situacaoDesejada)) {
				resultado += "Nome: " + aluno.nome + ", Média: " + media + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
