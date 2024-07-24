package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep21 {

    public static void main(String[] args) { 
        /*
         * 21) Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade
         * variável (Q) de clientes. Cada cliente faz apenas uma única operação:
         * depósitos(D), ou retiradas(R). Faça um programa para ler: Nome do cliente,
         * tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita
         * para cada um dos (Q) clientes de cada uma das (N) filas. Mostrar na tela,
         * para cada fila, o total de depósitos e retiradas que cada fila obteve.
         */

        int qtddFilas = Integer.parseInt(JOptionPane.showInputDialog("Quantas filas tem no banco?"));
        int qtddClientes;
        for (int i = 1; i <= qtddFilas; i++) {
            int somaDeposito = 0; 
            int somaRetirada = 0;
            qtddClientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes tem na " + i + "ª fila?"));
            for (int j = 0; j < qtddClientes; j++) {
                char opcao = JOptionPane.showInputDialog("(D)epósito ou (R)etirada?").toUpperCase().charAt(0);
                while (opcao != 'D' && opcao != 'R') {
                    opcao = JOptionPane.showInputDialog("Operação inválida! (D)epósito ou (R)etirada?").toUpperCase().charAt(0);
                }
                if (opcao == 'D') {
                    somaDeposito += 1;
                } else {
                    somaRetirada += 1;
                }
            }
            JOptionPane.showMessageDialog(null,
                    "FILA " + i + "\nTotal de depósitos: " + somaDeposito + "\nTotal de retiradas: " + somaRetirada);
        }
    }
}

