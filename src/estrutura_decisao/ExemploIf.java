package estrutura_decisao;

import javax.swing.JOptionPane;

public class ExemploIf {

	public static void main(String[] args) {

		int idadeJoazinho = Integer.parseInt(JOptionPane.showInputDialog("Idade de Joazinho"));
		int idadeMariazinha = Integer.parseInt(JOptionPane.showInputDialog("Idade de Mariazinha"));
		/*
		 * ********************************** 
		 * IF SIMPLES
		 * **********************************
		 */
		// Ctrl + Shift + C = Comentar varias linhas
//		if (idadeJoazinho > idadeMariazinha) {
//			JOptionPane.showMessageDialog(null, "Joãzinho é mais velho que Mariazinha.");
//		}
//		JOptionPane.showMessageDialog(null, "Adeus");

		/*
		 * ********************************** 
		 * IF COMPOSTO
		 * **********************************
		 */
//		if (idadeJoazinho > idadeMariazinha) {
//			JOptionPane.showMessageDialog(null, "Joãzinho é mais velho que Mariazinha.");
//
//		} else {
//			JOptionPane.showMessageDialog(null, "Mariazinha é mais velha que Joãzinho.");
//			
//		}
//		JOptionPane.showMessageDialog(null, "Adeus");
		/*
		 * ********************************** 
		 * IF ENCADEADO
		 * **********************************
		 */
		if (idadeJoazinho > idadeMariazinha) {
			JOptionPane.showMessageDialog(null, "Joãzinho é mais velho que Mariazinha.");
		}else { 
			}if (idadeJoazinho == idadeMariazinha){
				JOptionPane.showMessageDialog(null, "A idade de Joãozinho é igual a de Mariazinha.");
			}else {
				JOptionPane.showMessageDialog(null, "Mariazinha é mais velha que Joãzinho.");
		}
		JOptionPane.showMessageDialog(null, "Adeus");
		}
	}
