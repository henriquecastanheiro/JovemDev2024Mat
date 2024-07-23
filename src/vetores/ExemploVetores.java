package vetores;

import javax.swing.JOptionPane;

public class ExemploVetores {

	public static void main(String[] args) {
//Ou assim	String nomes[] = new String[10];
//	Prefeivel o segundo;
//		String[] nomes = new String[5];
//		for(int i=0; i<nomes.length; i++) {
//			nomes[i] = JOptionPane.showInputDialog("Nome " + (i+1));
//		}
		
//		CADASTRA VETOR
		
//		for(int i=0; i<nomes.length; i++) {
//			System.out.println(nomes[i]);
//		}
		String[] nomes = new String[100];
		String nome = "";
		int qt = 0;
		do {
			if (qt < 100) {
				nome = JOptionPane.showInputDialog("Nome : (enter para sair)");
				if (!nome.equals("")) {
					nomes[qt] = nome;
					qt++;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Memória cheia");
			}
		} while (!nome.equals(""));
//		for(int i=0; i< nomes.length; i++) {
//			System.out.println(nomes[i]);
//		}
		
//		PERCORRE VETOR INTEIRO
		
//		for(String n : nomes) {
//			System.out.println(n);
//		}
		
//		PERCORRE PARTE DO VETOR UTILIZADO
		
		for(int i=0; i< qt; i++) {
		System.out.println(nomes[i]);
	}

	}
}
