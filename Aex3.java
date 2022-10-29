import java.util.Scanner;

public class Aex3 
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	
	int n, i;
	float salario, menor=9999999, maiorsal=-999999, mediasal=0, folha=0;
	
	System.out.println("Informe a quantidade de trabalhadores desejada: ");
	n = teclado.nextInt();
	
	for(i = 1; i <= n; i++) {
		
		System.out.println("Informe o salário do " + i + "º trabalhador:");
		salario = teclado.nextFloat();
		
		if(salario > maiorsal) {
			
			maiorsal = salario;
		}
			if(salario < menor) {
				
				menor = salario;
			}
		
		folha = folha + salario;
		
		mediasal = folha / n;
		
	}
	
	System.out.println("O maior salário é: " + maiorsal);
	System.out.println("O menor salário é: " + menor);
	System.out.println("A folha salarial é: " + folha);
	System.out.println("A média salarial é: " + mediasal);

	
	teclado.close();
	}

}
