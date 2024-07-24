package estrutura_repeticao;

public class ExercicioEsRep18 {

	public static void main(String[] args) {
		/*
		 * 18) Faça um programa para mostrar na tela a seguinte sequência de números: 1,
		 * 3, 2, 1, 0 2, 3, 2, 1, 0 3, 3, 2, 1, 0
		 */
		for (int i = 1; i < 4; i++) {
			System.out.print(i);
			for (int j = 3; j >= 0; j--) {
				System.out.print(", " + j);
			}
			System.out.println("\n");
		}

	}
}