package vetores_exercicios;

import javax.swing.JOptionPane;

public class ExercicioVet1 {

	public static void main(String[] args) {
		String menu = "	Menu"
				+ "1 - Adicionar Mercadorias" + "2 - Informações das Mercadorias " + "3 - Buscar por Mercadoria"+ "0 - Sair "; 
		String estoque = "	Estoque de Mercadorias"
				+ "1 - Feijão" + "2 - Batata" + "3 - Arroz"+ "0 - Sair ";
		String[] mercadorias = new String[50];
		double[] valorMercadoria = new double[50];
		int[] estoqueMercadoria = new int[50];
		int op = 0;
		int qt = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				if (qt<50) {
					mercadorias[qt] = JOptionPane.showInputDialog("Digite o nome da mercadoria que deseja adicionar: " + (qt+1));
					valorMercadoria[qt] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mercadoria: " + (qt+1)));
					estoqueMercadoria[qt] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de mercadoria: "+ (qt+1)));
					qt++;
				} else {
					JOptionPane.showMessageDialog(null, "Estoque cheio!");
				}
				break;
			case 2:
				String buscaMercadoria = JOptionPane.showInputDialog("Qual mercadoria deseja buscar?");
				String achou = "Nome não encontrado";
				int posicao = 0;
				do {
					if(mercadorias[posicao].equals(buscaMercadoria)) {
						achou = "Encontrado"+ mercadorias[posicao]+"\nvalor= "+valor;
					}
					pos++;
				}while(pos < qt && achou.equals("Nome não encontrado"));
				JOptionPane.showMessageDialog(null,"Achou");
				break;
			case 3:
			
				break;
			case 0:
			
				break;
			
			default:
				break;
			}
		}
	}
}
