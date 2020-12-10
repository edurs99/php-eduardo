package userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		/* versao 1.0 - trabalhando com vetores sem redimensionamento
		Funcionario lista[];
		
		lista = new Funcionario[7];
		
		
		// supondo que aqui tenhamos uma rotina de recuperação de um banco de dados;
		lista[0] = new Chefe(1001, "Priscila Coelho", 8500.00, 15.00, 1200.00);
		lista[1] = new Comissionado(1002, "Jose de Almeida", 3850.00, 22.00);
		lista[2] = new Comissionado(1003, "Fabio Alcantara", 2930.00, 31.00);
		lista[3] = new Horista(1004, "Jussara Nunes", 180, 75.32);
		lista[4] = new Horista(1005, "Pedro Neves", 150, 72.47);
		lista[5] = new Empreiteiro(1006, "Waldemar Lopes", 4250.00);
		lista[6] = new Empreiteiro(1007, "Rogerio Silva", 3920.00);
		*/
		
		
		/* versao 2.0 - trabalhando com ArrayLists */
		
		// a notação <Funcionario> parametriza a minha ArrayList
		// dizendo que é possível armazenar objetos do tipo Funcionario e sua descendência
		ArrayList<Funcionario> lista; 
		
		// agora preciso instanciar
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe(1001, "Priscila Coelho", 8500.00, 15.00, 1200.00));
		lista.add(new Comissionado(1002, "Jose de Almeida", 3850.00, 22.00));
		lista.add(new Comissionado(1003, "Fabio Alcantara", 2930.00, 31.00));
		lista.add(new Horista(1004, "Jussara Nunes", 180, 75.32));
		lista.add(new Horista(1005, "Pedro Neves", 150, 72.47));
		lista.add(new Empreiteiro(1006, "Waldemar Lopes", 4250.00));
		lista.add(new Empreiteiro(1007, "Rogerio Silva", 3920.00));
		
		
		
		
		System.out.println(">>>>>> F O L H A     D E   P A G A M E N T O   <<<<<<<");
		System.out.println("------------------------------------------------------");
		
		/* Esta nova modalidade de FOR, a qual chamamos de ForEACH tem um cabeçalho bastante
		 * resumido, pois serve APENAS para percorrer listas
		 * 
		 * como interpretar?
		 * 
		 * for (Funcionario f: lista) --> para cada f do tipo Funcionario pertencente à lista
		 * 
		 * isso substitui o seguinte:
		 * for (int pos=0; pos<lista.length; pos++){
		 *     Funcionario f = lista[pos];
		 *     ....
		 * }
		 * 
		 * 
		 */
		
//		lista.remove(3);
		for (int pos=0; pos < lista.size(); pos++) {
			System.out.println(lista.get(pos).getNome());
		}
		
		
		for (Funcionario f : lista) {
			System.out.printf("%8d - %-30s  R$ %8.2f%n", f.getNumRegistro(), f.getNome(), f.calcularSalario());
		}	
	}

}

//package userinterface;
//
//import model.Chefe;
//import model.Comissionado;
//import model.Empreiteiro;
//import model.Funcionario;
//import model.Horista;
//
//public class FolhaDePagamento {
//	public static void main(String[] args) {
//	
//		Funcionario lista[];
//		lista = new Funcionario[7];
//		
//		lista[0] = new Empreiteiro(1234, "Empreiteiro 01 ", 3500.00);
//		lista[1] = new Chefe(33333, "Joao", 1000, 200, 500);
//		lista[2] = new Horista(33333, "Ana", 200, 160);
//		lista[3] = new Comissionado(222, "nome",200 ,240);
//		lista[4] = new Comissionado(221, "augusto",100 ,340);
//		lista[5] = new Horista(334443, "Priscila", 1200, 160);
//		lista[6] = new Horista(334443, "Antonio", 11200, 1160);
//		
//		
//		System.out.println("==========Folha de Pagamentos=========");
//		System.out.println("--------------------------------------");
//		for (Funcionario cont : lista) {
//		
//	//	for (int cont = 0; cont<funcionarios.length; cont ++) {
//			System.out.println(" Nome: " + cont.getNome() + " Funcional " + cont.getNumRegistro() + " Salario R$ " +cont.calcularSalario());
//		
//		}
////		Funcionario f = new Empreiteiro(1234, "Empreiteiro 01 ", 3500.00);
////		Funcionario xf = new Chefe(33333, "Joao", 1000, 200, 500);
////		Funcionario horeiro = new Horista(33333, "Ana", 200, 160);
////		Funcionario comm = new Comissionado(222, "nome",200 ,240);
////		System.out.println(f.calcularSalario());
////		System.out.println(xf.calcularSalario());
////		System.out.println(horeiro.calcularSalario());
////		System.out.println(comm.calcularSalario());
//		
//		
//	}
//
//}