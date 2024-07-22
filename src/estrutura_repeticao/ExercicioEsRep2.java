package estrutura_repeticao;

public class ExercicioEsRep2 {

	public static void main(String[] args) {
		/*
		 * 2) Faça um programa para somar e mostrar na tela o resultado da seguinte
		 * expressão (1+2)+(2+3)+(3+4)+(4+5)+(5+6)+(6+7)+(7+8)+...+(100+101).
		 */
		int x=0;
		for(int i=1; i<=101; i++) {
			x+=i+(1+i);
			System.out.println(x);
		}
	}
}
