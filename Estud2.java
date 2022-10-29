package Java.Nano;

import java.util.Scanner;

public class Estud2 
{
	
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		int[] notas = new int[10];
	    int i, media = 0, soma = 0;
	    
	    for(i = 0; i < notas.length; i++)
	    {
	    	System.out.println("Informe a " + i + " ª nota: ");
	    	notas[i] = teclado.nextInt();
	    	soma = soma + notas[i];
	    	media = soma/notas.length;
	    }
	    
	    System.out.println("A média é: " + media);
	    
	    teclado.close();
	}

}

//For-each
//O  primeiro  parâmetro  é  o  tipo  do array.O  segundo  é  um  nome  para  a variável que vai  receber cada um dos itens do vetor. O último parâmetro, que está após os dois pontos
//(:) é oarray que queremos percorrer.