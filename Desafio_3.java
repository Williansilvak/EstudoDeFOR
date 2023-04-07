package DesafiosFor;

import java.util.Scanner;

public class Desafio_3 
{
	public static void main(String[] args) 
	{
    //Escreva um programa em Java que imprima a soma dos números de 1 a 100 usando um loop for.

		int soma = 0;
		int total = 0;
		int i = 0;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		soma =  teclado.nextInt();
		
		for (i = 0; i <= 100; i++)
		{			
			total = i + soma;
			System.out.printf("%d + %d Resultado = %d. ",i,soma,total);
		}	
		
		teclado.close();
		
	
		
	}

}
