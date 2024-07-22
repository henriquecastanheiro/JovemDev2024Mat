package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		/*
		 * 7. Fazer um programa para ler o ano e o mês de nascimento (1 a 12) de uma
		 * pessoa, bem como o mês atual. Caso o mês atual seja igual ao mês de
		 * nascimento, escrever a mensagem: “mês referente a seu aniversário”, caso
		 * contrário, escrever a mensagem “não é o mês do seu aniversário”. Calcular e
		 * mostrar a idade dessa pessoa levando-se em conta apenas o mês e o ano.
		 */

		int mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu nascimento(1 a 12): "));
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
		int mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		if (mesNascimento == mesAtual) {
			JOptionPane.showMessageDialog(null,
					"Mês referente ao seu aniversário!" + "\n" + (anoAtual - anoNascimento));
		} else if ((mesNascimento >= 1) || (mesNascimento <= 12) && (mesNascimento < mesAtual)) {
			JOptionPane.showMessageDialog(null,
					"Não é o mês do seu aniversário!" + "\n" + ((anoAtual - anoNascimento)));
		} else if ((mesNascimento >= 1) || (mesNascimento <= 12) && (mesNascimento > mesAtual)) {
			JOptionPane.showMessageDialog(null,
					"Não é o mês do seu aniversário!" + "\n" + ((anoAtual - anoNascimento) - 1));
		} else {
			JOptionPane.showMessageDialog(null, "Valor Inválido!");
		}

	}
}
