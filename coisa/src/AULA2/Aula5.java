package AULA2;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		System.out.println("Digite números inteiros para calcular a média.");
		System.out.println("Digite um número negativo para parar a entrada.");
		int numero;
		while (true) {
			System.out.print("Digite um número: ");
			numero = input.nextInt();
			if (numero < 0) {
				break;
				// Sai do loop se o número for negativo
			}
		}
		numeros.add(numero);
		// Adiciona o número à lista
		// isEmpty() da classe ArrayList para verificar se a lista está vazia,
		if (numeros.isEmpty()) {
			System.out.println("Nenhum número foi inserido.");
		} else {
			int soma = 0;
			for (int n : numeros) {
				soma += n;
			}
			double media = (double) soma / numeros.size();
			System.out.println("A média dos números inseridos é: " + media);

			input.close();
		}
	}
}