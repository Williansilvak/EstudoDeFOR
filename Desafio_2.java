package DesafiosFor;

import java.util.Scanner;

public class Desafio_2 
{
	public static void main(String[] args) 
	{
	//Escreva um programa em Java que imprima a tabuada do número 5 usando um loop for.
		
		int a = 1;
		int x = 0;
		int total = 5;
		
		System.out.println("O numero é" + total);
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < a; i++)
		{
			System.out.println("Digite o numero que vai dividir por "+ total);
			x = teclado.nextInt();
			total = total * x;
			
		}

		System.out.println(total);

		teclado.close();
		
		
	}

}
