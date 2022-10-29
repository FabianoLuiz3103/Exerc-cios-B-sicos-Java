package Java.Nano;

import java.util.Scanner;

public class IMC 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.println("PARA CALCULAR SEU IMC INSIRA SUA ALTURA E PESO: !! ");
		
		System.out.println("\nInsira sua altura: ");
		altura = teclado.nextDouble();
		
		System.out.println("\nInsira seu peso: ");
		peso = teclado.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		if(imc >= 18.5 && imc <= 25)
		{
			System.out.println("Seu IMC �: " + imc);
			System.out.println("\nParab�ns, voc� est� no peso ideal!!" );
			
		}
		else if(imc < 18.5)
		{
			System.out.println("Seu IMC �: " + imc);
			System.out.println("\nVoc� est� abaixo do peso! ");
		}
		else
		{
			System.out.println("Seu IMC �: " + imc);
			System.out.println("\nVoc� est� acima do peso! ");
		}
		
		teclado.close();
	
	}

}
