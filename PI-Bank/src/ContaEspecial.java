
public class ContaEspecial extends Conta{

	public double limite;
	
	public boolean debitar (double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = saldo - valor;
			return true;
		}
			return false;
			
		}
		public double getLimite() {
			return limite;
		}
		public void setLimite(double limite) {
			this.limite = limite;
		}
	public String toString() {
		return "Conta Especial :"+super.numeroConta + " / "+super.nomeTitular+" (" + 
				super.cpf +" ) R$ "+String.format("%.2f", super.saldo) +" Limite R$ " + 
				String.format("%.2f",this.limite) + " Valor Disponivel " + String.format("%.2f", saldo+limite);
	
	}
	public ContaEspecial(int numeroConta, String nomeTitular, String cpf, double saldo, double limite) {
		super(numeroConta, nomeTitular, cpf, saldo);
		this.limite = limite;
	}
		
}
