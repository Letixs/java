package aula_04;

import java.util.Scanner;

public class Exercicio2Matriz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float notas [][] = new float [10][4];
		float media = 0;
		float medias [] = new float [10];
		
		for (int iLinha = 0; iLinha < notas.length; iLinha ++) {
			
			for (int iColuna = 0; iColuna < notas[iLinha].length; iColuna ++) {
				System.out.println("Digite um número: ");
				notas[iLinha][iColuna] = scanner.nextFloat();
				
				media += notas[iLinha][iColuna];
				medias[iLinha] = media/4;	

				
				}
			
		
		}
		
		for(float i : medias) {
			System.out.println(medias);
		}
		
		scanner.close();
		
	}

}
