package ExerciciosExtraClasse;

public class ExercicioVetor2 {
	
	public static void main(String[] args) {
	// 1) Faça um programa que calcule: Y = 1 + 2 + 3 + 4 + 5 + ... + 10.
	System.out.println("Y = 1 + 2 + 3 + 4 + 5 + ... + 10");
	int soma = 0;
	for(int i=1; i<= 10; i++) {
		soma += i; 
	}
	System.out.println("Y= " + soma);
	}
}
