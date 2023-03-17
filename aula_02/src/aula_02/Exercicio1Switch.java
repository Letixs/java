package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio1Switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		int codigo, quant;
		
		System.out.println("Bem Vindo! Consulte o cardápio");
		System.out.println("Código do produto     Produto     Preço Unitário"
				+ "\n 1\t\t Cachorro Quente\t R$10,00"
				+ "\n 2\t\t X-Salada\t\t R$15.00"
				+ "\n 3\t\t X-Bacon\t\t R$18,00"
				+ "\n 4\t\t Bauru\t\t\t R$12,00"
				+ "\n 5\t\t Refrigerante\t\t R$8,00"
				+ "\n 6\t\t Suco de Laranja\t R$13,00");
		
		System.out.println("Digite o número do seu pedido: ");
		codigo = leia.nextInt();
		
		System.out.println("Quantidade desejada: ");
		quant = leia.nextInt();
		
		switch(codigo) {
		
		case 1: System.out.println("Produto: Cachorro Quente\nValor Total: " + nfMoeda.format(quant * 10));
			break;
		case 2: System.out.println("Produto: X-Salada\nValor Total: " + nfMoeda.format(quant * 15));
			break;
		case 3: System.out.println("Produto: X-Bacon\nValor Total: " + nfMoeda.format(quant * 18));
			break;
		case 4: System.out.println("Produto: Bauru\nValor Total: " + nfMoeda.format(quant * 12));
			break;
		case 5: System.out.println("Produto: Refrigerante\nValor Total: " + nfMoeda.format(quant * 8));
			break;
		case 6: System.out.println("Produto: Suco de Laranja\nValor Total: " + nfMoeda.format(quant * 13));
			break;
		default:
			System.out.println("Opção Inválida!");
		}
		
	}
	
}
