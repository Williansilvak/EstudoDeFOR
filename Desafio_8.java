package DesafiosFor;

public class Desafio_8 
{
	public static void main(String[] args) 
	{
	//Escreva um programa em Java que encontre o menor número de uma lista de 10 números usando um loop for.

		// Declaração do array de números
        int[] numeros = { 9, 2, 6, 1, 8, 5, 7, 4, 10, 3 };
        
        // Inicialização da variável menor com o primeiro elemento do array
        int menor = numeros[0];
        
        // Loop for para percorrer o array e encontrar o menor número
        for (int i = 1; i < numeros.length; i++) 
        {
            if (numeros[i] < menor) 
            {
                menor = numeros[i];
            }
        }
        
        // Exibição do menor número encontrado
        System.out.println("O menor número da lista é: " + menor);

	}

}
