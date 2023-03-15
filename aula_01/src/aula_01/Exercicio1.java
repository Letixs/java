package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		float salario, abono;
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println("Novo salário: R$ " + df.format(novoSalario));
		
		leia.close();
	}
	
}
