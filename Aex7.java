import java.util.Scanner;

public class Aex7 
{

	public static void main(String[] args) 
	{
       Scanner teclado = new Scanner(System.in);
       
       int dias, meses, anos, anosdias, mesesdias, TotalDias;
       
       System.out.println("Insira quantos anos, meses e dias você tem: ");
       
       System.out.println("\nInsira os anos: ");
       anos = teclado.nextInt();
       
       System.out.println("\nInsira os meses: ");
       meses = teclado.nextInt();
       
       System.out.println("\nIsira os dias: ");
       dias = teclado.nextInt();
       
       anosdias = anos * 365;
       
       mesesdias = meses * 30;
       
      
       TotalDias = anosdias + mesesdias + dias;
       
       
       System.out.println("\nVocê tem: " + anos + " anos, " + meses + " meses e " + dias + " dias!");
       
       System.out.println("\nO total de dias que você tem de vida é: " + TotalDias + " dias!");
       
       teclado.close();

	}

}
