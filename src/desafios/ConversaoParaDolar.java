package pacote_desafio;

import javax.swing.JOptionPane;

public class ConversaoParaDolar {

	public static void main(String[] args) {
		/*
		 * 2. Faça um programa em que o usuário informe um valor em real (R$) e retorne
		 * na tela o valor convertido para dólar (U$$). Para isso é necessário que o
		 * usuário informe também qual a taxa cambial do dia, ou seja, qual o valor do
		 * dólar.
		 */
		double valorDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do dolar(U$) hoje: "));
		double valorReal = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em R$: "));
		if (valorReal < 0) {
			JOptionPane.showMessageDialog(null, "Digite um valor inválido.\nTente novamente.");
		} else {
			JOptionPane.showMessageDialog(null,
					"O valor do dolar hoje é: " + valorDolar + "\nO valor em real(R$) informado: " + valorReal
							+ "\nO valor convertido para dolar(U$): " + valorReal / valorDolar);
		}
	}
}
