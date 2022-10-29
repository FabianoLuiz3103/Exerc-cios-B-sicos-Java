import java.util.Scanner;

public class Bex9 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int i=1, n, fat, vezes, lp;
		
	  System.out.println("Quantas vezes quer calcular o fat de n: ");
	  vezes = teclado.nextInt();
	  
	  lp = 0;
	  while(lp < vezes ) {
		  
		  System.out.println("Informe o valor de n: ");
		  n = teclado.nextInt();
		  
		  fat = 1;
		  for(i = n; i > 1; i--) 
			  
			  fat =  fat * i;
		  
		  System.out.println(n + "! é: " + fat);
		  
		  lp++;
		  
	  }
	    	
	  teclado.close();
	    
	}

}
