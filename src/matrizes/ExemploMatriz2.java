package matrizes;

import javax.swing.JOptionPane;

public class ExemploMatriz2 {
	//Cadastrar atletas, distâncias, 
	//e tempos que eles levam para correr a distância
	public static void main(String[] args) {
		int qtdAtletas = Integer.parseInt(JOptionPane.showInputDialog("Qtd Atletas"));
		int qtdDistancias = Integer.parseInt(JOptionPane.showInputDialog("Qtd Distâncias"));
		
		String[] atletas = new String[qtdAtletas];
		String[] distancias = new String[qtdDistancias];
		int [][] tempos = new int[qtdAtletas][qtdDistancias];
		
		for(int i=0; i< distancias.length; i++) {
			distancias[i] = JOptionPane.showInputDialog((i+1)+"ª Distância:");
		}
		
		for(int i=0; i< tempos.length; i++) {
			atletas[i] = JOptionPane.showInputDialog((i+1)+"ª Atleta:");
			for(int j=0; j<tempos[i].length; j++) {
				tempos[i][j] = Integer.parseInt(JOptionPane.showInputDialog(
						"Tempo de "+ atletas[i] + " para a distância de " +
						distancias[j]+" KM?"));
			}
		}
		String result = "";
		for(int i=0; i< tempos.length; i++) {
			int soma = 0;
			for(int j=0; j<tempos[i].length; j++) {
				soma += tempos[i][j];
			}
			result += atletas[i] + " - " + ((double)soma / distancias.length) + "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}

}