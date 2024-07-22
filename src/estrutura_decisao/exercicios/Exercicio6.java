package estrutura_decisao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 6. Escreva um programa que mostre na tela um menu de pratos (pelo menos 5),
		 * cada um associado a um número. Prato 1 - Miojo Prato 2 – Ensopado Quando um
		 * número é selecionado, o programa deve exibir uma breve descrição do prato.
		 * Por exemplo, ao digitar 1, o programa mostra: “Macarrão instantâneo”.
		 */

		int cardapio = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Menu" + "\n" + "1 - Carne com Arroz" + "\n" + "2 - Lasanha"
						+ "\n" + "3 - Camarão milanesa" + "\n" + "4 - Frango Crocante" + "\n" + "5 - Macarrão"));

		switch (cardapio) {
		case 1:
			JOptionPane.showMessageDialog(null, "Sua escolha foi: " + "1" + "\n"
					+ "Um prato típico que consiste em carne, \n Cozida lentamente com temperos e servida sobre arroz branco. "
					+ "\n Pode incluir legumes como cenoura, batata, e ervilha, dependendo da receita.");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Sua escolha foi: " + "2" + "\n"
					+ "Um prato de origem italiana, composto por camadas de massa de lasanha intercaladas com molho de carne ou bolonhesa, molho branco (béchamel) e queijo. "
					+ "\n É assada no forno até ficar dourada e borbulhante.");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Sua escolha foi: " + "3" + "\n"
					+ "Camarões empanados e fritos até ficarem crocantes por fora e macios por dentro. "
					+ "\n É comum acompanhar com limão e servir com arroz branco e salada.");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Sua escolha foi: " + "4" + "\n"
					+ "Peitos de frango ou pedaços de frango empanados e fritos ou assados até ficarem crocantes por fora e suculentos por dentro. "
					+ "\n Pode ser servido com molhos diversos, como molho barbecue, mostarda ou molho tártaro.");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sua escolha foi: " + "5" + "\n"
					+ " Prato muito versátil da culinária mundial, que consiste em massa de trigo cozida e geralmente acompanhada de molho. "
					+ "\n Pode ser servido com molho de tomate, molho branco, molho pesto, entre outros");
			break;
		default:
			JOptionPane.showInternalMessageDialog(null, "Opção Inválida!");
			break;
		}
	}
}
