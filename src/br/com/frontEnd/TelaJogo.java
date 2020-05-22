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

public class TelaJogo extends JFrame {
	
	JTextArea textArea = new JTextArea();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
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


		JButton btnNewButton = new JButton("Responder");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("teste");
						
			}
		}

		);

		JLabel rodape = new JLabel("Desenvolvido por: Andr\u00E9 d'Lima / Pedro HSP");
		rodape.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JTextArea textArea_Alternativa1 = new JTextArea();
		textArea_Alternativa1.setBackground(new Color(204, 255, 255));
		
		JTextArea textArea_Alternativa2 = new JTextArea();
		textArea_Alternativa2.setBackground(new Color(204, 255, 255));
		
		JTextArea textArea_Alternativa3 = new JTextArea();
		textArea_Alternativa3.setBackground(new Color(204, 255, 255));
		
		JTextArea textArea_Alternativa4 = new JTextArea();
		textArea_Alternativa4.setBackground(new Color(204, 255, 255));
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(129)
					.addComponent(cabecalho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(121))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(191, Short.MAX_VALUE)
					.addComponent(rodape)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(153)
					.addComponent(btnNewButton)
					.addContainerGap(166, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(alternativa1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(alternativa4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(alternativa3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(alternativa2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea_Alternativa1, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_Alternativa2, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_Alternativa3, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_Alternativa4, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(cabecalho, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(alternativa2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_Alternativa1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(alternativa3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_Alternativa2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(alternativa4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_Alternativa3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea_Alternativa4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(alternativa1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(btnNewButton)
					.addGap(44)
					.addComponent(rodape)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
}
