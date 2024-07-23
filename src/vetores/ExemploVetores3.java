package vetores;

import javax.swing.JOptionPane;

public class ExemploVetores3 {

	public static void main(String[] args) {
		/*
		 * Algoritmo para ler o nome e a idade de 100 pessoas. Após verificar o nome da
		 * pessoa mais velha e verificar se um determinado nome está na lista.
		 */
		String menu = "1 - Cadastrar\n"
				+"2 - Nome da pessoa mais velha\n"
				+"3 - Buscar pessoa\n"
				+"9 - Sair\n";
		String[] nomes = new String[100];
		int[] idades= new int [100];
		int op = 0;
		int qt = 0;
		
//***************************************		
//******Cenário de Testes****************
		
		nomes[0] = "A";
		nomes[1] = "B";
		nomes[2] = "C";
		nomes[3] = "D";
		nomes[4] = "E";
		
		idades[0] = 10;
		idades[1] = 9;
		idades[2] = 8;
		idades[3] = 7;
		idades[4] = 6;
		
		qt = 5;
		
//***************************************
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				if(qt <100) {
					nomes[qt] = JOptionPane.showInputDialog("Nome "+(qt+1));
					idades[qt] = Integer.parseInt(JOptionPane.showInputDialog("Idade "+(qt+1)));
					qt++;
				} else {
					JOptionPane.showMessageDialog(null,"Memória cheia!");					
				}
				break;
			case 2:
				String nomeMaisVelho = nomes[0];
				int idadeMaisVelho = idades[0];
				for (int i=1; i < qt; i++) {
					if (idades[i] > idadeMaisVelho) {
						idadeMaisVelho = idades[i];
						nomeMaisVelho = nomes[i];
					}
				}
				JOptionPane.showMessageDialog(null,	"Pessoa mais velha:" + nomeMaisVelho);
				break;
			case 3:
				String nomeBusca = JOptionPane.showInputDialog("Buscar por qual nome?");
				String achou = "Nome não encontrado";
				int pos = 0;
				do {
					if(nomes[pos].equals(nomeBusca)) {
						achou = "Encontrado"+ nomes[pos]+"está na posição " + (pos=+1);
					}
					pos++;
				}while(pos < qt && achou.equals("Nome não encontrado"));
				JOptionPane.showMessageDialog(null,"Achou");
				break;
			case 9:
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção Inválida!");
				break;
			}
		}while (op != 9);
	}
}
