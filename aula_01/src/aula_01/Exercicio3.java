package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		float salarioBrt, adicionalNot, horaEx, desconto;
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("Digite o salário bruto: ");
		salarioBrt = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicionalNot = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horaEx = leia.nextFloat();
		
		System.out.println("Digite os decontos: ");
		desconto = leia.nextFloat();
		
		float salarioLqd = salarioBrt + adicionalNot + (horaEx *5) - desconto;
		
		System.out.println("O salário líquido é: R$ " + df.format(salarioLqd));
	
		leia.close();
	}
}
