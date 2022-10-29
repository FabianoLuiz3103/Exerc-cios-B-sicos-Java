import java.util.Scanner;

public class Cex8 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Insira um valor para A: ");
		a = teclado.nextInt();
		
		System.out.println("Insira um valor para B: ");
		b = teclado.nextInt();
		
		System.out.println("Insira um valor para C: ");
		c = teclado.nextInt();
		
		System.out.println("O menor valor é: " + tres(a, b, c));
		
		
		teclado.close();

	}
	
	static double tres(double a, double b, double c) {
		
		
		return Math.min(Math.min(a, b), c);
		
		
	}
	

}
