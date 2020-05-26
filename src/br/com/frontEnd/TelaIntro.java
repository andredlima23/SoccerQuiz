package br.com.frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import br.com.database.MatrixQuestion;

import java.awt.Color;

public class TelaIntro extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIntro frame = new TelaIntro();
					frame.setVisible(true);
					MatrixQuestion.preencherTabela();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaIntro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel cabeçalho = new JLabel("SoccerQuiz");
		cabeçalho.setBounds(126, 5, 184, 46);
		cabeçalho.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));

		JLabel lblNewLabel = new JLabel(new ImageIcon(getClass().getResource("bola.png")));
		lblNewLabel.setBounds(5, 57, 424, 344);
		lblNewLabel.setBackground(new Color(204, 255, 255));

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(298, 416, 103, 29);
		btnIniciar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaJogo telaJogo = new TelaJogo();
				telaJogo.setVisible(true);
				
				setVisible(false);

			}
		});
		
		JButton btnRegras = new JButton("Regras");
		btnRegras.setBounds(36, 416, 103, 29);
		btnRegras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRegras TelaRegras = new TelaRegras();
				TelaRegras.setVisible(true);
				setVisible(false);
			}
		});
		btnRegras.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.setLayout(null);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(121)
					.addComponent(cabeçalho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(119))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(btnRegras, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
					.addComponent(btnIniciar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(cabeçalho, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIniciar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRegras, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}