import java.util.Scanner;

public class Bex6 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		boolean sair = false;
		
		
		do {
			System.out.println("\nDigite (1) para exibir o valor de PI;");
			System.out.println("Digite (2) para exibir o valor de Euler;");
			System.out.println("Digite (3) para sair.");
			System.out.println("\nEscolha uma op��o: ");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			
			case 1: 
				System.out.println("PI vale: " + Math.PI);
			break;
			
			case 2: 
				System.out.println("Euler vale: " + Math.E);
			break;
			
			case 3:
				sair = true;
				System.out.println("FIM DA EXECU��O!! ");
			break;
			
			default:
				System.out.println("OP��O INV�LIDA!! ");
			
			}
			
		}while(sair == false);
		
		teclado.close();

	}

}
