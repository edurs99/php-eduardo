
public class Bomba {
	private String nome;
	private double valor_litro;
	private double qtde_litros;
	private double valor_total;

	public void abastecer_litros(double litros) {
		qtde_litros = litros;
		valor_total = qtde_litros * valor_litro;
	}

	public void abastecer_grana(double grana) {
		this.valor_total = grana ;
		this.qtde_litros = this.valor_total / this.valor_litro;
	// qdo o nome do atributo é igual ao nome do parametro, eu tenho q usar o this.
	}
	public String exibirRecibo() {
		String recibo      = "=======================================\n"+
							  "I S I D R O C O R P - Gas  & Energy\n" +
							  "=======================================\n"+
							  "Recibo de Pagamento \n"+
							  "Combustivel: "+nome+"\n"+
							  "Preço do Litro R$ "+String.format("%.3f",valor_litro)+"\n"+
							  "Litros Abastecidos: "+String.format("%.3f",qtde_litros)+"\n"+
							  "Total a Pagar  R$ "+String.format("%.2f",valor_total)+"\n";
		return recibo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor_litro() {
		return valor_litro;
	}

	public void setValor_litro(double valor_litro) {
		this.valor_litro = valor_litro;
	}

	public double getQtde_litros() {
		return qtde_litros;
	}

	public void setQtde_litros(double qtde_litros) {
		this.qtde_litros = qtde_litros;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
}

