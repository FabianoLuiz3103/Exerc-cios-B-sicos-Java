import java.util.Scanner;

public class Aex4 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		float altp, largp, altzu, largzu, quantidade, multp, multzu;
		
		System.out.println("Informe a altura da parede em metros: ");
		altp = teclado.nextFloat();
		
		System.out.println("Informe a largura da parede em metros: ");
		largp = teclado.nextFloat();
		
		System.out.println("Informe a altura do azuleijo em cent�metros: ");
		altzu = teclado.nextFloat();
		
		System.out.println("Informe a largura do azuleijo em cent�metros: ");
		largzu = teclado.nextFloat();
		
		multp = altp * largp;
		
		multzu = altzu * largzu;
		
		quantidade = multp / multzu;
		
		
		System.out.println("A �rea da parede � de: " + multp + "m�;");
		
		System.out.println("A �rea do azuleijo � de: " + multzu + "cm�;");
		
		System.out.println("A quantidade necess�ria de azuleijos cobrir essa parede �: " + quantidade + " unidades!");
		
		
		
		
		
		teclado.close();
		

	}

}
