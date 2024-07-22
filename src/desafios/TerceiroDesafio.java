package desafios;

import javax.swing.JOptionPane;

public class TerceiroDesafio {

	public static void main(String[] args) {
		double mbPorSegundo = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a velocidade da sua internet em mb/s: "));
		double mb = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do arquivo em megabytes: "));
		int minuto = 60;
		JOptionPane.showMessageDialog(null, "A conclusão do download será realizada em: " + "\n"
				+ ((mb * mbPorSegundo) / minuto + "min" + "\n" + (mb * mbPorSegundo) + "s"));
	}
}
