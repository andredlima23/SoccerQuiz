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
		facil.put(0, "Qual a �nica sele��o cinco vezes campe� da copa do mundo da FIFA?");
		facil.put(1, "Qual � o atual clube de Neymar?");
		facil.put(2, "Qual o clube com mais t�tulos da UEFA Champions League?");
		facil.put(3, "Como se chama o principal torneio internacional de clubes da CONMEBOL?");
		facil.put(4, "Qual clube � o campe�o da UEFA Champions League 18/19?");
		facil.put(5, "Qual clube � o atual campe�o da Ta�a Libertadores da Am�rica?");
		facil.put(6, "Qual sele��o fez a final da copa do mundo de 2002 com o Brasil?");
		facil.put(7, "Quem � o atual treinador da sele��o brasileira de futebol?");
		facil.put(8, "Como se chama o torneio de clubes nacional do Brasil?");
		medio.put(0, "Quem � o maior artilheiro brasileiro da Premier League?");
		medio.put(1, "");
		medio.put(2, "");
		medio.put(3, "");
		medio.put(4, "");
		medio.put(5, "");
		medio.put(6, "");
		medio.put(7, "");
		medio.put(8, "");
		medio.put(9, "");
		medio.put(10, "");
		medio.put(11, "");
		dificil.put(0, "");
		pro.put(0, "");
	}
}
