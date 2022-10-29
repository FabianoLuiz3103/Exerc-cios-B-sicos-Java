import java.util.Scanner;

public class Bex5 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int i, n;
		
		
		i = 1;
		
		do {
			
			System.out.println("Informe um valor de n: ");
			n = teclado.nextInt();
			
			i++;
			
			
			
		}while(n <= 0 && i <= 3);
		
		if(i <= 3)
			
			System.out.println("N: " + n);
		
		else 
			System.out.println("Nº de tentativas excedido");
		

		
		teclado.close();
	}

}
