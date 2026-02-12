package AULA1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// Estrutura de seleção
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		if(num>10) {
			System.out.println("Numero é maior do que 10");
		}else if (num==10){
		System.out.println("Numero é igual do que 10");
	    }else
	    System.out.println("Numero é menor do que 10");

	}

}
