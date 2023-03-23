package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2CollectionStack {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();

		int opcao = 6;

		do {
		
			System.out.println("\n1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair\n");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
		
			case 1:
				livros.push(scanner.nextLine());
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				System.out.println("\nLista de livros: \n");
				for (var i : livros)	
					System.out.println(i);
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
					break;
				}
	
				livros.pop();
				System.out.println("\nUm livro foi retirado!");
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
