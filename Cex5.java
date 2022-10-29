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
			
			System.out.println("\nOpção (a): Consultar saldo;");
			System.out.println("Opção (b): Saque;");
			System.out.println("Opção (c): Depósito;");
			System.out.println("Opção (d): Sair.");
			System.out.println("\nEscolha sua opção:");
			opcao = teclado.next();
			
			switch(opcao.charAt(0)) {
			
			case 'a': case 'A':
				
				System.out.println("\tExtrato R$" + extrato);
				
				break;
			
			case 'b': case 'B':
				
				System.out.println("\nInforme o valor para saque: ");
				saque = teclado.nextDouble();
				
				 extrato = extrato - saque;
				 
				 System.out.println("\n\tO extrato pós saque é: " + extrato);
				
				break;
				
			case 'c': case 'C':
				
				System.out.println("\nInforme o valor a ser depositado: ");
				deposito = teclado.nextDouble();
				
				extrato = extrato + deposito;
				
				System.out.println("\n\tO extrato pós deposito é: " + extrato);
				
				break;
		
			case 'd': case 'D': 
				
				sair = true;
				
				System.out.println("\nFIM DA EXECUÇÃO!!");
				
				break;
				
			default:
				
				System.out.println("\nOPÇÃO INVÁLIDA!!");
				
			    
			}
			
			
			
			
				
				
			
		}while(sair == false);
		
		
		teclado.close();

	}

}
