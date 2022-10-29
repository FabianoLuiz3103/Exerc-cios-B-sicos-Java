import java.util.Scanner;

public class Cex7
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int a;
		int b;
		int soma;
		
		System.out.println("Insira um valor para A: ");
		a = teclado.nextInt();
		
		System.out.println("Insira um valor para B: ");
		b = teclado.nextInt();
		
		maimen(a, b, soma=0);

	}
	static void maimen(int a, int b, int soma) {
		
		if(a > b) 
			 
			System.out.println("\nO maior número é: " + a);
		
		else
			System.out.println("\nO maior número é: " + b);
		
		if(b < a)
			
			System.out.println("\nO menor número é: " + b);
		else
			
			System.out.println("\nO menor número é: " + a);
		
	soma = a + b;
	
	System.out.println("\nA soma dos números inseridos é: " + soma);
	}

}
