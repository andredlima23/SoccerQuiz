package br.com.frontEnd;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import br.com.backEnd.Algoritmos;
import br.com.backEnd.Question;
import br.com.database.MatrixQuestion;

public class TelaJogo extends JFrame {

	JTextArea textArea = new JTextArea();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
					frame.setVisible(true);
					MatrixQuestion.preencherTabela();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaJogo() {
		textArea.setBackground(new Color(204, 255, 255));
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textArea.setEditable(false);
		textArea.setLineWrap(true);

		getContentPane().setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);

		JLabel cabecalho = new JLabel("SoccerQuiz");
		cabecalho.setHorizontalAlignment(SwingConstants.CENTER);
		cabecalho.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));

		JRadioButton alternativa1 = new JRadioButton();
		alternativa1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		alternativa1.setBackground(new Color(204, 255, 255));

		JRadioButton alternativa2 = new JRadioButton();
		alternativa2.setBackground(new Color(204, 255, 255));
		alternativa2.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JRadioButton alternativa3 = new JRadioButton();
		alternativa3.setBackground(new Color(204, 255, 255));
		alternativa3.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JRadioButton alternativa4 = new JRadioButton();
		alternativa4.setBackground(new Color(204, 255, 255));
		alternativa4.setFont(new Font("Times New Roman", Font.BOLD, 20));

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(alternativa1);
		buttonGroup.add(alternativa2);
		buttonGroup.add(alternativa3);
		buttonGroup.add(alternativa4);

		JTextArea opcao1 = new JTextArea();
		opcao1.setBackground(new Color(204, 255, 255));
		JTextArea opcao2 = new JTextArea();
		opcao2.setBackground(new Color(204, 255, 255));
		JTextArea opcao3 = new JTextArea();
		opcao3.setBackground(new Color(204, 255, 255));
		JTextArea opcao4 = new JTextArea();
		opcao4.setBackground(new Color(204, 255, 255));
		
		JButton btnNewButton = new JButton("Responder");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question question = Algoritmos.sortearQuestion(1, 8);
				
				String respostaCorreta = question.getRespostas().get(0);
				
				textArea.setText(question.getPergunta());
				
				question.setRespostas(Algoritmos.embaralharRespostas(question.getRespostas()));
				
				int posicaoRespostaCorreta = Algoritmos.getPosicaoRespostaCorreta(question.getRespostas(), respostaCorreta);
				
				opcao1.setText(question.getRespostas().get(0));
				opcao2.setText(question.getRespostas().get(1));
				opcao3.setText(question.getRespostas().get(2));
				opcao4.setText(question.getRespostas().get(3));
					
				
			}

		});
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(129)
					.addComponent(cabecalho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(121))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(153)
					.addComponent(btnNewButton)
					.addContainerGap(166, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textArea, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(alternativa1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(alternativa4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(alternativa3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(alternativa2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(opcao2, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
								.addComponent(opcao3, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
								.addComponent(opcao4, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
								.addComponent(opcao1, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(cabecalho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(alternativa2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(opcao1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(alternativa3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(opcao2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(alternativa4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(opcao3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(alternativa1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addComponent(opcao4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(34)
					.addComponent(btnNewButton)
					.addGap(70))
		);
		getContentPane().setLayout(groupLayout);
	}
}
