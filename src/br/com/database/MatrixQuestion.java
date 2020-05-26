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
		tabela[4][0] = "Qual clube foi o campeão da UEFA Champions League 18/19?";
		tabela[4][1] = "Liverpool";
		tabela[4][2] = "Tottenham";
		tabela[4][3] = "Barcelona";
		tabela[4][4] = "Ajax";
		tabela[5][0] = "Qual clube foi o campeão da Taça Libertadores da América 2019?";
		tabela[5][1] = "Flamengo";
		tabela[5][2] = "River Plate";
		tabela[5][3] = "Grêmio";
		tabela[5][4] = "Boca Juniors";
		tabela[6][0] = "Qual seleção fez a final da Copa do Mundo FIFA de 2002 com o Brasil?";
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
		tabela[9][0] = "Quem era o capitão da seleção brasileira na copa do mundo FIFA de 2002?";
		tabela[9][1] = "Cafú";
		tabela[9][2] = "Ronaldo";
		tabela[9][3] = "Rivaldo";
		tabela[9][4] = "Lúcio";
		tabela[10][0] = "Qual é o mascote da seleção brasileira de futebol?";
		tabela[10][1] = "Canarinho";
		tabela[10][2] = "Fuleco";
		tabela[10][3] = "Zé Carioca";
		tabela[10][4] = "Louro José";
		tabela[11][0] = "Em quais anos o Brasil sediou a copa do mundo da FIFA?";
		tabela[11][1] = "1950 e 2014";
		tabela[11][2] = "1956 e 2016";
		tabela[11][3] = "1950 e 2018";
		tabela[11][4] = "1970 e 2014";
		tabela[12][0] = "Em que ano a seleção brasileira conquistou o primeiro título mundial?";
		tabela[12][1] = "1958";
		tabela[12][2] = "1962";
		tabela[12][3] = "1970";
		tabela[12][4] = "1994";
		tabela[13][0] = "Em que ano a seleção brasileira conquistou a última Copa América";
		tabela[13][1] = "2019";
		tabela[13][2] = "2009";
		tabela[13][3] = "2015";
		tabela[13][4] = "2005";
		tabela[14][0] = "Quais foram os finalistas do Mundial de Clubes da FIFA de 2019?";
		tabela[14][1] = "Flamengo e Liverpool";
		tabela[14][2] = "Flamengo e River Plate";
		tabela[14][3] = "Liverpool e Tottenham";
		tabela[14][4] = "Liverpool e River Plate";
		tabela[15][0] = "Quais foram os finalistas do UEFA Champions League de 2018/2019";
		tabela[15][1] = "Liverpool e Tottenham";
		tabela[15][2] = "Liverpool e Ajax";
		tabela[15][3] = "Barcelona e Tottenham";
		tabela[15][4] = "Liverpool e Barcelona";
		tabela[16][0] = "Quais foram os finalistas da Copa do Mundo FIFA 2018?";
		tabela[16][1] = "França e Croácia";
		tabela[16][2] = "França e Inglaterra";
		tabela[16][3] = "Bélgica e Croácia";
		tabela[16][4] = "Brasil e Inglaterra";
		tabela[17][0] = "Quais foram os finalistas da Copa do Mundo FIFA 2014?";
		tabela[17][1] = "Alemanha e Argentina";
		tabela[17][2] = "Alemanha e Brasil";
		tabela[17][3] = "Brasil e Argentina";
		tabela[17][4] = "Holanda e Alemanha";
		tabela[18][0] = "Qual país sediou a Copa do Mundo FIFA 2018?";
		tabela[18][1] = "Rússia";
		tabela[18][2] = "África do Sul";
		tabela[18][3] = "Brasil";
		tabela[18][4] = "França";
		tabela[19][0] = "Qual será o país sede da Copa do Mundo FIFA 2022?";
		tabela[19][1] = "Catar";
		tabela[19][2] = "Argentina";
		tabela[19][3] = "Arábia Saudita";
		tabela[19][4] = "Portugal";
		tabela[20][0] = "Quem conquistou a medalha de ouro no futebol nos Jogos Olímpicos de 2016?";
		tabela[20][1] = "Brasil";
		tabela[20][2] = "Alemanha";
		tabela[20][3] = "Rússia";
		tabela[20][4] = "França";
		//Fim nível médio
		//Início nível difícil
		tabela[21][0] = "Quem vestia as camisas '9, 10 e 11' no último título do Brasil em copas do mundo?";
		tabela[21][1] = "Ronaldo, Rivaldo e Ronaldinho Gaúcho";
		tabela[21][2] = "Ronaldo, Kaká e Rivaldo";
		tabela[21][3] = "Ronaldinho Gaúcho, Rivaldo e Denílson";
		tabela[21][4] = "Rivaldo, Roberto Carlos e Cafú";
		tabela[22][0] = "Quais seleções podem se igualar ao Brasil em títulos mundiais?";
		tabela[22][1] = "Alemanha e Itália";
		tabela[22][2] = "Alemanha e França";
		tabela[22][3] = "Itália e França";
		tabela[22][4] = "Argentina e França";
		tabela[23][0] = "Quem foi o artilheiro da edição da Uefa Champions League 18/19?";
		tabela[23][1] = "Messi";
		tabela[23][2] = "Cristiano Ronaldo";
		tabela[23][3] = "Neymar";
		tabela[23][4] = "Benzema";
		tabela[24][0] = "Quem foi o artilheiro da edição da Uefa Champions League 17/18?";
		tabela[24][1] = "Cristiano Ronaldo";
		tabela[24][2] = "Messi";
		tabela[24][3] = "Salah";
		tabela[24][4] = "Mané";
		tabela[25][0] = "Quem foi o artilheiro da Copa do Mundo FIFA 2018?";
		tabela[25][1] = "Harry Kane";
		tabela[25][2] = "Lukaku";
		tabela[25][3] = "Mbappé";
		tabela[25][4] = "Cristiano Ronaldo";
		tabela[26][0] = "Quem foi o artilheiro da Copa do Mundo FIFA 2002?";
		tabela[26][1] = "Ronaldo";
		tabela[26][2] = "Rivaldo";
		tabela[26][3] = "Vieri";
		tabela[26][4] = "Klose";
		//Fim nível difícil
		//Início nível pro
		tabela[27][0] = "Quais foram os anos das maiores goleadas da Uefa Champions League?";
		tabela[27][1] = "2007 e 2015";
		tabela[27][2] = "2003 e 2007";
		tabela[27][3] = "2007 e 2009";
		tabela[27][4] = "1993 e 2000";
		tabela[28][0] = "Qual foi o ano da maior goleada da história da Copa do Mundo FIFA?";
		tabela[28][1] = "1974";
		tabela[28][2] = "1982";
		tabela[28][3] = "1986";
		tabela[28][4] = "2002";
		tabela[29][0] = "Qual foi o ano da maior goleada da história do Campeonato Brasileiro?";
		tabela[29][1] = "1983";
		tabela[29][2] = "1984";
		tabela[29][3] = "1968";
		tabela[29][4] = "2003";
		//Fim nível pro
	}
}
