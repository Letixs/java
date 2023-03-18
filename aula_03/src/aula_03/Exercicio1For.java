package aula_03;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numMn = 0;
		int numMa = 0;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numMn = scanner.nextInt();
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numMa = scanner.nextInt();
		
		if(numMa < numMn) {
			System.out.println("O intervalo é inválido!");
			System.exit(0);
		}
		
		for(int i = numMn; i <= numMa; i ++) {
			
			if(i%3 == 0 && i%5 == 0)
				System.out.println(i + " é múltiplo de 3 e 5");
			
		}
		
		scanner.close();
	}

}
