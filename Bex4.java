import java.util.Scanner;

public class Bex4 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int a, b, soma=0, mult=1, i, par=0, impar=0;
		
		System.out.println("Informe o valor de A: ");
		a = teclado.nextInt();
		 
		System.out.println("Informe o val�or de B: ");
		b = teclado.nextInt();
		
		for(i = a; i <= b; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println("\nPar: " + i);
				
				soma = soma + i;
			}
			if(i % 2 == 1) {
				
				System.out.println("\n�mpar: " + i);
				
				mult = mult * i;
			}
		}
		
		//System.out.println("Os pares s�o: " + par);
		System.out.println("\nA soma dos n�meros pares resulta em: " + soma);
		
		//System.out.println("Os �mpares s�o: " + impar);
		System.out.println("\nA multiplica��o dos n�meros �mpares resulta em: " + mult);
		
		

	}

}
