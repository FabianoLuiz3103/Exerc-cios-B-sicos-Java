import java.util.Scanner;

public class Aex1 
{

	public static void main(String[] args) 
	{
	   Scanner teclado = new Scanner(System.in);
	   
	   double c, f, k, Re, Ra;
	   
	   System.out.println("Insira a temperatura em Celsius: ");
	   c = teclado.nextDouble();
	   
	   f = c * 1.8 + 32;
	   
	   k = c + 273.15;
	   
	   Re = c * 0.8;
	   
	   Ra = c * 1.8 + 32 + 459.67;
	   
	   System.out.println("A temperatura em F �: " + f + "�");
	   System.out.println("A temperatura em K �: " + k + "�");
	   System.out.println("A temperatura em Re �: " + Re + "�");
	   System.out.println("A temperatura em Ra �: " + Ra + "�");
	   
	   teclado.close();

	}

}
