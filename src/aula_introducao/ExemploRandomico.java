package aula_introducao;

import java.util.Random;

public class ExemploRandomico {
	
	public static void main(String[] args) {
		Random r = new Random ();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt(9));
	}
}
