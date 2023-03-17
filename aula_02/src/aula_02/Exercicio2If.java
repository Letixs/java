package aula_02;

import java.util.Scanner;

public class Exercicio2If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		if (num%2 == 0)
			System.out.print("O número " + num + " é par e");
		else 
			System.out.print("O número " + num + " é ímpar e");
		
		if (num > 0)
			System.out.print(" positivo!");
		else
			System.out.print(" negativo!");
		
		leia.close();
		
	}

}