package aula_introducao;

import javax.swing.JOptionPane;

public class ExercicioAreaTrianguloProf {
	
	public static void main(String[] args) {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		double area = base * altura / 2;
		JOptionPane.showMessageDialog(null, "Area do Triangulo é: " + area);
	}
}
