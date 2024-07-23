package desafios_primeira_semana;

import javax.swing.JOptionPane;

public class ConclusaoDownloadMb {

	public static void main(String[] args) {
		/*
		 * 3. Deseja-se saber quanto tempo será necessário para efetuar o download de um
		 * determinado arquivo na internet. Para isso pede-se um programa em que o
		 * usuário informe a velocidade de sua internet (mb/s – megabytes por segundo) e
		 * o tamanho do arquivo (mb - megabytes). A saída do programa/algoritmo deve ser
		 * o tempo (em minutos e segundos) que levará para aconclusão do download.
		 */
		double velocidadeInternet = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a velocidade da internet em mb/s: "));
		double tamanhoArquivo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do arquivo em mb: "));
		double tempoEmSegundos = tamanhoArquivo / velocidadeInternet;
		int minutos = (int) (tempoEmSegundos / 60);
		int segundos = (int) (tempoEmSegundos % 60);
		JOptionPane.showMessageDialog(null, "O download levará " + minutos + "min e " + segundos + " s.");
	}
}
