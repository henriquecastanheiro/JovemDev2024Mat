package aula_introducao;

import javax.swing.JOptionPane;

public class ExercicioConversoesMedidaPes {
	
	public static void main(String[] args) {
		double pes = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de pés: "));
		JOptionPane.showMessageDialog(null, "Conversão de " + pes + "para: \n" 
						+ "\n a) Polegadas: "+ (pes*12) 
						+ "\n b) Jardas: "+ (pes/3) 
						+ "\n c) Milhas: "+ (pes/ 3 / 1760));
	}
}
