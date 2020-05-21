package br.com.backEnd;

import java.util.HashMap;

public class Perguntas {
	private static HashMap<Integer, String> facil;
	private static HashMap<Integer, String> medio;
	private static HashMap<Integer, String> dificil;
	private static HashMap<Integer, String> pro;

	public static HashMap<Integer, String> getFacil() {
		return facil;
	}

	public static HashMap<Integer, String> getMedio() {
		return medio;
	}

	public static HashMap<Integer, String> getDificil() {
		return dificil;
	}

	public static HashMap<Integer, String> getPro() {
		return pro;
	}
	
	public static void carregarPerguntas(){
		facil.put(1, "Qual a única seleção cinco vezes campeã da copa do mundo da FIFA?");
		medio.put(1, "Quem é o maior artilheiro brasileiro da Premier League?");
		dificil.put(1, "");
		pro.put(1, "");
	}
}
