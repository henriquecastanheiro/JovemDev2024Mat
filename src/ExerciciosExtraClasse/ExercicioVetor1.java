package ExerciciosExtraClasse;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		/*
		 * Declarar e construir um vetor de inteiros e usar um laço for para
		 * inicializar seus elementos com os valores de 1 até 10
		 */
		int[] numeros = new int [10];
		for(int i=0; i < 10; i++) {
			numeros[i] = i + 1;
			System.out.println(numeros[i]);
		}
	}
}
