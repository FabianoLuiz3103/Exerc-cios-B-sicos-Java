import java.util.Scanner;

public class Cex3
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int n, i;
		
		System.out.println("Informe um número n: ");
		n = teclado.nextInt();
		
		for(i = n; i <= 9999; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println(" = " + i);
			}
			
		}

		teclado.close();
		
	}

}
