package aula_introducao;

public class ExemploOperadores {

	public static void main(String[] args) {

		// Ctrl + Shift + F = Organizar código
		int int1 = 10;
		int int2 = -5;
		int int3 = 3;

		double double1 = 2.5;
		double double2 = -5.0;
		double double3 = 3.3;

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;

		// COMENTARIO UNICA LINHA

		/*
		 * *********************************** 
		 * EXEMPLO DE OPERAÇÕES ARITIMETICAS
		 * ***********************************
		 */

		// SOMA
		int r1 = int1 + int2;
		double r2 = double1 + double3;
		double r3 = int1 + double1;

		// Ctrl + alt + seta p/ baixo
		// syso + ctrl esp
		System.out.println("Soma de dois inteiros: " + r1);
		System.out.println("Soma de dois double: " + r2);
		System.out.println("Soma de int com double: " + r3);

		// SUBTRAÇÃO
		r1 = int1 - int2;
		r2 = double1 - double3;
		r3 = int1 - double1;

		System.out.println("Subtração de dois inteiros: " + r1);
		System.out.println("Subtração de dois double: " + r2);
		System.out.println("Subtração de int com double: " + r3);

		// MULTIPLICAÇÃO
		r1 = int1 * int2;
		r2 = double1 * double3;
		r3 = int1 * double1;

		System.out.println("Multiplicação de dois inteiros: " + r1);
		System.out.println("Multiplicação de dois double: " + r2);
		System.out.println("Multiplicação de int com double: " + r3);

		// DIVISÃO
		int r11 = int1 / int2;
		r11 = int1 / int3;
		System.out.println("Divisão de dois inteiros: " + r11);
		System.out.println("Divisão de dois inteiros (com dizima): " + r11);

		double r22 = int1 / int3; // SEMPRE VAI SER UM INTEIRO
		System.out.println("Divisão de dois inteiros (com dizima) para real: " + r22);
		r22 = int1 / (double) int3;
		System.out.println("Divisão de dois interios (com dizima) cast: " + r22);
		double r33 = double1 / double2;
		System.out.println("Divisão de dois double: " + r33);

		// RESTO DIVISÃO
		r1 = int1 % int3;
		System.out.println("Resto da divisão: " + r1);
		r1 = 16 % 7;
		System.out.println("Resto da divisão: " + r1);
		r1 = 16 / 7;
		System.out.println("Parte interia da divisão: " + r1);

		// EXPONENCIAÇÃO
		double r44 = Math.pow(int1, int3);
		System.out.println("Exponenciação: " + r44);

		/*
		 * *********************************** 
		 * EXEMPLO DE OPERAÇÕES RELACIONAIS
		 * ***********************************
		 */

		// SEMPRE RETORNA TRUE OR FALSE
		System.out.println("10 é igual a 5? " + (10 == 5));
		System.out.println("10 é igual a 10? " + (10 == 10));
		System.out.println("int1 é maior que int3? " + (int1 > int3));
		System.out.println("10 é diferente de 5? " + (10 != 5));

		boolean r55 = int3 > int1;
		System.out.println(r55);
		System.out.println("b1 é igual b3? " + (b1 == b3));
		System.out.println("D é maior que  A? " + ('D' == 'A'));

		/*
		 * *********************************** 
		 * EXEMPLO DE OPERAÇÕES LÓGICO
		 * ***********************************
		 */

		System.out.println("Operação AND: " + (b1 && b2 && b3));
		System.out.println("Operação OR: " + (b1 || b2 || b3));
		System.out.println("Negação b1: " + (!b1));

		/*
		 * *********************************** EXEMPLO DE OPERAÇÕES STRINGS
		 * ***********************************
		 */

		String str1 = "CASA";
		String str2 = "ESCOLA";
		String str3 = " ";
		String str4 = "10";
		String str5 = "cASA";

		char c1 = 'A';
		char c2 = '5';
		char c3 = ' ';

		System.out.println(str1 + str2 + str3);
		System.out.println(str4 + double1);
		// EVITAR USAR == POIS ELE IGNORA SE ESTA MAIUSCULO OU MINUSCULO
		System.out.println("CASA É IGUA A CASA: " + (str1 == str5));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str5));
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(2, 4));
		String str7 = double3 + "";
		str7 = String.valueOf(double3);
		String str6 = String.valueOf(c1) + String.valueOf(c3) + String.valueOf(c2);
		System.out.println(str7);
		System.out.println(str6);
		System.out.println(c1);
		System.out.println(str5.length());
		System.out.println(str2.indexOf("CO"));
		System.out.println(str2.indexOf("CD"));
		System.out.println(str2.contains("CO"));
		System.out.println(str2.startsWith("ES"));
		System.out.println(str2.endsWith("A"));

	}
}
