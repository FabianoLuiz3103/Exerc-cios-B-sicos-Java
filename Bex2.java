import java.util.Scanner;

public class Bex2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double media1, media2, mediafinal;
		
		System.out.println("Informe a média do 1ºSemestre: ");
		media1 = teclado.nextDouble();
		
		System.out.println("Informe a média do 2ºSemestre: ");
		media2 = teclado.nextDouble();
		
		mediafinal = 0.4 * media1 + 0.6 * media2;
		
		if(mediafinal <= 3.9) {
			
			System.out.println("Nota: " + mediafinal + " Você está reprovado!");
		}
		else
		if(mediafinal <= 5.9) {
			
			System.out.println("Nota: " + mediafinal + " Você está de exame!");
		}
		else {
			
			System.out.println("Nota: " + mediafinal + " Você está aprovado!");
			System.out.println("PARABÉNS!!!!!!!!");
		}

		
		
		
		
		
		teclado.close();

	}

}
