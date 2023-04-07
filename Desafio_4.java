package DesafiosFor;

public class Desafio_4 
{
	public static void main(String[] args) 
	{
	//Escreva um programa em Java que imprima todos os números ímpares de 1 a 20 usando um loop for.
		
		
		for (int i = 1; i <= 20; i++)
		{
			if (i % 2 != 0)
			{
				System.out.printf("Numero impar = %d. ", i);
			}
		}
		
	}

}
