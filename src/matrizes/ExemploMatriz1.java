package matrizes;

import java.util.Random;

public class ExemploMatriz1 {
	
	public static void main(String[] args) {
		int[][] matriz = new int [4][4];
		
		String[] linhas = {"Lobisomen", "Bruxa","Saci","Mula sem cabeça"};
		String[] colunas= {"Nova", "Cheia","Minguante","Crescente"};
		
		Random r = new Random();
		
		matriz[0][0]=r.nextInt(99);
		matriz[0][1]=r.nextInt(99);
		matriz[0][2]=r.nextInt(99);
		matriz[0][3]=r.nextInt(99);
		matriz[1][0]=r.nextInt(99);
		matriz[1][1]=r.nextInt(99);
		matriz[1][2]=r.nextInt(99);
		matriz[1][3]=r.nextInt(99);
		matriz[2][0]=r.nextInt(99);
		matriz[2][1]=r.nextInt(99);
		matriz[2][2]=r.nextInt(99);
		matriz[2][3]=r.nextInt(99);
		matriz[3][0]=r.nextInt(99);
		matriz[3][1]=r.nextInt(99);
		matriz[3][2]=r.nextInt(99);
		matriz[3][3]=r.nextInt(99);
		
		// MATRIZ NO FORMATO ORIGINAL
//		for(int i = 0; i < matriz.length; i++) {
//			System.out.println();
//			for(int j = 0; j < matriz[i].length; j++) {
//				System.out.println(matriz[i][j]+"\t");
//			}
//		}
		/*
		 * ************************************************
		 * SOMAR CADA LINHA E APRESENTAR:
		 * LINHA 1: X
		 * LINHA 2: X
		 * ...
		 */
		for(int i = 0; i < matriz.length; i++) {
			System.out.println();
			int soma = 0;
			for(int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];

	}
			System.out.println("Linha" + (i+1) + ": " +soma);
}
		/*
		 * SOMAR CADA COLUNA E APREENTAR:
		 * COLUNA 1: X
		 */
		for(int i = 0; i < matriz.length; i++) {
			int somaColuna = 0;
			for(int j = 0; j < matriz[i].length; j++) {
				somaColuna += matriz[j][i];

	}
			System.out.println("\nColuna:" + (i+1) + ": " +somaColuna);
}
		/*
		 * SOMAR A DIAGONAL PRINCIPAL DA MATRIZ
		 */
		int somaDiagonal = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i==j) {
					somaDiagonal+= matriz[i][j];
				}
	}
}
		System.out.println("\nDiagonal Principal:" +somaDiagonal);
		/*
		 *TABELA FOL
		 */
		
}
}