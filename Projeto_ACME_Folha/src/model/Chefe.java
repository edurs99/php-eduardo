package model;


public class Chefe extends Funcionario{
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	float salario;
	
	public Chefe(int numRegistro, String nome, double d, double e, double f) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficioTerno() {
		return beneficioTerno;
	}
	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	@Override
	public double calcularSalario() {
		salario = (this.salarioBase * this.adicionalFuncao/100) + this.beneficioTerno;
		return salario;
	}
	
	
}
