package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExemploMenu {
	
	public static void main(String[] args) {
		String menu = "1 - Bruschetta de Tomate e Manjericão\n"
				+ "2 - Filé de Salmão Grelhado\n"
				+ "3 - Lasanha de Berinjela\n"
				+ "4 - Tiramisu\n"
				+ "5 - Risoto\n\n" 
				+ "9 - Fechar o pedido";
		
		String pedido = "";
		
		int op = 9;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				pedido += "Bruschetta de Tomate e Manjericão\n";
				break;
			case 2:
				pedido += "Filé de Salmão Grelhado\n";
				break;
			case 3:
				pedido += "Lasanha de Berinjela\n";
				break;
			case 4:
				pedido += "Tiramisu\n";
				break;
			case 5:
				pedido += "Risoto\n";
				break;
			case 9:
				if(pedido.equals("")) {
					pedido = "Pedido vazio!";
				}
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "opção inválida!");
				break;
			}
		} while(op != 9);
		JOptionPane.showMessageDialog(null, pedido);
	}
}
