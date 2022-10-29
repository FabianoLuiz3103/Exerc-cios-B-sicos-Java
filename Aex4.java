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
		
		System.out.println("Informe a altura do azuleijo em centímetros: ");
		altzu = teclado.nextFloat();
		
		System.out.println("Informe a largura do azuleijo em centímetros: ");
		largzu = teclado.nextFloat();
		
		multp = altp * largp;
		
		multzu = altzu * largzu;
		
		quantidade = multp / multzu;
		
		
		System.out.println("A área da parede é de: " + multp + "m²;");
		
		System.out.println("A área do azuleijo é de: " + multzu + "cm²;");
		
		System.out.println("A quantidade necessária de azuleijos cobrir essa parede é: " + quantidade + " unidades!");
		
		
		
		
		
		teclado.close();
		

	}

}
