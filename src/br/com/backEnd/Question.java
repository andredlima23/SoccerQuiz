package br.com.backEnd;

public class Question {
	private String pergunta;
	private String respostaCorreta;
	private String [] respostas;
	public Question(String pergunta, String respostaCorreta, String[] respostas) {
		super();
		this.pergunta = pergunta;
		this.respostaCorreta = respostaCorreta;
		this.respostas = respostas;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getRespostaCorreta() {
		return respostaCorreta;
	}
	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}
	public String[] getRespostas() {
		return respostas;
	}
	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}
	
}
