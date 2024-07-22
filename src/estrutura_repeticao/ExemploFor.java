package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		// i = i + 1
//		for(int i=0; i<10; i++) {
//			System.out.print(i + ", ");
//		for(int i=155; i<160; i++) {
//			System.out.print(i + ", ");
//		for(int i=0; i<20; i+=2) {
//			System.out.print(i + ", ");
//		for(int i=0; i<100; i+=10) {
//			System.out.print(i + ", ");
//		Números ímpares:
//		for(int i=i; i<20; i+=2) {
//			System.out.print(i + ", ");
//		for(int i=20; i>0; i-=2) {
//			System.out.print(i + ", ");
		int pontoIn = Integer.parseInt(JOptionPane.showInputDialog("Início:"));
		int pontoFin = Integer.parseInt(JOptionPane.showInputDialog("Final:"));
			if (pontoIn < pontoFin) {
			for (int i = pontoIn; i <= pontoFin; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = pontoFin; i <= pontoIn; i++)
				System.out.print(i + " ");
		}
	}
}