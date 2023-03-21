package aula_04;

import java.util.Scanner;

public class Exercicio1Matriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaP = 0;
		int somaS = 0;
		String diagonalP = "";
		String diagonalS = "";

		for (int iLinha = 0; iLinha < matriz.length; iLinha++) {

			for (int iColuna = 0; iColuna < matriz.length; iColuna++) {

				System.out.println("Digite um número: ");
				matriz[iLinha][iColuna] = scanner.nextInt();

			}
		}

		for (int contador = 0; contador < matriz.length; contador ++) {

			diagonalP += matriz[contador][contador] + " ";
			somaP += matriz[contador][contador];
			
			diagonalS += matriz[contador][matriz.length - 1 - contador] + " ";
			somaS += matriz[contador][matriz.length - 1 - contador];
		
		}
		
		System.out.println("Elementos da Diagonal Principal: " + diagonalP);

		System.out.println("Elementos da Diagonal Secundária: " + diagonalS);
	
		System.out.println("Soma de todos Elementos da Diagonal Principal: " + somaP);

		System.out.println("Soma de todos Elementos da Diagonal Secundária: " + somaS);
		
		scanner.close();
		
	}

}