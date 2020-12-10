import java.util.Scanner;

public class Prova {
	public static void main(String[] args) {
		
		int pontos = 0;
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples simulado[];
		String respAluno;
		
		simulado = new QuestaoSimples[5];
		simulado[0] = new QuestaoMultiplaEscolha("Qual a formula da agua?", "H2O", "H20","HHH", "CO2", "GH1");
		simulado[1] = new QuestaoSimples("Qual a cor da casa Branca", "Branca");
		simulado[2] = new QuestaoComDica("Quantos dias tem a semana? ", "Sete Dias", "Fases da Lua");
		simulado[3] = new QuestaoMultiplaEscolha("Quantos meses tem o ano", "12", "12", "10", "15", "18");
		simulado[4] = new QuestaoSimples("Qual a cor do cavalo branco de napoleao","Branco");
		
		for (int pos=0; pos<simulado.length; pos++) {
			System.out.println(simulado[pos].aplicarQuestao());
			System.out.println("Sua resposta: ");
			respAluno = teclado.nextLine();
			if (simulado[pos].corrigir(respAluno)) {
				pontos++;
			}
		}
		System.out.println("Voce acertou um total de "+ pontos+ "/"+simulado.length);		
		teclado.close();
	}
}
