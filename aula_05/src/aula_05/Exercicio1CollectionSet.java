package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1CollectionSet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> num = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			num.add(scanner.nextInt());	
		}
		
		Iterator<Integer> iNum = num.iterator();

		while (iNum.hasNext()) {
			System.out.println(iNum.next());
			
		}
		
		scanner.close();
		
	}

}
