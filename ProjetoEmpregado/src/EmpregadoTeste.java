
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1 = new Empregado();
		
		e1.nome = "Isidro";
		e1.cargo = "Professor";
		e1.salario = 10000.00;
		
		System.out.println("Salario antes do aumento");
		e1.imprimir();
		System.out.println("====================================================");
		System.out.println("Aumentando o salario");
		e1.aumentarSalario(15.0);
		System.out.println("====================================================");
		System.out.println("Ordenado depois do aumento");
		e1.imprimir();
		System.out.println("====================================================");
		System.out.println("mostrando so o salario = "+e1.salario);
	}
}
