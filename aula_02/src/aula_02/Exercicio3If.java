package aula_02;

import java.util.Scanner;

public class Exercicio3If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade = -1;
		char doacao;
		boolean apto = false;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		
		do {
			try {
				
				idade = Integer.parseInt(leia.nextLine());
				if(idade < 0 || idade > 110)
					System.out.println("Informe uma idade válida!");
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Informe uma idade válida!");
			}
		} while (idade < 0 || idade > 110);		
		
		System.out.println("Primeira doação de sangue? (S/N) ");
	    doacao = leia.nextLine().charAt(0);
		
		if (doacao == 'S')
			apto = true;
		
		if (idade >= 60 && idade <= 69 )
			System.out.println(nome + " não está apto a doar!");
			
		
		leia.close();
	}

}
