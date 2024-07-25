package aula_introducao;

public class ExemploMedidaTempo {
	
	public static void main(String[] args) {
		
		String[] nomes = new String[100000];
		
		for(int i=0; i <nomes.length; i++) {
			nomes[i] = "Nome "+ i;
		}
			
		}
}
		
//		String[] buscas = {"X", " nome 99999", "nome 0"};
//		for (String busca : buscas) {
//
//			String ret ="Não existe";
//			long t1 = System.nanoTime();
////			for(String s : nomes) {
////				if(s.equals(busca)) {
////					ret = "Achei";		
//			}
//		}
////		int pos = 0;
////		do {
////			if(nomes[pos].equals(busca)) {
////				ret = "Achei";
////			}
////			pos++;
////		}while()
////		System.out.println(ret);
////		long t2 = System.nanoTime();
////		
////		System.out.println(t2 - t1);
////	}
//}
