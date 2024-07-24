package vetores_exercicios;

import javax.swing.JOptionPane;

public class ExercicioVet1 {

	public static void main(String[] args) {
<<<<<<< HEAD
		String menu = "	Menu"
				+ "1 - Adicionar Mercadorias" + "2 - Informações das Mercadorias " + "3 - Buscar por Mercadoria"+ "0 - Sair "; 
		String estoque = "	Estoque de Mercadorias"
				+ "1 - Feijão" + "2 - Batata" + "3 - Arroz"+ "0 - Sair ";
		String[] mercadorias = new String[50];
		double[] valorMercadoria = new double[50];
		int[] estoqueMercadoria = new int[50];
		int op = 0;
		int qt = 0;
=======
		String menu = "Menu\n" + "1 - Adicionar Mercadorias\n" + "2 - Informações das Mercadorias\n" + "0 - Sair";

		double[] valorMercadoria = new double[50];
		int[] estoqueMercadoria = new int[50];
		int numMercadorias = 0;
		int op;
>>>>>>> 6e4c14975cf5593c7c18e87509cb5647e22e90b8
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
<<<<<<< HEAD
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
=======
				if (numMercadorias < 50) {
					valorMercadoria[numMercadorias] = Double
							.parseDouble(JOptionPane.showInputDialog("Digite o valor da mercadoria:"));
					estoqueMercadoria[numMercadorias] = Integer
							.parseInt(JOptionPane.showInputDialog("Digite o estoque da mercadoria:"));
					numMercadorias++;
				} else {
					JOptionPane.showMessageDialog(null, "Número máximo de mercadorias alcançado.");
				}
				break;
			case 2:
				int menos10Unidades = 0;
				int mais100ReaisMais10Unidades = 0;
				double menorValor = 0;
				int menorEstoque = 999; 
				double maiorValor = 0;
				int estoqueMaiorValor = 0;
				int estoqueZerado = 0;

				for (int i = 0; i < numMercadorias; i++) {
					if (estoqueMercadoria[i] < 10) {
						menos10Unidades++;
					}
					if (valorMercadoria[i] > 100 && estoqueMercadoria[i] > 10) {
						mais100ReaisMais10Unidades++;
					}
					if (estoqueMercadoria[i] < menorEstoque) {
						menorEstoque = estoqueMercadoria[i];
						menorValor = valorMercadoria[i];
					}
					if (valorMercadoria[i] > maiorValor) {
						maiorValor = valorMercadoria[i];
						estoqueMaiorValor = estoqueMercadoria[i];
					}
					if (estoqueMercadoria[i] == 0) {
						estoqueZerado++;
					}
				}

				String resultado = "Quantidade de mercadorias com menos de 10 unidades no estoque: "
						+ menos10Unidades + "\n"
						+ "Quantidade de mercadorias que custam mais de 100 reais e têm estoque com mais de 10 unidades: "
						+ mais100ReaisMais10Unidades + "\n" + "Preço da mercadoria com menor estoque: " + menorValor
						+ "\n" + "Estoque da mercadoria com maior preço: " + estoqueMaiorValor + "\n"
						+ "Percentual de mercadorias com estoque zerado: "
						+ ((double) estoqueZerado / numMercadorias * 100) + "%";

				JOptionPane.showMessageDialog(null, resultado);
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Saindo do programa.");
				break;
			default:
				break;
			}
		} while (op != 0);
>>>>>>> 6e4c14975cf5593c7c18e87509cb5647e22e90b8
	}
}
