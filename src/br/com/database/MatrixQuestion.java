package br.com.database;

public class MatrixQuestion {
	private static String tabela[][] = new String[30][5];

	public static String buscaPerguntaEresposta(int linha, int coluna) {
		return tabela[linha][coluna];
	}

	public static void preencherTabela() {
		//Início nível fácil
		tabela[0][0] = "Qual a única seleção cinco vezes campeã da copa do mundo da FIFA?";
		tabela[0][1] = "Brasil";
		tabela[0][2] = "Alemanha";
		tabela[0][3] = "Itália";
		tabela[0][4] = "França";
		tabela[1][0] = "Qual é o atual clube de Neymar?";
		tabela[1][1] = "Paris Saint-Germain";
		tabela[1][2] = "Barcelona";
		tabela[1][3] = "Santos";
		tabela[1][4] = "Real Madrid";
		tabela[2][0] = "Qual o clube com mais títulos da UEFA Champions League?";
		tabela[2][1] = "Real Madrid";
		tabela[2][2] = "Barcelona";
		tabela[2][3] = "Milan";
		tabela[2][4] = "Liverpool";
		tabela[3][0] = "Como se chama o principal torneio internacional de clubes da CONMEBOL?";
		tabela[3][1] = "Libertadores da América";
		tabela[3][2] = "Campeonato Brasileiro";
		tabela[3][3] = "Recopa Sulamericana";
		tabela[3][4] = "Copa Mercosul";
		tabela[4][0] = "Qual clube é o campeão da UEFA Champions League 18/19?";
		tabela[4][1] = "Liverpool";
		tabela[4][2] = "Tottenham";
		tabela[4][3] = "Barcelona";
		tabela[4][4] = "Ajax";
		tabela[5][0] = "Qual clube é o atual campeão da Taça Libertadores da América?";
		tabela[5][1] = "Flamengo";
		tabela[5][2] = "River Plate";
		tabela[5][3] = "Grêmio";
		tabela[5][4] = "Boca Juniors";
		tabela[6][0] = "Qual seleção fez a final da copa do mundo de 2002 com o Brasil?";
		tabela[6][1] = "Alemanha";
		tabela[6][2] = "França";
		tabela[6][3] = "Itália";
		tabela[6][4] = "Argentina";
		tabela[7][0] = "Quem é o atual treinador da seleção brasileira de futebol?";
		tabela[7][1] = "Tite";
		tabela[7][2] = "Felipão";
		tabela[7][3] = "Dunga";
		tabela[7][4] = "Parreira";
		tabela[8][0] = "Como se chama o principal torneio nacional de clubes do Brasil?";
		tabela[8][1] = "Brasileirão Série A";
		tabela[8][2] = "Copa do Brasil";
		tabela[8][3] = "Campeonato Pernambucano";
		tabela[8][4] = "Copa dos Campeões";
		//Fim nível fácil
		//Início nível médio
		tabela[9][0] = "Quem o capitão da seleção brasileira na copa do mundo FIFA de 2002?";
		tabela[9][1] = "Cafú";
		tabela[9][2] = "Ronaldo";
		tabela[9][3] = "Rivaldo";
		tabela[9][4] = "Lúcio";
		tabela[10][0] = "Qual é o mascote da seleção brasileira de futebol?";
		tabela[10][1] = "Canarinho";
		tabela[10][2] = "Fuleco";
		tabela[10][3] = "Zé Carioca";
		tabela[10][4] = "Louro José";
		tabela[11][0] = "Em quais anos o Brasil cediou a copa do mundo da FIFA?";
		tabela[11][1] = "1950 e 2014";
		tabela[11][2] = "1956 e 2016";
		tabela[11][3] = "1950 e 2018";
		tabela[11][4] = "1970 e 2014";
	}
}
