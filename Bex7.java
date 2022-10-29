import java.util.Scanner;

public class Bex7 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int n, i;
		long fat;
		
		System.out.println("Informe um número n naural para saber o fatorial do mesmo: ");
		n = teclado.nextInt();
		
		fat = 1;
		for(i = 1; i <= n; i++) {
			
			fat = fat * i;
			
		}

		System.out.println("O fatorial de " + n + " é: " + fat);
		
		teclado.close();
		
	}

}
