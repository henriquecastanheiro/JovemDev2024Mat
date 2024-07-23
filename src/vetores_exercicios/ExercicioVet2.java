package vetores_exercicios;

import javax.swing.JOptionPane;

public class ExercicioVet2 {

	public static void main(String[] args) {
		/*
		 * 2 - Criar um programa Java que leia N nomes de cores (perguntar ao usuário a
		 * quantidade de cores). Ao final inverta a ordem digitada. Por exemplo: Usuário
		 * digitou na ordem: azul – verde – vermelho - preto O sistema deverá mostrar:
		 * preto - vermelho – verde - azul
		 */
		int qtddCores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidadade de cores que deseja inserir: "));
		// Vetor para armazena as cores
		String[] cores = new String[qtddCores];
		for (int i=0; i < qtddCores; i++) {
			cores[i] = JOptionPane.showInputDialog("Digite o nome da cor "+ (i+1)+":");
			
		}
	       // Vetor para armazenar as cores na ordem invertida
        String[] coresInvertidas = new String[qtddCores];
        
        // Preencher o vetor com as cores na ordem invertida
        for (int i = 0; i < qtddCores; i++) {
            coresInvertidas[i] = cores[qtddCores - 1 - i];
        }
        
        // Criar uma string para exibir as cores invertidas
        String resultado = "Cores na ordem invertida:\n";
        for (int i = 0; i < qtddCores; i++) {
            resultado += coresInvertidas[i] + "\n";
        }
        
        // Mostrar as cores na ordem invertida
        JOptionPane.showMessageDialog(null, resultado);
    }
}
