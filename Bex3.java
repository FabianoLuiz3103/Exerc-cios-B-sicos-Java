import java.util.Scanner;

public class Bex3
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, menor, maior, medio;
		
		System.out.println("Insira um valor para A: ");
		a = teclado.nextInt();
		
		System.out.println("Insira um valor para B: ");
		b = teclado.nextInt();
		
		System.out.println("Insira um valor para C: ");
		c = teclado.nextInt();
		
		
		if((a >= b)&&(b >= c)){
			
			System.out.println("A ordem crescente �: " + c + ", " + b + ", " + a + "!");		
			
		}
		if((a >= c)&&(c >= b)) {
			
			System.out.println("A ordem crescente �: " + b + ", " + c + ", " + a + "!");
		}
		if((b >= a)&&(a >= c)) {
			
			System.out.println("A ordem crescente �: " + c + ", " + a + ", " + b + "!");
		}
		if((b >= c)&&(c >= a)) {
			
			System.out.println("A ordem crescente �: " + a + ", " + c + ", " + b + "!");
		}
		if((c >= b)&&(b >= a)) {
			
			System.out.println("A ordem crescente �: " + a + ", " + b + ", " + c + "!");
		}
	    if((c >= a)&&(a >= b)) {
	    	
	    	System.out.println("A ordem crescente �: " + b + ", " + a + ", " + c + "!");
	    }
	    
	    ///////////// c�digo mais limpo com isso: ////////////////////////
		
	    menor = Math.min(a, Math.min(b,c));
	    maior = Math.max(a, Math.max(b, c));
	    
	    medio = a + b + c - menor - maior;
	    
	    System.out.println("A ordem crescente �: " +  menor + ", " + medio + ", " + maior + "!");
	    
	    
		
		
		
		teclado.close();
	}

}
