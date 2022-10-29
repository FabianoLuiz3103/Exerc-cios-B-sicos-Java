import java.util.Scanner;

public class Aex5
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		double v, r, a;
		
		System.out.println("Informe o raio da lata em metros: ");
		r = teclado.nextDouble();
		
		System.out.println("Informe a altura da lata em metros: ");
		a = teclado.nextDouble();
		
		v = Math.PI * Math.pow(r, 2) * a;
		
		System.out.println("O volume da lata de óleo é de: " + v + "m³!");
		
		teclado.close();

	}

}
