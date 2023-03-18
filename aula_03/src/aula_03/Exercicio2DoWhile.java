package aula_03;

import java.util.Scanner;

public class Exercicio2DoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		float soma = 0;
		int quant = 0;
		
		do {
			
			System.out.println("Digite um número: ");
			num = scanner.nextInt();
			
			if(num%3 == 0 && num != 0) {
				soma += num;
				quant ++;
			}
			
		}while (num != 0);
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + (soma/quant));
		
		scanner.close();
		
	}

}
