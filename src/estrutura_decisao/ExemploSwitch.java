package estrutura_decisao;

import javax.swing.JOptionPane;

public class ExemploSwitch {
	public static void main(String[] args) {
		int turno = Integer.parseInt(JOptionPane.showInputDialog("Turno:" 
					+ "\n1) Matutino" 
					+ "\n2) Vespertino" 
					+ "\n3) Noturno"));
		switch (turno) {
		case 1: {
			JOptionPane.showMessageDialog(null, "Matutino");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "Vespertino");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "Noturno");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Matutino");
			break;
		}
		JOptionPane.showMessageDialog(null, "Adeus");
	}
}
