import java.util.Scanner;

public class Cex1 
{

	public static void main(String[] args) 
	{

      Scanner teclado = new Scanner(System.in);
      
      int n, i, pri;
      
      System.out.println("Informe um n�mero (N > 1): ");
      n = teclado.nextInt();
      
      pri=0;
      for(i = 1; i <= n; i++) 
    	  
    	  if(n % i == 0) 
    		  pri++;
      
      if(pri == 2) 
    	  
    	  System.out.println(n + " � um n�mero primo!");
      else
    	  System.out.println(n + " N�o � um n�mero primo!");
      
    		  
      
      teclado.close();
      
      

	}

}
