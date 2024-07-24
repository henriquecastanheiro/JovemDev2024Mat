package vetores_exercicios;

import javax.swing.JOptionPane;

public class ExercicioVet4 {

    public static void main(String[] args) {
        // Definir as categorias
        String[] categorias = {
            "Infantil A",   // 5 a 7 anos
            "Infantil B",   // 8 a 10 anos
            "Juvenil",      // 11 a 17 anos
            "Adulto"        // Maiores de 18 anos
        };
        
        // Vetores para armazenar nomes e idades
        String[] nomes = new String[350];
        int[] idades = new int[350];
        int numPessoas = 0; // Contador de pessoas cadastradas
        String menu = "          Menu de Competição\n\n" +
                      "1 – Cadastrar Pessoa\n" +
                      "2 – Consultar Categoria por Nome\n" +
                      "3 – Sair";
        int op;

        do {
            // Exibe o menu e lê a opção escolhida
            String input = JOptionPane.showInputDialog(null, menu);
            // Valida se a entrada é um número inteiro
            try {
                op = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                op = -1; // Define uma opção inválida se a entrada não for um número
            }

            switch (op) {
                case 1: // Cadastrar Pessoa
                    if (numPessoas < 350) {
                        // Lê o nome e idade da pessoa
                        nomes[numPessoas] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (numPessoas + 1) + ":");
                        idades[numPessoas] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + (numPessoas + 1) + ":"));
                        numPessoas++; // Incrementa o contador de pessoas
                    } else {
                        // Mensagem de memória cheia
                        JOptionPane.showMessageDialog(null, "Número máximo de pessoas cadastradas atingido!");
                    }
                    break;
                
                case 2: // Consultar Categoria por Nome
                    // Lê o nome da pessoa a ser consultada
                    String nomeBusca = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja consultar: ");
                    boolean encontrado = false;

                    // Percorre os contatos para encontrar o nome
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

                            // Exibe a categoria encontrada
                            JOptionPane.showMessageDialog(null, "Pessoa encontrada:\nNome: " + nomes[i] + "\nIdade: " + idades[i] + "\nCategoria: " + categoria);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        // Mensagem se o nome não for encontrado
                        JOptionPane.showMessageDialog(null, "Nome não encontrado.");
                    }
                    break;
                
                case 3:
                    // Mensagem de saída
                    JOptionPane.showMessageDialog(null, "Saindo do Programa.");
                    break;
                
                default:
                    // Mensagem para opção inválida
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (op != 3); // Repete até que a opção 3 (sair) seja escolhida
    }
}
