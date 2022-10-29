import java.util.Scanner;

public class Aex9 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double n, rej;
		
		System.out.println("Informe um saldo n: ");
		n = teclado.nextDouble();
		
		rej = n * 1.01;
		
		
		System.out.println("O valor com o reajuste de 1% é de: " + rej);
		
		
		
		teclado.close();
		

	}

}
