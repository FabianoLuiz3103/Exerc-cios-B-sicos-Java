package Java.Nano;

import java.util.Scanner;

public class Estud 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, soma;
		String opcao;
		
		do 
		{
			

		System.out.println("Insira n1: ");
		n1 = teclado.nextInt();
		
		System.out.println("Insira n2: ");
		n2 = teclado.nextInt();
		
		soma = n1 + n2;
		System.out.println("\nA soma �: " + soma);
		
		System.out.println("Deseja repetir a opera��o? (S/N)");
		opcao = teclado.next();
		
		if(opcao.equals("N")) {
			
			System.out.println("FIM DA EXECU��O! ");
		}
		
		}while(opcao.equals("S"));
		
		teclado.close();
	}

}
