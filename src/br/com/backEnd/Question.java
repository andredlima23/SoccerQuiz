package br.com.backEnd;

import java.util.ArrayList;

public class Question {

	private String pergunta;
	private ArrayList<String> respostas;

	public Question() {
		this.respostas = new ArrayList<String>();
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public ArrayList<String> getRespostas() {
		return respostas;
	}

	public void setRespostas(ArrayList<String> respostas) {
		this.respostas = respostas;
	}

}
