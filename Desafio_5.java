package DesafiosFor;

public class Desafio_5 
{
	public static void main(String[] args) 
	{
	//Escreva um programa em Java que imprima todos os números pares de 10 a 30 usando um loop for.
		
		for (int i = 1; i <= 30; i++)
		{
			if (i % 2 == 0)
			{
				System.out.printf("Numeros pares = %d. ", i);
			}
		}
		
	}

}
