package model;

public class Horista extends Funcionario {
	private float valorHora;
	private double numeroHoras;
	
	
	public Horista(int numRegistro, String nome, float valorHora, double d) {
		super(numRegistro, nome);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public double getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	@Override
	public double calcularSalario() {
		return this.valorHora * this.numeroHoras;
	}
	
	
}
