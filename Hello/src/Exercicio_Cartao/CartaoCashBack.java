package Exercicio_Cartao;

public class CartaoCashBack extends CartaoPrePago{
	
	public int tipo;
	
	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	public boolean comprar (double valor) {
		if (super.saldo >= valor) {
			super.saldo = saldo - valor;
			if (tipo == 0) {
				super.saldo = super.saldo + valor * 0.08;
			}
			else if (tipo == 1) {
				super.saldo = super.saldo + valor * 0.05;
			}
			else if (tipo == 2) {
				super.saldo = super.saldo + valor * 0.02;
			}	
			return true;
			}
			return false;
			
		}
	public String toString() {
		return "Numero Cartao: " + numeroCartao + "/" + nomeTitular+"(Ano Validade: " + anoValidade+ ") (Mes Validade: " +mesValidade + ") Saldo R$ " +String.format("%.2f",saldo) + "Tipo: " + tipo; 
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
