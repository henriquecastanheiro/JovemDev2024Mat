package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {
	
	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal( ) {
//		List<String> lista = new ArrayList<>();
//		lista.add("Elemento 1");
//		lista.add("Elemento 2");
//		System.out.println("Tamanho: " + lista.size());
//		System.out.println();
		
//		Set<String> conjunto = new HashSet<>();
//		conjunto.add("Elemento 1");
//		conjunto.add("Elemento 1");
//		System.out.println(conjunto.size());
//		conjunto.remove("Elemnto 1");
//		System.out.println(conjunto.isEmpty());		
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "João");
		mapa.put(2, "Maria"); //COLOCAR JOÃO E MARIA
		System.out.println(mapa.size()); //MOSTRAR O TAMANHO
		System.out.println(mapa.get(1)); // PRINTAR O JOAO
		mapa.put(1, "José"); // SUBSTITUIR JOAO PARA JOSÉ
		System.out.println(mapa.get(1));
		mapa.remove(1); // REMOVER A CHAVE 1
		System.out.println(mapa.get(1));
		mapa.put(1, "José"); // SUBSTITUIR JOAO PARA JOSÉ
		System.out.println(mapa.get(1));
		mapa.remove(1, "Maria"); // REMOVER A CHAVE 1
		System.out.println(mapa.get(1));
	}
}
