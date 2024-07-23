package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep8 {

	public static void main(String[] args) {

		/*
		 * 8) Uma cliente possui um determinado valor X, como saldo de conta corrente em
		 * um banco. Durante o mês, são realizadas operações de depósitos e retiradas.
		 * Faça um programa para ler as N operações bancárias realizadas durante o mês,
		 * e ao final mostrar na tela o saldo que ficou na conta bancárias da loja.
		 * Considere que uma operação bancária corresponde a leitura do valor
		 * movimentado e do tipo da operação: (D)epósito ou (R)etirada.
		 */
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));
		int numOperacoes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de operações bancárias:"));
		int i = 0;
		do {
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da operação:"));
			// Solicita ao usuário para digitar o tipo da operação
			String tipo = JOptionPane.showInputDialog("Digite o tipo da operação:\n\nD = depósito \nR = retirada:")
					.toUpperCase();// Para transformar a letra em maiusculo
			if (tipo.equals("D")) {
				saldo += valor;
			} else if (tipo.equals("R")) {
				saldo -= valor;
			} else {
				JOptionPane.showMessageDialog(null,
						"Tipo de operação inválido. Por favor, digite D para depósito ou R para retirada.");
			}
			i++; // Incrementa o contador se a operação for válida
		} while (i < numOperacoes);{
				JOptionPane.showMessageDialog(null, String.format("O saldo final na conta é: %.2f", saldo));
		}
	}
}
