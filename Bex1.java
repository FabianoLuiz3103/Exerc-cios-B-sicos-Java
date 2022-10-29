import java.util.Scanner;

public class Bex1 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int n, ant, suc;
		
		System.out.println("Informe um número n: ");
		n = teclado.nextInt();
		
		ant = n-1;
		
		suc = n+1;
		
		System.out.println("\nO antecessor de " + n + " é: " + ant);
		
		System.out.println("\nO sucessor de " + n + " é: " + suc);
		
		System.out.println("\n..." + ant + ", " + n + ", " + suc + "...");
		
		teclado.close();
		

	}

}
