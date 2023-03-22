package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2CollectionList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int numE = 0;
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		
		try {
			numE = scanner.nextInt();
		}catch(Exception e) {
			System.out.println("Número inválido. Informe um número inteiro!");
			System.exit(0);
		}
		
		if(num.contains(numE))
			System.out.println("O número " + numE + " está localizado na posição: " + num.indexOf(numE));
		else
			System.out.println("O número " + numE + " não foi encontrado!");
		
		scanner.close();
		
	}

}
