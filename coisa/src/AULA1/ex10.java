package AULA1;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//criar um programa que mostre a tabuada de multiplicacao de 1 a 10 sem entrada
		
		for(int i = 1; i <=10; i++) {
		System.out.println("Tabuada do " + i);
		
		for(int j = 1; j <=10; j++) {
		System.out.println(i + " x " + j + " = " + (i * j));	
		}
		
		}
	}

}
