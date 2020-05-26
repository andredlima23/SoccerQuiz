package br.com.backEnd;

import java.util.ArrayList;

import br.com.database.MatrixQuestion;

public class Algoritmos {

	public static Question sortearQuestion(double x, double y) {

		Question question = new Question();
		int linha = (int) (x + Math.random() * y);
		question.setPergunta(MatrixQuestion.buscaPerguntaEresposta(linha, 0));
		question.getRespostas().add(MatrixQuestion.buscaPerguntaEresposta(linha, 1));
		question.getRespostas().add(MatrixQuestion.buscaPerguntaEresposta(linha, 2));
		question.getRespostas().add(MatrixQuestion.buscaPerguntaEresposta(linha, 3));
		question.getRespostas().add(MatrixQuestion.buscaPerguntaEresposta(linha, 4));
		return question;
	}

	public static ArrayList<String> embaralharRespostas(ArrayList<String> listaEntrada) {

		ArrayList<String> listaSaida = new ArrayList<>();

		while (listaSaida.size() < 4) {
			int n = (int) (0 + Math.random() * 4);

			if (!listaSaida.contains(listaEntrada.get(n)))
				listaSaida.add(listaEntrada.get(n));
		}
		return listaSaida;
	}

	public static int getPosicaoRespostaCorreta(ArrayList<String> listaEntrada, String respostaCorreta) {

		Integer result = null;

		for (int i = 0; i < listaEntrada.size(); i++) {
			if (listaEntrada.get(i).equals(respostaCorreta)) {
				result = i;
			}
		}
		return result;
	}

}
