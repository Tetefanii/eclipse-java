package AULA1;

import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
		// estrutura de repetição
		
		//contador => controla a qtd de laços i cont i++
		//acumulador => soma +=num
		//entrada => num
		//qtd => if
		
		Scanner entrada = new Scanner(System.in);
		int i = 0;
		int soma = 0;
		int qtdpares = 0;
		while(i<5) {
			System.out.println("Digite:");
			int num = entrada.nextInt();
			soma+=num;
			if(num%2==0) {
			qtdpares++;
			}
			
			i++;
		}
		System.out.println("Soma: "+soma);
		System.out.println("Quantidade: "+qtdpares);

	}

}
