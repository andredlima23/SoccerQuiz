package br.com.frontEnd;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.backEnd.Algoritmos;
import br.com.database.MatrixQuestion;

public class TelaIntro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIntro frame = new TelaIntro();
					frame.setVisible(true);
					
					Algoritmos.questoesSorteadas = new ArrayList<Integer>();
					Algoritmos.nivel = 0;
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
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaIntro.class.getResource("/br/com/frontEnd/images/logo.jpg")));
		lblNewLabel.setLocation(40, 44);
		lblNewLabel.setSize(350, 350);
		contentPane.add(lblNewLabel);
		contentPane.add(cabeçalho);
		contentPane.add(btnRegras);
		contentPane.add(btnIniciar);
	}

}