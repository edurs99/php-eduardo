

public class QuestaoComDica extends QuestaoSimples{
	public String Dica;

	
	// Criando o constructor 
	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		Dica = dica;
	}

	public String aplicarQuestao() {
		return "Q: " +super.getEnunciado()+
				"\n DICA: "+this.Dica;
	}

	// Gets and setters

	public String getDica() {
		return Dica;
	}

	public void setDica(String dica) {
		Dica = dica;
	}
}
