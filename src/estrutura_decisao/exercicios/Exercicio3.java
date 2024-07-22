package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Escreva um programa que, dadas duas datas, determine qual delas ocorreu
		 * cronologicamente primeiro. Cada data é composta de 3 números inteiros, um
		 * representando o dia, outro o mês e outro o ano.
		 */

		int diaData1 = Integer
				.parseInt(JOptionPane.showInputDialog(" Para a 1º data escreva: " + "\n" + "Dia: "));
		int mesData1 = Integer
				.parseInt(JOptionPane.showInputDialog(" Para a 1º data escreva: " + "\n" + "Mês: "));
		int anoData1 = Integer
				.parseInt(JOptionPane.showInputDialog(" Para a 1º data escreva: " + "\n" + "Ano: "));
		int diaData2 = Integer
				.parseInt(JOptionPane.showInputDialog(" Para a 1º data escreva: " + "\n" + "Dia: "));
		int mesData2 = Integer
				.parseInt(JOptionPane.showInputDialog(" Para a 1º data escreva: " + "\n" + "Mês: "));
		int anoData2 = Integer
				.parseInt(JOptionPane.showInputDialog(" Para a 1º data escreva: " + "\n" + "Ano: "));
		if (anoData1 > anoData2) {
			JOptionPane.showMessageDialog(null, "Data em Ordem Cronologica: " + "\n" + diaData2 + "/" + mesData2 + "/"
					+ anoData2 + " - " + diaData1 + "/" + mesData1 + "/" + anoData1);
		} else if (anoData1 < anoData2) {
			JOptionPane.showMessageDialog(null, "Data em Ordem Cronologica: " + "\n" + diaData1 + "/" + mesData1 + "/"
					+ anoData1 + " - " + diaData2 + "/" + mesData2 + "/" + anoData2);
		} else if (mesData1 > mesData2) {
			JOptionPane.showMessageDialog(null, "Data em Ordem Cronologica: " + "\n" + diaData2 + "/" + mesData2 + "/"
					+ anoData2 + " - " + diaData1 + "/" + mesData1 + "/" + anoData1);
		} else if (mesData1 < mesData2) {
			JOptionPane.showMessageDialog(null, "Data em Ordem Cronologica: " + "\n" + diaData1 + "/" + mesData1 + "/"
					+ anoData1 + " - " + diaData2 + "/" + mesData2 + "/" + anoData2);
		} else if (diaData1 > diaData2) {
			JOptionPane.showMessageDialog(null, "Data em Ordem Cronologica: " + "\n" + diaData2 + "/" + mesData2 + "/"
					+ anoData2 + " - " + diaData1 + "/" + mesData1 + "/" + anoData1);
		} else if (diaData1 < diaData2) {
			JOptionPane.showMessageDialog(null, "Data em Ordem Cronologica: " + "\n" + diaData1 + "/" + mesData1 + "/"
					+ anoData1 + " - " + diaData2 + "/" + mesData2 + "/" + anoData2);
		}
	}
}
