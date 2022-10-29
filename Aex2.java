import java.util.Scanner;

public class Aex2 
{
    public static final int PESSOAS = 10;
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		float altura, maioraltura= 0, menoraltura= 10000000, mediaH, somaH=0;
		int sexo, numH=0, numM=0, i;
		
		for(i = 1; i <= PESSOAS; i++) {
			
			System.out.println("Informe a altura da " + i + "º pessoa:");
			altura = teclado.nextFloat();
			
			System.out.println("DIGITE 1 - para Homem && 2 - para Mulher");
			System.out.println("Informe o sexo da " + i + "º pessoa: ");
			sexo = teclado.nextInt();
			
			if(altura > maioraltura) {
				
				maioraltura = altura;
			}
			else
			if(altura < menoraltura) {
				
				menoraltura = altura;
			}
			if(sexo == 1) {
				
				numH++;
				somaH = somaH + altura;
				
			}
			else
			if(sexo == 2) {
				
				numM++;
				
			}
			else {
				System.out.println("OPÇÃO INVÁLIDA!");
			}
			
			
					
			
		
		}
		
		mediaH = somaH / numH;
		
		System.out.println("A maior altura é: " + maioraltura);
		System.out.println("A menor altura é: " + menoraltura);
		System.out.println("A quantidade de homens é: " + numH);
		System.out.println("A quantidade de mulheres é: " + numM);
		System.out.println("A média de altura dos homens é: " + mediaH);
		
		
		teclado.close();

	}

}
