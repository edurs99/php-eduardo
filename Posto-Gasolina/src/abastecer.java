
public class abastecer {
	public static void main(String[] args) {
		Bomba cliente1, cliente2;	
		
		cliente1 = new Bomba();
		cliente2 = new Bomba();
		
		cliente1.setNome("Gasolina");
		cliente1.setValor_litro(4.12);
		
		cliente2.setNome("Alcool");
		cliente2.setValor_litro(3.19);
		cliente2.setValor_total(30);
		
		System.out.println("=======Completando o tanque==========");
		cliente1.abastecer_litros(50);
		System.out.println(cliente1.getValor_total());
		
		
		System.out.println("=======Pagando em dinheiro==========");
		cliente2.abastecer_grana(30);
		System.out.println(cliente2.getValor_total());
		
		System.out.println(cliente1.exibirRecibo());
		System.out.println(cliente2.exibirRecibo());
		
	}
}
