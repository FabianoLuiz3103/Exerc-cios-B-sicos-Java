import java.util.Scanner;

public class Bex4 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int a, b, soma=0, mult=1, i, par=0, impar=0;
		
		System.out.println("Informe o valor de A: ");
		a = teclado.nextInt();
		 
		System.out.println("Informe o valçor de B: ");
		b = teclado.nextInt();
		
		for(i = a; i <= b; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println("\nPar: " + i);
				
				soma = soma + i;
			}
			if(i % 2 == 1) {
				
				System.out.println("\nÍmpar: " + i);
				
				mult = mult * i;
			}
		}
		
		//System.out.println("Os pares são: " + par);
		System.out.println("\nA soma dos números pares resulta em: " + soma);
		
		//System.out.println("Os ímpares são: " + impar);
		System.out.println("\nA multiplicação dos números ímpares resulta em: " + mult);
		
		

	}

}
