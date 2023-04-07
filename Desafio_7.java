package DesafiosFor;

public class Desafio_7 
{
	public static void main(String[] args) 
	{
	//Escreva um programa em Java que encontre o maior número de uma lista de 10 números usando um loop for.
		
		int maior = 0;
		int result = maior;
		
		for (int i = 58; i >= 0; i--)
		{			
		if (i > result)
		{
			result = i;	
			
		}		
		}
		System.out.println(result);


		
	}

}
