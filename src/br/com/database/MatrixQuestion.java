package br.com.database;

public class MatrixQuestion {
	private static String tabela[][] = new String[30][5];

	public static String buscaPerguntaEresposta(int linha, int coluna) {
		return tabela[linha][coluna];
	}

	public static void preencherTabela() {
		//In�cio n�vel f�cil
		tabela[0][0] = "Qual a �nica sele��o cinco vezes campe� da copa do mundo da FIFA?";
		tabela[0][1] = "Brasil";
		tabela[0][2] = "Alemanha";
		tabela[0][3] = "It�lia";
		tabela[0][4] = "Fran�a";
		tabela[1][0] = "Qual � o atual clube de Neymar?";
		tabela[1][1] = "Paris Saint-Germain";
		tabela[1][2] = "Barcelona";
		tabela[1][3] = "Santos";
		tabela[1][4] = "Real Madrid";
		tabela[2][0] = "Qual o clube com mais t�tulos da UEFA Champions League?";
		tabela[2][1] = "Real Madrid";
		tabela[2][2] = "Barcelona";
		tabela[2][3] = "Milan";
		tabela[2][4] = "Liverpool";
		tabela[3][0] = "Como se chama o principal torneio internacional de clubes da CONMEBOL?";
		tabela[3][1] = "Libertadores da Am�rica";
		tabela[3][2] = "Campeonato Brasileiro";
		tabela[3][3] = "Recopa Sulamericana";
		tabela[3][4] = "Copa Mercosul";
		tabela[4][0] = "Qual clube � o campe�o da UEFA Champions League 18/19?";
		tabela[4][1] = "Liverpool";
		tabela[4][2] = "Tottenham";
		tabela[4][3] = "Barcelona";
		tabela[4][4] = "Ajax";
		tabela[5][0] = "Qual clube � o atual campe�o da Ta�a Libertadores da Am�rica?";
		tabela[5][1] = "Flamengo";
		tabela[5][2] = "River Plate";
		tabela[5][3] = "Gr�mio";
		tabela[5][4] = "Boca Juniors";
		tabela[6][0] = "Qual sele��o fez a final da copa do mundo de 2002 com o Brasil?";
		tabela[6][1] = "Alemanha";
		tabela[6][2] = "Fran�a";
		tabela[6][3] = "It�lia";
		tabela[6][4] = "Argentina";
		tabela[7][0] = "Quem � o atual treinador da sele��o brasileira de futebol?";
		tabela[7][1] = "Tite";
		tabela[7][2] = "Felip�o";
		tabela[7][3] = "Dunga";
		tabela[7][4] = "Parreira";
		tabela[8][0] = "Como se chama o principal torneio nacional de clubes do Brasil?";
		tabela[8][1] = "Brasileir�o S�rie A";
		tabela[8][2] = "Copa do Brasil";
		tabela[8][3] = "Campeonato Pernambucano";
		tabela[8][4] = "Copa dos Campe�es";
		//Fim n�vel f�cil
		//In�cio n�vel m�dio
		tabela[9][0] = "Quem o capit�o da sele��o brasileira na copa do mundo FIFA de 2002?";
		tabela[9][1] = "Caf�";
		tabela[9][2] = "Ronaldo";
		tabela[9][3] = "Rivaldo";
		tabela[9][4] = "L�cio";
		tabela[10][0] = "Qual � o mascote da sele��o brasileira de futebol?";
		tabela[10][1] = "Canarinho";
		tabela[10][2] = "Fuleco";
		tabela[10][3] = "Z� Carioca";
		tabela[10][4] = "Louro Jos�";
		tabela[11][0] = "Em quais anos o Brasil cediou a copa do mundo da FIFA?";
		tabela[11][1] = "1950 e 2014";
		tabela[11][2] = "1956 e 2016";
		tabela[11][3] = "1950 e 2018";
		tabela[11][4] = "1970 e 2014";
	}
}
