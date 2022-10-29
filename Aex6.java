import java.util.Scanner;

public class Aex6
{

	public static void main(String[] args) 
	{
	Scanner teclado = new Scanner(System.in);
	
	double cavalos, m, h, s;
	
	System.out.println("Informe o valor da massa em quilogramas: ");
	m = teclado.nextDouble();
	
	System.out.println("Informe o valor da altura em metros: ");
	h = teclado.nextDouble();
	
	System.out.println("Informe a quantidade de tempo em segundos: ");
	s = teclado.nextDouble();
	
	cavalos = (m * h / s)/745.6999;
	
	System.out.println("A quantidade de cavalos necessária é: " + cavalos);
	
	teclado.close();

	}

}
