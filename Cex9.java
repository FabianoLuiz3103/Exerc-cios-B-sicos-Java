import java.util.Scanner;

public class Cex9 
{
    public static final double DIV = 3;
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c, soma=0, media=0;
		
		System.out.println("Insira o valor de A: ");
		a = teclado.nextDouble();
		
		System.out.println("Insira o valor de B: ");
		b = teclado.nextDouble();
		
		System.out.println("Insira o valor de C: ");
		c = teclado.nextDouble();
		
		media(a,b,c,soma,media);
		
		teclado.close();

	}
	
	static void media(double a, double b, double c, double soma, double media) {
		
		soma = a + b + c;
		
		System.out.println("\nA soma é: " + soma);
		
		media = soma/DIV;
		
		System.out.println("\nA média dos números é: " + media);
	}

}
