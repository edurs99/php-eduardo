public class QuestaoMultiplaEscolha extends QuestaoSimples{
	
	public String altA;
	public String altB;
	public String altC;
	public String altD;

	
	// Constructor
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String altA, String altB, String altC,
			String altD) {
		super(enunciado, resposta);
		this.altA = altA;
		this.altB = altB;
		this.altC = altC;
		this.altD = altD;
	}
	
	// metodo de apllcar a questao
	public String aplicarQuestao() {
		return "Q: "+super.enunciado+"\n"+
				" a) "+altA+"\n"+
				" b) "+altB+"\n"+
				" c) "+altC+"\n"+
				" d) "+altD;
	

	}
	// getters and setters;

	public String getAltA() {
		return altA;
	}

	public void setAltA(String altA) {
		this.altA = altA;
	}

	public String getAltB() {
		return altB;
	}

	public void setAltB(String altB) {
		this.altB = altB;
	}

	public String getAltC() {
		return altC;
	}

	public void setAltC(String altC) {
		this.altC = altC;
	}

	public String getAltD() {
		return altD;
	}

	public void setAltD(String altD) {
		this.altD = altD;
	}
	
	
}	
	
	