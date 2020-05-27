package br.com.frontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import br.com.backEnd.Algoritmos;
import br.com.backEnd.Question;
import br.com.frontEnd.TelaMensagem;

public class TelaJogo extends JFrame {

	private static final long serialVersionUID = 1L;

	JTextArea textArea = new JTextArea();
	Question question = new Question();

	public TelaJogo() {
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setToolTipText("");
		textArea.setBounds(30, 80, 375, 125);
		textArea.setBackground(new Color(204, 255, 255));
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textArea.setEditable(false);

		getContentPane().setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);

		JLabel cabecalho = new JLabel("SoccerQuiz");
		cabecalho.setBounds(126, 5, 184, 46);
		cabecalho.setHorizontalAlignment(SwingConstants.CENTER);
		cabecalho.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));

		JRadioButton alternativa1 = new JRadioButton();
		alternativa1.setBounds(10, 235, 21, 21);
		alternativa1.setBackground(new Color(204, 255, 255));
		alternativa1.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JRadioButton alternativa2 = new JRadioButton();
		alternativa2.setBounds(10, 271, 21, 21);
		alternativa2.setBackground(new Color(204, 255, 255));
		alternativa2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		alternativa2.setBackground(new Color(204, 255, 255));

		JRadioButton alternativa3 = new JRadioButton();
		alternativa3.setBounds(10, 307, 21, 21);
		alternativa3.setBackground(new Color(204, 255, 255));
		alternativa3.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JRadioButton alternativa4 = new JRadioButton();
		alternativa4.setBounds(10, 343, 21, 21);
		alternativa4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		alternativa4.setBackground(new Color(204, 255, 255));

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(alternativa2);
		buttonGroup.add(alternativa4);
		buttonGroup.add(alternativa3);
		buttonGroup.add(alternativa1);

		JTextArea opcao1 = new JTextArea();
		opcao1.setEditable(false);
		opcao1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		opcao1.setBounds(33, 235, 375, 22);
		opcao1.setBackground(new Color(204, 255, 255));

		JTextArea opcao2 = new JTextArea();
		opcao2.setEditable(false);
		opcao2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		opcao2.setBounds(33, 271, 375, 22);
		opcao2.setBackground(new Color(204, 255, 255));

		JTextArea opcao3 = new JTextArea();
		opcao3.setEditable(false);
		opcao3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		opcao3.setBounds(33, 307, 375, 22);
		opcao3.setBackground(new Color(204, 255, 255));

		JTextArea opcao4 = new JTextArea();
		opcao4.setEditable(false);
		opcao4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		opcao4.setBounds(33, 343, 375, 22);
		opcao4.setBackground(new Color(204, 255, 255));

		int posicaoRespostaCorreta = Algoritmos.atualizarQuestao(question, textArea, opcao1, opcao2, opcao3, opcao4);

		JButton btnNewButton = new JButton("Responder");
		btnNewButton.setBounds(153, 395, 150, 30);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (alternativa1.isSelected() || alternativa2.isSelected() || alternativa3.isSelected()
						|| alternativa4.isSelected()) {
					TelaMensagem telaMensagem;
					TelaPerdeu telaPerdeu;
					TelaZerou telaZerou;

					if (Algoritmos.verificarResposta(alternativa1, alternativa2, alternativa3,
							alternativa4) == posicaoRespostaCorreta) {
						if (Algoritmos.nivel < 10) {
							telaMensagem = new TelaMensagem();
							telaMensagem.setVisible(true);
							setVisible(false);
						} else {
							telaZerou = new TelaZerou();
							telaZerou.setVisible(true);
							setVisible(false);
						}
					} else {
						telaPerdeu = new TelaPerdeu();
						telaPerdeu.setVisible(true);
						setVisible(false);
					}
				} else {
						JOptionPane.showMessageDialog(null, "Escolha uma alternativa!");
				}
			}
		});

		getContentPane().setLayout(null);
		getContentPane().add(cabecalho);
		getContentPane().add(textArea);
		getContentPane().add(alternativa1);
		getContentPane().add(alternativa2);
		getContentPane().add(alternativa3);
		getContentPane().add(alternativa4);
		getContentPane().add(opcao1);
		getContentPane().add(opcao2);
		getContentPane().add(opcao3);
		getContentPane().add(opcao4);
		getContentPane().add(btnNewButton);
	}
}
