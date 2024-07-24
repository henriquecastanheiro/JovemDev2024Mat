package estrutura_repeticao;

public class ExercicioEsRep17 {

	public static void main(String[] args) {
		/*
		 * 17) Faça um programa para mostrar na tela a seguinte sequência de números: 1,
		 * 0, 1, 2, 3 2, 0, 1, 2, 3 3, 0, 1, 2, 3
		 */

		for (int i = 1; i < 4; i++) {

			System.out.print(i);

			for (int j = 0; j < 4; j++) {
				System.out.print(", "+ j );
			}
			System.out.println("\n");
		}

	}

}
