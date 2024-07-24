package vetores_exercicios;

import javax.swing.JOptionPane;

public class ExercicioVet1 {

    public static void main(String[] args) {
        String menu = "Menu\n" +
                      "1 - Adicionar Mercadorias\n" +
                      "2 - Informações das Mercadorias\n" +
                      "0 - Sair";

        double[] valorMercadoria = new double[50];
        int[] estoqueMercadoria = new int[50];
        int numeroMercadorias = 0;
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    if (numeroMercadorias < 50) {
                        valorMercadoria[numeroMercadorias] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da mercadoria:"));
                        estoqueMercadoria[numeroMercadorias] = Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque da mercadoria:"));
                        numeroMercadorias++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Número máximo de mercadorias alcançado.");
                    }
                    break;
                case 2:
                    int menos10Unidades = 0;
                    int mais100ReaisMais10Unidades = 0;
                    double menorValor = 9999;
                    int estoqueMenorValor = 0;
                    double maiorValor = -9999;
                    int estoqueMaiorValor = 0;
                    int estoqueZerado = 0;

                    for (int i = 0; i < numeroMercadorias; i++) {
                        if (estoqueMercadoria[i] < 10) {
                            menos10Unidades++;
                        }
                        if (valorMercadoria[i] > 100 && estoqueMercadoria[i] > 10) {
                            mais100ReaisMais10Unidades++;
                        }
                        if (valorMercadoria[i] < menorValor) {
                            menorValor = valorMercadoria[i];
                            estoqueMenorValor = estoqueMercadoria[i];
                        }
                        if (valorMercadoria[i] > maiorValor) {
                            maiorValor = valorMercadoria[i];
                            estoqueMaiorValor = estoqueMercadoria[i];
                        }
                        if (estoqueMercadoria[i] == 0) {
                            estoqueZerado++;
                        }
                    }
                    String resultado = "Quantidade de mercadorias com menos de 10 unidades no estoque: " + menos10Unidades + "\n" +
                                       "Quantidade de mercadorias que custam mais de 100 reais e têm estoque com mais de 10 unidades: " + mais100ReaisMais10Unidades + "\n" +
                                       "Menor valor entre as mercadorias: " + menorValor + "\n" +
                                       "Estoque da mercadoria com menor valor: " + estoqueMenorValor + "\n" +
                                       "Maior valor entre as mercadorias: " + maiorValor + "\n" +
                                       "Estoque da mercadoria com maior valor: " + estoqueMaiorValor + "\n" +
                                       "Percentual de mercadorias com estoque zerado: " + ((double)estoqueZerado / numeroMercadorias * 100) + "%";

                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }
}
