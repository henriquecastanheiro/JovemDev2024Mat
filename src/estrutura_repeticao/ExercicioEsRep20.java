package estrutura_repeticao;

import javax.swing.JOptionPane;

public class ExercicioEsRep20 {

    public static void main(String[] args) {
        /*
         * 20) Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade
         * variável (Q) de clientes. Cada cliente faz apenas uma única operação:
         * depósitos(D), ou retiradas(R). Faça um programa para ler: Nome do cliente,
         * tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita
         * para cada um dos (Q) clientes de cada uma das (N) filas. Ao final, mostrar na
         * tela o total geral de depósitos e retiradas ocorridos.
         */
        int qtddFilas = Integer.parseInt(JOptionPane.showInputDialog("Informe quantas filas tem no banco: "));
        int qtddClientes;
        double somaDeposito = 0;
        double somaRetirada = 0;
        for (int i = 0; i < qtddFilas; i++) {
            qtddClientes = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos clientes tem na " + (i + 1) + "ª fila?"));
            for (int j = 0; j < qtddClientes; j++) {
                String nomeCliente = JOptionPane.showInputDialog("Nome do cliente " + (j + 1) + " na fila " + (i + 1) + ":");
                char opcao = JOptionPane.showInputDialog(nomeCliente + ": (D)epósito ou (R)etirada?").toUpperCase().charAt(0);
                while (opcao != 'D' && opcao != 'R') {
                    opcao = JOptionPane.showInputDialog(nomeCliente + ": Operação inválida! (D)epósito ou (R)etirada?").toUpperCase().charAt(0);
                }
                double valorOperacao = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da operação de " + nomeCliente + "?"));
                if (opcao == 'D') {
                    somaDeposito += valorOperacao;
                } else {
                    somaRetirada += valorOperacao;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Total de depósitos: R$ " + somaDeposito + "\nTotal de retiradas: R$ " + somaRetirada);
    }
}
