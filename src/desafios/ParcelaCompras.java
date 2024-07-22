package pacote_desafio;

import javax.swing.JOptionPane;

public class ParcelaCompras {

	public static void main(String[] args) {
		/*
		 * 5. Uma compra a vista tem 10% de desconto. Se for à prazo, em até 3 parcelas,
		 * não tem juros e o valor é dividido pelo número de parcelas. Acima de 3
		 * parcelas é cobrado um juro de 15% sobre o valor total da compra, e as
		 * parcelas passam a ter esse juro acrescentado. Faça um programa que leia o
		 * valor da compra, o número de parcelas e mostre o valor de cada parcela.
		 */
		double valorDaCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
		int numeroDeParcela = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas: "));
		double valorDaParcela;
		if (valorDaCompra <= 0 || numeroDeParcela <= 0) {
			JOptionPane.showMessageDialog(null, "O valor de compra e o número de parcelas devem ser positivos!");
		} else {
			if (numeroDeParcela == 1) {
				JOptionPane.showMessageDialog(null,
						"Na compra à vista você ganha 10% de desconto.\nO valor da sua compra ficou R$: "
								+ valorDaCompra * 0.9);
			} else if (numeroDeParcela <= 3) {
				JOptionPane.showMessageDialog(null,
						"Se for à prazo, em até 3 parcelas, não tem juros.\nO valor da sua compra ficou R$: "
								+ (valorDaParcela = valorDaCompra / numeroDeParcela) + " para cada parcela.");
			} else {
				JOptionPane.showMessageDialog(null,
						"Acima de 3 parcelas é cobrado juros de 15% sobre o valor total da compra.\nO valor da sua compra ficou R$: "
								+ (valorDaParcela = (valorDaCompra * 0.15 + valorDaCompra) / numeroDeParcela)
								+ " para cada parcela.");
			}
		}
	}
}
