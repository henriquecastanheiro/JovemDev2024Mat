package vetores_exercicios;

import javax.swing.JOptionPane;

public class ExercicioVet4 {

    public static void main(String[] args) {
        String[] categorias = {
            "Infantil A",   // 5 a 7 anos
            "Infantil B",   // 8 a 10 anos
            "Juvenil",      // 11 a 17 anos
            "Adulto"        // Maiores de 18 anos
        };
        
        // Vetores para armazenar nomes e idades
        String[] nomes = new String[350];
        int[] idades = new int[350];
        int numPessoas = 0;
        String menu = "          Menu de Competição\n\n" +
                      "1 – Cadastrar Pessoa\n" +
                      "2 – Consultar Categoria por Nome\n" +
                      "3 – Sair";
        int op;

        do {
            String input = JOptionPane.showInputDialog(null, menu);
            try {
                op = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                op = -1;
            }

            switch (op) {
                case 1: // Cadastrar Pessoa
                    if (numPessoas < 350) {
                        nomes[numPessoas] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (numPessoas + 1) + ":");
                        idades[numPessoas] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + (numPessoas + 1) + ":"));
                        numPessoas++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Número máximo de pessoas cadastradas atingido!");
                    }
                    break;
                
                case 2: // Consultar Categoria por Nome
                    String nomeBusca = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja consultar: ");
                    boolean encontrado = false;
                    for (int i = 0; i < numPessoas; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                            // Determina a categoria com base na idade
                            String categoria;
                            if (idades[i] >= 5 && idades[i] <= 7) {
                                categoria = categorias[0];
                            } else if (idades[i] >= 8 && idades[i] <= 10) {
                                categoria = categorias[1];
                            } else if (idades[i] >= 11 && idades[i] <= 17) {
                                categoria = categorias[2];
                            } else if (idades[i] >= 18) {
                                categoria = categorias[3];
                            } else {
                                categoria = "Idade não válida";
                            }
                            JOptionPane.showMessageDialog(null, "Pessoa encontrada:\nNome: " + nomes[i] + "\nIdade: " + idades[i] + "\nCategoria: " + categoria);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Nome não encontrado.");
                    }
                    break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do Programa.");
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (op != 3);
    }
}
