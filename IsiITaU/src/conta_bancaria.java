public class conta_bancaria {
	private int conta;
	private String nome_titular;
	private String cpf;
	private double saldo;

	
	public String exibirProduto() {
		String resultado = "Numero da Conta/Titular "+conta+" ("+nome_titular+") \nCPF do Titular: "+cpf+" Saldo R$ "+saldo;
		return resultado;
	}
		
	public boolean sacar(double saque) {
		if (saldo >= saque) {
			saldo = saldo - saque;
			return true;
		} else {
			return false;
		}
	}
	public void depositar(double valor) {
		saldo =saldo + valor;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
