import java.util.Scanner;

public class Cex2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int n, i, soma=0, pares=0;
		
		System.out.println("Informe um número n: ");
		n = teclado.nextInt();
		
		for(i = 2; i <= n; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println(" - " + i);
				soma = soma + i;
				
			}
				
		}
		
	
		System.out.println("\nA soma é: " + soma);
		
		teclado.close();
				

	}

}
