package br.com.backEnd;

import br.com.database.MatrixQuestion;

public class Question {

	private String pergunta;
	private String[] respostas;

	public Question() {

	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String[] getRespostas() {
		return respostas;
	}

	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}

	public Question sortear(double x, double y) {
		
		Question question = new Question();
		int linha = (int) (x + Math.random() * y);
		this.pergunta = MatrixQuestion.getTabela()[linha][0];
		this.respostas[0] = MatrixQuestion.getTabela()[linha][1];
		this.respostas[1] = MatrixQuestion.getTabela()[linha][2];
		this.respostas[2] = MatrixQuestion.getTabela()[linha][3];
		this.respostas[3] = MatrixQuestion.getTabela()[linha][4];
		
		return question;
	}
}
