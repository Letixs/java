package aula_03;

import java.util.Scanner;

public class Exercicio1While {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int idade = 0;
		int totalMn = 0;
		int totalMa = 0;
		
		while (idade >= 0) {
			
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			
			if(idade < 21 && idade > 0)
				totalMn ++;
			if(idade > 50)
				totalMa ++;
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + totalMn);
		System.out.println("Total de pessoas maiores de 50 anos:" + totalMa);
		
		scanner.close();
		
	}

}
