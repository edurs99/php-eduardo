
public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;
	
	void imprimir() {
		System.out.println("___carro___");
		System.out.println("Marca: "+marca+"/"+modelo);
		System.out.println("Äno: "+ano+" Cor: "+cor);
		System.out.println("Preço: R$" +preco);
	}
}
