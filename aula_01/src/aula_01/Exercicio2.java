package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
	
	 public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		nota4 = leia.nextFloat();
		
		float mediaNotas = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Média das notas: " + df.format(mediaNotas));
		
		leia.close();
		
	}
	
}
