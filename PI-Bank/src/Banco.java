
public class Banco {
	public static void main(String[] args) {
		Conta c1 = new Conta(1234,"Adalberto Fonseca","123.456.678-00",100);

	//	c1.setNumeroConta(1234);
	//	c1.setNomeTitular("Adalbeto Fonseca");
	//	c1.setCpf("123.456.789-00");
		
		System.out.println(c1);
		
		ContaEspecial c2 = new ContaEspecial(5678,"Claudio Ribeiro", "334.333.33.3.33", 100, 500);
	//	c2.setNomeTitular("Jose Sousa Silva");
	//	c2.setNumeroConta(9876);
	//	c2.setCpf("123.32122.123-00");
	//	 c2.setLimite(500);
	//	c2.creditar(200);
		
		System.out.println(c2);
		
		if (c1.debitar(100)) {
			System.out.println("Debito nao autorizado na conta "+c1.getNumeroConta());
		}
			else {
				System.out.println("Saldo insuficiente na conta " +c1.getNumeroConta());
			}
		
		if (c2.debitar(600)) {
			System.out.println("Debito autorizado na conta "+c2.getNumeroConta());
		}
		else {
			System.out.println("Saldo insuficiente na conta " +c2.getNumeroConta());
		}
		System.out.println(c1);
		System.out.println(c2);
	
	}
	
	}
