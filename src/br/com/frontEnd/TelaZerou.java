package br.com.frontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.backEnd.Algoritmos;

public class TelaZerou extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;

	public TelaZerou() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel cabeçalho = new JLabel("SoccerQuiz");
		cabeçalho.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		cabeçalho.setBounds(126, 5, 184, 46);
		contentPane.add(cabeçalho);

		JLabel mensagem_1 = new JLabel("Campe\u00E3o");
		mensagem_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		mensagem_1.setBounds(148, 39, 140, 50);
		contentPane.add(mensagem_1);

		JButton btnInicio = new JButton("In\u00EDcio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaIntro telaIntro = new TelaIntro();
				telaIntro.setVisible(true);
				setVisible(false);
				Algoritmos.nivel = 0;
			}
		});
		btnInicio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnInicio.setBounds(173, 421, 103, 29);
		contentPane.add(btnInicio);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaZerou.class.getResource("/br/com/frontEnd/images/soccer-champions.jpg")));
		lblNewLabel.setBounds(50, 75, 338, 338);
		contentPane.add(lblNewLabel);
	}

}
