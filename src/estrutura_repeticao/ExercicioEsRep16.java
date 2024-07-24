package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep16 {

	public static void main(String[] args) {
		/*
		 * 16) Faça um programa para simular um elevador. O programa deverá ler
		 * inicialmente o número do andar inicial (qualquer número não negativo). Depois
		 * disto, o programa deve continuamente ler o próximo andar e escrever “sobe” ou
		 * “desce” caso este andar seja superior (número maior) ou inferior (número
		 * menor). O programa deve parar quando o próximo andar for igual ao andar em
		 * que o elevador já se encontrar. O elevador deverá realizar N movimentações
		 * entre os andares.
		 */
		int andarAtual = -1;
		while (andarAtual < 0) {
			andarAtual = Integer.parseInt(JOptionPane.showInputDialog("Em qual andar o elevador se encontra?"));
		}
		int proxAndar = -1;
		boolean continuar = true;
		while (continuar) {
			do {
				proxAndar = Integer
						.parseInt(JOptionPane.showInputDialog("Próximo andar?" + "\nAndar Atual:	" + andarAtual));
			} while (proxAndar < 0);

			if (proxAndar > andarAtual) {
				JOptionPane.showMessageDialog(null, "Sobe");
			} else if (proxAndar < andarAtual) {
				JOptionPane.showMessageDialog(null, "Desce");
			} else {
				continuar = false;
			}
			andarAtual = proxAndar;
		}
		JOptionPane.showMessageDialog(null, "Parando o elevador - Destino é o andar atual!");
	}

}