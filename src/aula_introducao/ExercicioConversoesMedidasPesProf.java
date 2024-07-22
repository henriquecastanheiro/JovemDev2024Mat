package aula_introducao;

import javax.swing.JOptionPane;

public class ExercicioConversoesMedidasPesProf {
	public static void main(String[] args) {
		double pes = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número de pés: "));
		String msg = String.format("Conversão de %.5f para:\n" + "a) Polegadas: %.5f in\n" + "b) Jardas: %.5f yd\n"
				+ "c) Milhas: %.5f mi\n", pes, (pes * 12), (pes / 3), (pes / 3 / 1760));
		JOptionPane.showMessageDialog(null, msg);
	}
}
