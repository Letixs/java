package aula_02;

import java.util.Scanner;

public class Exercicio1If {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		int soma = a + b;
	
		if (soma > c) {
			System.out.println("\n" + a + "+" + b + "=" + soma + ">" + c);
			System.out.println("A soma de A + B é maior do que C");
		}
		if (soma < c) {
			System.out.println("\n" + a + "+" + b + "=" + soma + "<" + c);
			System.out.println("A soma de A + B é menor do que C");
		}
		if (soma == c) {
			System.out.println("\n" + a + "+" + b + "=" + soma + "=" + c);
			System.out.println("A soma de A + B é igual a C");
		}
		
		leia.close();
	}

}
