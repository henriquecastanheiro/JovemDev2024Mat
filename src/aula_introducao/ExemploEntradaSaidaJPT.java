package aula_introducao;

import javax.swing.JOptionPane;

public class ExemploEntradaSaidaJPT {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		double imc = peso / (altura * altura);
		String msg = nome + "\nSeu IMC é: " + imc;
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
}
