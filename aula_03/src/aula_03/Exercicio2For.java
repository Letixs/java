package aula_03;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		int totalP = 0;
		int totalI = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o " + i + "º número: ");
			num = leia.nextInt();
			
			if(num%2 == 0)
				totalP ++;
			else
				totalI ++;
		
		}
		
		System.out.println("Total de números pares: " + totalP);
		System.out.println("Total de números ímpares: " + totalI);
		
		leia.close();
		
	}

}
