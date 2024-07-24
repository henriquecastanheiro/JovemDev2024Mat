package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep13 {

	public static void main(String[] args) {

		/*
		 * 13) Uma empresa possui N funcionários dos quais são conhecidos seus nomes e
		 * idades. Faça um programa que imprima o nome e a idade da pessoa mais idosa e
		 * a mais nova. Considere que não existem pessoas com idades iguais.
		 */
		int qtddFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários"));
		String nomeMaisVelho = "";
		int idadeMaisVelho = -999;
		String nomeMaisNovo = "";
		int idadeMaisNovo = 9999;
		for (int i = 0; i < qtddFuncionarios; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do funcionário " + (i + 1) + ":").toUpperCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome + ":"));
			if (idade > idadeMaisVelho) {
				idadeMaisVelho = idade;
				nomeMaisVelho = nome;
			}
			if (idade < idadeMaisNovo) {
				idadeMaisNovo = idade;
				nomeMaisNovo = nome;
			}
		}
		JOptionPane.showMessageDialog(null, "O funcionário mais velho é " + nomeMaisVelho + " com " + idadeMaisVelho
				+ " anos." + "\nO funcionário mais novo é " + nomeMaisNovo + " com " + idadeMaisNovo + " anos.");
	}
}
