package desafios;

import javax.swing.JOptionPane;

public class SegundoDesafio {

	public static void main(String[] args) {

		double dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do dolar(U$) hoje: "));
		double real = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em R$: "));
		JOptionPane.showMessageDialog(null,
				"O valor em dolar de: " + real + " reais \nÉ equivalente há: " + real / dolar + " dolares");
	}
}
