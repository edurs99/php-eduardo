import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		int a,b,r;
		
		try {
			
			System.out.println("Digite um valor: ");
			a =teclado.nextInt();
			System.out.println("Digite outro valor: ");
			b = teclado.nextInt();
		
			r = a/b;
		
			System.out.println("Resultado da divisao =  "+r);
			teclado.close();
			}
		catch (InputMismatchException ex) {
			System.out.println("Digite um numero ");
			
		}
		catch(Exception ex) {
			System.out.println("Deu ruim ");
			
		}
	}
}
