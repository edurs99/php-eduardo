
public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	void imprimir() {
		System.out.println("Empregado: " +nome);
		System.out.println("Cargo: " +cargo);
		System.out.printf("Salario R$ %.2f%n ", salario);
		
	}
	
	void aumentarSalario(double percentual) {
		salario = salario + salario*percentual/100;
	}
}
