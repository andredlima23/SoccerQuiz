package br.com.frontEnd;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaRegras extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public TelaRegras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel cabeçalho = new JLabel("SoccerQuiz");
		cabeçalho.setBounds(126, 5, 184, 46);
		cabeçalho.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		
		JLabel lblComoJogar = new JLabel("Como Jogar");
		lblComoJogar.setBounds(124, 49, 205, 38);
		lblComoJogar.setFont(new Font("Times New Roman", Font.BOLD, 35));
		
		JLabel lblClique = new JLabel("1 - Clique em \"Iniciar\"");
		lblClique.setBounds(15, 114, 404, 38);
		lblClique.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblLeia = new JLabel("2 - Leia a pergunta");
		lblLeia.setBounds(15, 158, 404, 38);
		lblLeia.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblEscolha = new JLabel("3 - Escolha uma resposta");
		lblEscolha.setBounds(15, 202, 404, 38);
		lblEscolha.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblClique_1 = new JLabel("4 - Clique no bot\u00E3o \"Responder\"");
		lblClique_1.setBounds(15, 246, 404, 38);
		lblClique_1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		JLabel lblSe = new JLabel("5 - Se acertar, passa de n\u00EDvel");
		lblSe.setBounds(15, 290, 404, 38);
		lblSe.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblDivirtase = new JLabel("Divirta-se");
		lblDivirtase.setBounds(15, 359, 404, 38);
		lblDivirtase.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivirtase.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel rodape = new JLabel("Desenvolvido por: Andr\u00E9 d'Lima / Pedro HSP");
		rodape.setBounds(104, 443, 315, 15);
		rodape.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(15, 422, 75, 29);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaIntro telaIntro = new TelaIntro();
				telaIntro.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.setLayout(null);
		contentPane.add(lblComoJogar);
		contentPane.add(cabeçalho);
		contentPane.add(btnVoltar);
		contentPane.add(rodape);
		contentPane.add(lblClique);
		contentPane.add(lblLeia);
		contentPane.add(lblEscolha);
		contentPane.add(lblClique_1);
		contentPane.add(lblSe);
		contentPane.add(lblDivirtase);
	}
}
