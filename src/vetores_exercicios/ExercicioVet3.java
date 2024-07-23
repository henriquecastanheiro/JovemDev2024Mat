package vetores_exercicios;

import javax.swing.JOptionPane;

public class ExercicioVet3 {

    public static void main(String[] args) {
        String menu = "          Menu de Contatos\n\n" +
                      "1 – Cadastrar Contato\n" +
                      "2 – Buscar Contato por Nome\n" +
                      "3 – Buscar Contato por Telefone\n" +
                      "4 – Sair";
        
        String[] nomes = new String[100];
        String[] telefones = new String[100];
        int numContatos = 0; 
        int op; 
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (op) {
                case 1: // Cadastrar Contato
                    if (numContatos < 100) {
                        nomes[numContatos] = JOptionPane.showInputDialog("Digite o nome do contato " + (numContatos + 1) + ":");
                        telefones[numContatos] = JOptionPane.showInputDialog("Digite o número de telefone do contato " + (numContatos + 1) + ":");
                        numContatos++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Memória cheia!");
                    }
                    break;
                
                case 2: // Buscar por Nome
                    String buscaNome = JOptionPane.showInputDialog("Digite o nome do contato que deseja buscar: ");
                    boolean nomeEncontrado = false;
                    // Percorre os contatos para encontrar o nome
                    for (int i = 0; i < numContatos; i++) {
                        if (nomes[i].equalsIgnoreCase(buscaNome)) {
                            JOptionPane.showMessageDialog(null, "Contato encontrado: \nNome: " + nomes[i] + "\nTelefone: " + telefones[i]);
                            nomeEncontrado = true;
                            break;
                        }
                    }
                    if (!nomeEncontrado) {
                        JOptionPane.showMessageDialog(null, "Nome não encontrado.");
                    }
                    break;
                
                case 3: // Buscar por Telefone
                    int buscaPorTelefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do telefone que deseja buscar: "));
                    boolean telefoneEncontrado = false;  
                    // Percorre os contatos para encontrar o telefone
                    for (int i = 0; i < numContatos; i++) {
                        if (telefones[i].equals(buscaPorTelefone)) {
                            JOptionPane.showMessageDialog(null, "Contato encontrado: \nNome: " + nomes[i] + "\nTelefone: " + telefones[i]);
                            telefoneEncontrado = true;
                            break;
                        }
                    }
                    if (!telefoneEncontrado) {
                        JOptionPane.showMessageDialog(null, "Telefone não encontrado.");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do Programa.");
                    break;
                
                default:
                    break;
            }
        } while (op != 4);
    }
}

