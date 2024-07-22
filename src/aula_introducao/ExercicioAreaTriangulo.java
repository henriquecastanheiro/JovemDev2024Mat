package aula_introducao;

import javax.swing.JOptionPane;

public class ExercicioAreaTriangulo {
	
	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		JOptionPane.showMessageDialog(null, "Area do Triangulo é: " + (base * altura)/2);
	}

}
