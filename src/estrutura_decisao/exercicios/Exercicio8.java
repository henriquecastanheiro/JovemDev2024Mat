package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {
	public static void main(String[] args) {
		/*
		 * 8. Fazer um programa que leia um valor numérico inteiro, o qual representa um
		 * determinado dia da semana (1 – domingo, 2 – segunda-feira,..., 7 – sábado).
		 * Baseado neste valor, apresentar por extenso, qual é o nome correspondente a
		 * esse dia. Caso o valor informado não represente nenhum dos dias da semana,
		 * apresentar a mensagem: “valor inválido”.
		 */
		int diasDaSemana = Integer.parseInt(JOptionPane.showInputDialog("Dias da Semana:" + "\n" + "1 - Domingo" + "\n"
				+ "2 - Segunda-Feira" + "\n" + "3 - Terça-Feira" + "\n" + "4 - Quarta-Feira" + "\n" + "5 - Quinta-Feira"
				+ "\n" + "6 - Sexta-Feira" + "\n" + "7 - Sábado"));
		switch (diasDaSemana) {
		case 1:
			JOptionPane.showMessageDialog(null, "Você escolheu o primeiro dia da semana: " + 1 + "\n"
					+ "Domingo é aquele dia para relaxar e recarregar as energias para a semana que vem pela frente.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você escolheu o segundo dia da semana: " + 2 + "\n"
					+ "Segunda-feira, o dia universalmente reconhecido como o início da busca por mais café.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Você escolheu o terceiro dia da semana: " + 3 + "\n"
					+ "Terça-feira é o dia em que começamos a realmente aceitar que a semana realmente começou.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Você escolheu o quarto dia da semana: " + 4 + "\n"
					+ "Quarta-feira, também conhecida como o \"pico\" da semana - estamos quase lá!");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Você escolheu o quinto dia da semana: " + 5 + "\n"
					+ "Quinta-feira, o dia em que começamos a ver a luz no fim do túnel, ou seria só o desejo pelo final de semana?");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Você escolheu o sexto dia da semana: " + 6 + "\n"
					+ "Sexta-feira, o dia em que o humor melhora magicamente e tudo parece possível.");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Você escolheu o sétimo dia da semana: " + 7 + "\n"
					+ "Sábado, um dia para fazer o que você ama e esquecer que o relógio existe.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Valor Inválido!");

		}
	}
}
