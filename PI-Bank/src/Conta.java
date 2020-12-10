public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroConta;
	protected double saldo;
	
	public Conta (int numeroConta, String nomeTitular, String cpf,double saldo ) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Conta: " + numeroConta + "/" + nomeTitular+"(" + cpf+ ") R$ " +String.format("%.2f",saldo); 
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	public void creditar(double valor) {
			this.saldo = saldo + valor;
	}
}
