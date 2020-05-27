package br.com.backEnd;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import br.com.database.MatrixQuestion;

public class Algoritmos {

	public static ArrayList<Integer> questoesSorteadas;
	public static int nivel;

	public static Question sortearQuestion(int menor, int maior) {

		Question question = new Question();
		Random aleatorio = new Random();
		int linha;

		while (true) {

			linha = aleatorio.nextInt((maior - menor) + 1) + menor;
			if (!Algoritmos.questoesSorteadas.contains(linha)) {
				questoesSorteadas.add(linha);
				break;
			}
		}

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

		for (int i = 0; i < listaEntrada.size(); i++)
			if (listaEntrada.get(i).equals(respostaCorreta))
				result = i;

		return result;
	}

	public static int verificarResposta(JRadioButton r1, JRadioButton r2, JRadioButton r3, JRadioButton r4) {
		Integer result = null;

		if (r1.isSelected())
			result = 0;
		else if (r2.isSelected())
			result = 1;
		else if (r3.isSelected())
			result = 2;
		else if (r4.isSelected())
			result = 3;

		return result;
	}

	public static int atualizarQuestao(Question question, JTextArea textArea, JTextArea opcao1, JTextArea opcao2,
			JTextArea opcao3, JTextArea opcao4) {

		nivel++;
		int vetorNivel[] = verificarNivel();
		question = Algoritmos.sortearQuestion(vetorNivel[0], vetorNivel[1]);

		String respostaCorreta = question.getRespostas().get(0);

		question.setRespostas(Algoritmos.embaralharRespostas(question.getRespostas()));

		int posicaoRespostaCorreta = Algoritmos.getPosicaoRespostaCorreta(question.getRespostas(), respostaCorreta);

		textArea.setText(question.getPergunta());
		opcao1.setText(question.getRespostas().get(0));
		opcao2.setText(question.getRespostas().get(1));
		opcao3.setText(question.getRespostas().get(2));
		opcao4.setText(question.getRespostas().get(3));

		return posicaoRespostaCorreta;
	}

	public static int[] verificarNivel() {
		int vetor[] = new int[2];

		if (nivel < 4) {
			vetor[0] = 0;
			vetor[1] = 8;
		} else if (nivel < 8) {
			vetor[0] = 9;
			vetor[1] = 20;
		} else if (nivel < 10) {
			vetor[0] = 21;
			vetor[1] = 26;
		} else {
			vetor[0] = 27;
			vetor[1] = 29;
		}

		return vetor;
	}

}
