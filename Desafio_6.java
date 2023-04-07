package DesafiosFor;

public class Desafio_6 
{
	public static void main(String[] args) 
	{
	//Escreva um programa em Java que imprima a média dos números de 1 a 10 usando um loop for.
		
		 int soma = 0;
	        for (int i = 1; i <= 10; i++) {
	            soma += i;
	            System.out.printf("soma = %d resultado = %d ",i,soma);
	        }
	        double media = soma / 10;
	        System.out.printf("A media dos numeros de 1 a 10 e: %s ", media);
		
	}

}
