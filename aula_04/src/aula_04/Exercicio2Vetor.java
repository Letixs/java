package aula_04;

import java.util.Scanner;

public class Exercicio2Vetor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int vetorInt [] = new int[10];
		float soma = 0;
		String indiceImpar = "";
		String elementoPar = "";
		
		for (int i = 0; i < vetorInt.length; i++) {
			
			System.out.println("Digite um número: ");
			vetorInt[i] = scanner.nextInt();
			
			if(i%2 != 0)
				indiceImpar += vetorInt[i] + " ";
			
			if(vetorInt[i]%2 == 0)
				elementoPar += vetorInt[i] + " ";
			
			soma += vetorInt[i];
			
		}
		
		System.out.println("Elementos nos índices ímpares: " + indiceImpar);
		System.out.println("Elementos pares: " + elementoPar);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma/vetorInt.length);
		
		scanner.close();
	}

}
