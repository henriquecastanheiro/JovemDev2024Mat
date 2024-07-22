package desafios;

import javax.swing.JOptionPane;

public class QuintoDesafio {

	public static void main(String[] args) {
		double valorDaCompra = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
		int numeroDeParcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas: "));
		double valorDaParcela = 0;
		if (numeroDeParcelas == 1) {
			JOptionPane.showMessageDialog(null, "Na compra a vista, você ganha 10% de desconto. "
					+ "\nO valor com o desconto é de:  " + (valorDaCompra - (valorDaCompra * 0.1)));
		} else if (numeroDeParcelas <= 3) {
			JOptionPane.showMessageDialog(null,
					"Se for a prazo, em até 3 parcelas, não tem juros. \nO valor dividido por:  " + numeroDeParcelas
							+ " parcelas é igual a R$: " + (valorDaParcela = valorDaCompra / numeroDeParcelas));
		} else {
			JOptionPane.showMessageDialog(null,
					"Se for a prazo, acima de 3 parcelas é cobrado um juro de 15% sobre o valor total da compra. "
							+ "\nO valor dividido por:  " + numeroDeParcelas + " parcelas é igual a R$: "
							+ (valorDaParcela = valorDaCompra / numeroDeParcelas + (valorDaCompra * 0.15)));
		}
	}
}
