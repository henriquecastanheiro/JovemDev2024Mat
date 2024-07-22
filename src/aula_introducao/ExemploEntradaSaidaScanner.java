package aula_introducao;

import java.util.Scanner;

public class ExemploEntradaSaidaScanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome:\n");
		String nome = sc.next();
		System.out.println("Peso:\n");
		double peso = sc.nextDouble();
		System.out.println("Altura:\n");
		double altura = sc.nextDouble();
		double imc = peso / (altura * altura);
		System.out.println(nome + "\nSeu IMC é: " + imc);
		sc.close();
		
		
	}
}
