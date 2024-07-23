package estrutura_repeticao;

import java.util.Scanner;

public class ExercicioEsRep11 {

	public static void main(String[] args) {
		/*
		 * 11) Faça um programa para ler uma série de N números do tipo REAL. Após a
		 * leitura, mostre na tela o menor dentre todos os números. Considere que o
		 * usuário poderá digitar qualquer número, positivos, negativos e zero.
		 */
		Scanner sc = new Scanner(System.in);
		double numero;
		double menor = Double.MAX_VALUE;
		System.out.print("Quantos números você deseja digitar? ");
		int n = sc.nextInt();
		int contador = 0;
		do {
			System.out.print("Digite o número " + (contador + 1) + ": ");
			numero = sc.nextDouble();
			if (numero < menor) {
				menor = numero;
			}
			contador++;
		} while (contador < n);
		System.out.println("O menor número digitado é: " + menor);
		sc.close();
	}
}
