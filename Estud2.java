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
	    	System.out.println("Informe a " + i + " � nota: ");
	    	notas[i] = teclado.nextInt();
	    	soma = soma + notas[i];
	    	media = soma/notas.length;
	    }
	    
	    System.out.println("A m�dia �: " + media);
	    
	    teclado.close();
	}

}

//For-each
//O  primeiro  par�metro  �  o  tipo  do array.O  segundo  �  um  nome  para  a vari�vel que vai  receber cada um dos itens do vetor. O �ltimo par�metro, que est� ap�s os dois pontos
//(:) � oarray que queremos percorrer.