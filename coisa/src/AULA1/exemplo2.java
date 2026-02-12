package AULA1;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		

		//Faça um programa que calcula a area de um triangulo peça base vezes altura
		 System.out.println("Digite primeiro numero inteiro: ");
		 double base = entrada.nextDouble();
		 
		 System.out.println("Digite segundo numero inteiro: ");
		 double altura = entrada.nextDouble();
		
		 double area = base*altura/2;
		 
		System.out.println("O resultado é: "+area);
	}
}