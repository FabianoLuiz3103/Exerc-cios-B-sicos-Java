import java.util.Scanner;

public class Bex2 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double media1, media2, mediafinal;
		
		System.out.println("Informe a m�dia do 1�Semestre: ");
		media1 = teclado.nextDouble();
		
		System.out.println("Informe a m�dia do 2�Semestre: ");
		media2 = teclado.nextDouble();
		
		mediafinal = 0.4 * media1 + 0.6 * media2;
		
		if(mediafinal <= 3.9) {
			
			System.out.println("Nota: " + mediafinal + " Voc� est� reprovado!");
		}
		else
		if(mediafinal <= 5.9) {
			
			System.out.println("Nota: " + mediafinal + " Voc� est� de exame!");
		}
		else {
			
			System.out.println("Nota: " + mediafinal + " Voc� est� aprovado!");
			System.out.println("PARAB�NS!!!!!!!!");
		}

		
		
		
		
		
		teclado.close();

	}

}
