package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1CollectionsQueue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao = 6;

		do {
		
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair\n");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
		
			case 1:
				fila.add(scanner.nextLine());
				System.out.println("\nCliente adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Clientes na fila: \n");
				for (var i : fila)	
					System.out.println(i);
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
					break;
				}	
				
					fila.poll();
					System.out.println("\nO Cliente foi chamado!");
				break;
			case 0:
				System.out.println("Programa finalizado!");
				System.exit(0);
			default:
				System.out.println("\nOpção Inválida!");
			}
		
			
		}while (opcao != 0);
		
		scanner.close();
		
	}

}
