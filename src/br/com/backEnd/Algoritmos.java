package br.com.backEnd;

import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;

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
	
	public static int atualizarQuestao(Question  question, JTextArea textArea, JTextArea opcao1, JTextArea opcao2, JTextArea opcao3, JTextArea opcao4) {
		
		question = Algoritmos.sortearQuestion(1, 8);
		
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

}
