package aula_04;

import java.util.Scanner;

public class Exercicio2Matriz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double notas [][] = {
				{ 4.0, 5.0, 7.0, 3.0 },
				{ 2.5, 6.5, 4.7, 8.0 },
				{ 10.0, 8.5, 9.5, 8.0 },
				{ 9.0, 6.5, 7.6, 8.2 },
				{ 5.0, 5.0, 5.0, 6.3 },
				{ 7.0, 8.0, 9.0, 8.5 },
				{ 5.5, 3.5, 2.5, 1.0 },
				{ 8.0, 9.0, 10.0, 9.5 },
				{ 5.6, 5.8, 6.5, 7.0 },
				{ 7.5, 8.5, 9.5, 10.0 }
		};
		float media = 0;
		float medias [] = new float [10];
		
		for (int i = 0; i < notas.length; i++) {
			media = 0;
			for (int c = 0; c < notas[i].length; c++) {
				System.out.println("--------------------------");
				System.out.println("Valor: " + notas[i][c]);
				System.out.println("--------------------------");
				media += notas[i][c];
			}
			medias[i] = media / notas[i].length;
		}
		
		for(float i : medias) {
			System.out.println(i);
		}
		
		scanner.close();
		
	}

}
