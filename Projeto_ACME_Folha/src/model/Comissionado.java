package model;

public class Comissionado extends Funcionario {
		private double salarioBase;
		private double commissao;
		
		
		public Comissionado(int numRegistro, String nome, double salarioBase, double commissao) {
			super(numRegistro, nome);
			this.salarioBase = salarioBase;
			this.commissao = commissao;
		}
		public double getSalarioBase() {
			return salarioBase;
		}
		public void setSalarioBase(Float salarioBase) {
			this.salarioBase = salarioBase;
		}
		public double getCommissao() {
			return commissao;
		}
		public void setCommissao(Float commissao) {
			this.commissao = commissao;
		}
		
		@Override
		public double calcularSalario() {
			
			return this.salarioBase = this.salarioBase * this.commissao/100;
		}
		
}
