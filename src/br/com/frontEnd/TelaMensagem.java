package br.com.frontEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMensagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMensagem frame = new TelaMensagem();
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
	public TelaMensagem() {
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
		
		JLabel mensagem_1 = new JLabel("Acertou!");
		mensagem_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 40));
		mensagem_1.setBounds(125, 72, 205, 72);
		contentPane.add(mensagem_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaMensagem.class.getResource("/br/com/frontEnd/images/vamos.png")));
		lblNewLabel.setBounds(5, 150, 424, 240);
		contentPane.add(lblNewLabel);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnContinuar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnContinuar.setBounds(162, 421, 103, 29);
		contentPane.add(btnContinuar);
		
		
	}
}
