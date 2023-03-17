package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3Switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		float numero1, numero2;
		int operacao;
		
	
		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		numero2 = leia.nextFloat();

		System.out.println("Tabela de operações"
				+ "\n 1\t Soma"
				+ "\n 2\t Subtração"
				+ "\n 3\t Multiplicação"
				+ "\n 4\t Divisão");
		
		System.out.println("Operação: ");
		operacao = leia.nextInt();
		
		switch (operacao){
		case 1:
			System.out.println (numero1 + "+" + numero2 + "=" + df.format(numero1 + numero2));
			break;
		case 2:
			System.out.println (numero1 + "-" + numero2 + "=" + df.format(numero1 - numero2));
			break;
		case 3:
			System.out.println (numero1 + "*" + numero2 + "=" + df.format(numero1 * numero2));
			break;
		case 4:
			System.out.println (numero1 + "/" + numero2 + "=" + df.format(numero1 / numero2));
			break;
		default:
			System.out.println("Operação Inválida!");
		}
		
		leia.close();
	}

}
