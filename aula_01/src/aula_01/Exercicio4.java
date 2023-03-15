package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		
		float n1, n2, n3, n4;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();

		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();

		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();

		float calculo = (n1 * n2)-(n3 * n4);
		
		System.out.println("Resultado: " + df.format(calculo));
		
		leia.close();
		
	}

}
