package AULA1;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Digite: ");
	 int opcao = entrada.nextInt();
	 switch(opcao) {
	 case 10:
		 System.out.println("DEZ");
		 break; 
	 case 20:
		 System.out.println("VINTE");
		 break; 
	 default:
		 System.out.println("Padrão");
	 }
	}

}
