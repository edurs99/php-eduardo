public class banco {
	public static void main(String[] args) {
		conta_bancaria c1, c2;
		
		c1 = new conta_bancaria();
		c2 = new conta_bancaria();
		
		c1.setConta(12345);
		c1.setNome_titular("Eduardo Rodrigues");
		c1.setCpf("333.333333-33");
		c1.depositar(100);
		
		c2.setConta(344556);
		c2.setNome_titular("Bill Gates");
		c2.setCpf("444.444.44-44");
		c2.depositar(100000);
		
		System.out.println("========Realizando um Saque============");
		System.out.println(c1.exibirProduto());
		System.out.println(c2.exibirProduto());
		
	
		System.out.println("========Realizando um Saque============");
		
		boolean r;
		r = c1.sacar(50);
		if (r == true) {
			System.out.println("========Saque autorizado============");
		}
		else {
			System.out.println("========Saque nao permitido============");
		}
		
		System.out.println(c1.exibirProduto());
		System.out.println("Realizando um deposito");
		System.out.println(c2.exibirProduto());
		
	}
}
