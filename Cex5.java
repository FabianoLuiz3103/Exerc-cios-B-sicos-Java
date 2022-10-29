import java.util.Scanner;

public class Cex5 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		String opcao;
	    boolean sair = false;
	    double extrato = 0.00, deposito, saque;
		
		
		do {
			
			System.out.println("\nOp��o (a): Consultar saldo;");
			System.out.println("Op��o (b): Saque;");
			System.out.println("Op��o (c): Dep�sito;");
			System.out.println("Op��o (d): Sair.");
			System.out.println("\nEscolha sua op��o:");
			opcao = teclado.next();
			
			switch(opcao.charAt(0)) {
			
			case 'a': case 'A':
				
				System.out.println("\tExtrato R$" + extrato);
				
				break;
			
			case 'b': case 'B':
				
				System.out.println("\nInforme o valor para saque: ");
				saque = teclado.nextDouble();
				
				 extrato = extrato - saque;
				 
				 System.out.println("\n\tO extrato p�s saque �: " + extrato);
				
				break;
				
			case 'c': case 'C':
				
				System.out.println("\nInforme o valor a ser depositado: ");
				deposito = teclado.nextDouble();
				
				extrato = extrato + deposito;
				
				System.out.println("\n\tO extrato p�s deposito �: " + extrato);
				
				break;
		
			case 'd': case 'D': 
				
				sair = true;
				
				System.out.println("\nFIM DA EXECU��O!!");
				
				break;
				
			default:
				
				System.out.println("\nOP��O INV�LIDA!!");
				
			    
			}
			
			
			
			
				
				
			
		}while(sair == false);
		
		
		teclado.close();

	}

}
