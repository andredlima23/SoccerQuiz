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

public class TelaPerdeu extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private final JLabel lblTenteOutraVez = new JLabel("Tente Outra Vez");

	public TelaPerdeu() {
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
		
		JLabel mensagem_1 = new JLabel("Fim de Jogo");
		mensagem_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 40));
		mensagem_1.setBounds(100, 72, 243, 72);
		contentPane.add(mensagem_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaPerdeu.class.getResource("/br/com/frontEnd/images/perdeu.png")));
		lblNewLabel.setBounds(5, 150, 424, 240);
		contentPane.add(lblNewLabel);
		
		JButton btnInicio = new JButton("In\u00EDcio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaIntro telaIntro = new TelaIntro();
				telaIntro.setVisible(true);
				setVisible(false);
				Algoritmos.nivel=0;
			}
		});
		btnInicio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnInicio.setBounds(152, 421, 103, 29);
		contentPane.add(btnInicio);
		lblTenteOutraVez.setBounds(140, 396, 130, 25);
		contentPane.add(lblTenteOutraVez);
		lblTenteOutraVez.setFont(new Font("Showcard Gothic", Font.PLAIN, 14));
	}

}
